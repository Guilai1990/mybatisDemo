package com.bruce.mapper;

import com.bruce.model.Country;
import com.bruce.model.SysRole;
import com.bruce.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * @Author: Bruce
 * @Date: 2019/6/30 9:47
 * @Version 1.0
 */
public class UserMapperTest extends BaseMapperTest {

    SqlSession sqlSession = getSqlSession();

    @Test
    public void testSelectById() {

        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser user = userMapper.selectById(1001L);
            Assert.assertNotNull(user);
            printUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testSelectAll() {

        try {
            /*List<SysUser> userList = sqlSession.selectList("com.bruce.mapper.UserMapper.selectAll");*/
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<SysUser> userList = userMapper.selectAll();
            Assert.assertTrue(userList.size() > 0);
            printUserList(userList);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectRolesByUserId() {
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<SysRole> roleList = userMapper.selectRolesById(1L);
            Assert.assertNotNull(roleList);
            Assert.assertTrue(roleList.size() > 0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testInsert() {
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = new SysUser();
            sysUser.setUserName("test1");
            sysUser.setUserPassword("123456");
            sysUser.setUserEmail("clq_0707@163.com");
            sysUser.setUserInfo("test info");
            sysUser.setHeadImg(new byte[] {1, 2, 3});
            sysUser.setCreateTime(new Date());
            int result = userMapper.insert(sysUser);
            System.out.printf("id: %s\n", sysUser.getId());
            Assert.assertEquals(1, result);
            Assert.assertNotNull(sysUser.getId());
        } finally {
            sqlSession.rollback();
            sqlSession.close();
        }
    }

    @Test
    public void testUpdateById() {
        SqlSession sqlSession = getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = userMapper.selectById(1L);
            Assert.assertEquals("admin", sysUser.getUserName());
            sysUser.setUserName("admin_test");
            sysUser.setUserEmail("clq_0707@163.com");
            int result = userMapper.updateById(sysUser);
            Assert.assertEquals(1, result);
            sysUser = userMapper.selectById(1L);
            Assert.assertEquals("admin_test", sysUser.getUserName());
        } finally {
            sqlSession.rollback();
            sqlSession.close();
        }
    }

    @Test
    public void testUpdateByIdSelective() {
        SqlSession sqlSession = getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = new SysUser();
            sysUser.setUserName("test-selective");
            sysUser.setUserPassword("123456");
            sysUser.setId(1L);
            int result = userMapper.updateByIdSelective(sysUser);
            Assert.assertEquals(1, result);
            sysUser = userMapper.selectById(1L);
            Assert.assertEquals("test-selective", sysUser.getUserName());
            Assert.assertEquals("372715854@qq.com", sysUser.getUserEmail());

        } finally {
            sqlSession.rollback();
            sqlSession.close();
        }
    }

    @Test
    public void testDeleteById() {
        SqlSession sqlSession = getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = userMapper.selectById(1L);
            Assert.assertNotNull(sysUser);
            Assert.assertEquals(1, userMapper.deleteById(1L));
            Assert.assertNull(userMapper.selectById(1L));
        } finally {
            sqlSession.rollback();
            sqlSession.close();
        }
    }

    @Test
    public void testSelectByIdOrUserName() {
        SqlSession sqlSession = getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser query = new SysUser();
            query.setId(1L);
            query.setUserName("admin");
            SysUser user = userMapper.selectByIdOrUserName(query);
            Assert.assertNotNull(user);
            query.setId(null);
            user = userMapper.selectByIdOrUserName(query);
            Assert.assertNotNull(user);
            query.setUserName(null);
            user = userMapper.selectByIdOrUserName(query);
            Assert.assertNull(user);
        } finally {
            sqlSession.rollback();
            sqlSession.close();
        }
    }

    @Test
    public void testSelectByIdList() {
        SqlSession sqlSession = getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<Long> idList = new ArrayList<Long>();
            idList.add(1L);
            idList.add(1007L);
            List<SysUser> userList = userMapper.selectByIdList(idList);
            Assert.assertEquals(2, userList.size());
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testInsertList() {
        SqlSession sqlSession = getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<SysUser> userList = new ArrayList<SysUser>();
            for (int i = 0; i < 2; i++) {
                SysUser user = new SysUser();
                user.setUserName("test" + i);
                user.setUserPassword("1234568888");
                user.setUserEmail("clq_0707@163.com");
                userList.add(user);
            }
            int result = userMapper.insertList(userList);
            Assert.assertEquals(2, result);
            for (SysUser user : userList) {
                System.out.println(user.getId());
            }
        } finally {
            sqlSession.rollback();
            sqlSession.close();
        }
    }

    @Test
    public void testUpdateByMap() {
        SqlSession sqlSession = getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("id", 1L);
            map.put("user_email", "clq_0707@163.com");
            map.put("user_password", "123567");
            userMapper.updateByMap(map);
            SysUser user = userMapper.selectById(1L);
            Assert.assertEquals("clq_0707@163.com", user.getUserEmail());
        } finally {
            sqlSession.rollback();
            sqlSession.close();
        }
    }

    private void printUserList(List<SysUser> userList) {
        for (SysUser user : userList) {
            System.out.printf("%-5d%10s%10s\n",
                    user.getId(),
                    user.getUserName(),
                    user.getUserInfo());
        }
    }

    private void printUser(SysUser user) {
        System.out.printf("%-5d%10s%10s\n", user.getId(), user.getUserName(), user.getCreateTime());
    }
}
