package com.bruce.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class SysPrivilege implements Serializable {

    private static final long serialVersionUID = 1561908338460L;


    /**
    * 主键
    * privilege id
    * isNullAble:0
    */
    private Long id;

    /**
    * privilege name
    * isNullAble:1
    */
    private String privilege;

    /**
    * privilege URL
    * isNullAble:1
    */
    private String privilegeUrl;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setPrivilege(String privilege){this.privilege = privilege;}

    public String getPrivilege(){return this.privilege;}

    public void setPrivilegeUrl(String privilegeUrl){this.privilegeUrl = privilegeUrl;}

    public String getPrivilegeUrl(){return this.privilegeUrl;}
    @Override
    public String toString() {
        return "SysPrivilege{" +
                "id='" + id + '\'' +
                "privilege='" + privilege + '\'' +
                "privilegeUrl='" + privilegeUrl + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private SysPrivilege set;

        private ConditionBuilder where;

        public UpdateBuilder set(SysPrivilege set){
            this.set = set;
            return this;
        }

        public SysPrivilege getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends SysPrivilege{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> privilegeList;

        public List<String> getPrivilegeList(){return this.privilegeList;}


        private List<String> fuzzyPrivilege;

        public List<String> getFuzzyPrivilege(){return this.fuzzyPrivilege;}

        private List<String> rightFuzzyPrivilege;

        public List<String> getRightFuzzyPrivilege(){return this.rightFuzzyPrivilege;}
        private List<String> privilegeUrlList;

        public List<String> getPrivilegeUrlList(){return this.privilegeUrlList;}


        private List<String> fuzzyPrivilegeUrl;

        public List<String> getFuzzyPrivilegeUrl(){return this.fuzzyPrivilegeUrl;}

        private List<String> rightFuzzyPrivilegeUrl;

        public List<String> getRightFuzzyPrivilegeUrl(){return this.rightFuzzyPrivilegeUrl;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Long id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyPrivilege (List<String> fuzzyPrivilege){
            this.fuzzyPrivilege = fuzzyPrivilege;
            return this;
        }

        public QueryBuilder fuzzyPrivilege (String ... fuzzyPrivilege){
            this.fuzzyPrivilege = solveNullList(fuzzyPrivilege);
            return this;
        }

        public QueryBuilder rightFuzzyPrivilege (List<String> rightFuzzyPrivilege){
            this.rightFuzzyPrivilege = rightFuzzyPrivilege;
            return this;
        }

        public QueryBuilder rightFuzzyPrivilege (String ... rightFuzzyPrivilege){
            this.rightFuzzyPrivilege = solveNullList(rightFuzzyPrivilege);
            return this;
        }

        public QueryBuilder privilege(String privilege){
            setPrivilege(privilege);
            return this;
        }

        public QueryBuilder privilegeList(String ... privilege){
            this.privilegeList = solveNullList(privilege);
            return this;
        }

        public QueryBuilder privilegeList(List<String> privilege){
            this.privilegeList = privilege;
            return this;
        }

        public QueryBuilder fetchPrivilege(){
            setFetchFields("fetchFields","privilege");
            return this;
        }

        public QueryBuilder excludePrivilege(){
            setFetchFields("excludeFields","privilege");
            return this;
        }

        public QueryBuilder fuzzyPrivilegeUrl (List<String> fuzzyPrivilegeUrl){
            this.fuzzyPrivilegeUrl = fuzzyPrivilegeUrl;
            return this;
        }

        public QueryBuilder fuzzyPrivilegeUrl (String ... fuzzyPrivilegeUrl){
            this.fuzzyPrivilegeUrl = solveNullList(fuzzyPrivilegeUrl);
            return this;
        }

        public QueryBuilder rightFuzzyPrivilegeUrl (List<String> rightFuzzyPrivilegeUrl){
            this.rightFuzzyPrivilegeUrl = rightFuzzyPrivilegeUrl;
            return this;
        }

        public QueryBuilder rightFuzzyPrivilegeUrl (String ... rightFuzzyPrivilegeUrl){
            this.rightFuzzyPrivilegeUrl = solveNullList(rightFuzzyPrivilegeUrl);
            return this;
        }

        public QueryBuilder privilegeUrl(String privilegeUrl){
            setPrivilegeUrl(privilegeUrl);
            return this;
        }

        public QueryBuilder privilegeUrlList(String ... privilegeUrl){
            this.privilegeUrlList = solveNullList(privilegeUrl);
            return this;
        }

        public QueryBuilder privilegeUrlList(List<String> privilegeUrl){
            this.privilegeUrlList = privilegeUrl;
            return this;
        }

        public QueryBuilder fetchPrivilegeUrl(){
            setFetchFields("fetchFields","privilegeUrl");
            return this;
        }

        public QueryBuilder excludePrivilegeUrl(){
            setFetchFields("excludeFields","privilegeUrl");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public SysPrivilege build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> privilegeList;

        public List<String> getPrivilegeList(){return this.privilegeList;}


        private List<String> fuzzyPrivilege;

        public List<String> getFuzzyPrivilege(){return this.fuzzyPrivilege;}

        private List<String> rightFuzzyPrivilege;

        public List<String> getRightFuzzyPrivilege(){return this.rightFuzzyPrivilege;}
        private List<String> privilegeUrlList;

        public List<String> getPrivilegeUrlList(){return this.privilegeUrlList;}


        private List<String> fuzzyPrivilegeUrl;

        public List<String> getFuzzyPrivilegeUrl(){return this.fuzzyPrivilegeUrl;}

        private List<String> rightFuzzyPrivilegeUrl;

        public List<String> getRightFuzzyPrivilegeUrl(){return this.rightFuzzyPrivilegeUrl;}

        public ConditionBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyPrivilege (List<String> fuzzyPrivilege){
            this.fuzzyPrivilege = fuzzyPrivilege;
            return this;
        }

        public ConditionBuilder fuzzyPrivilege (String ... fuzzyPrivilege){
            this.fuzzyPrivilege = solveNullList(fuzzyPrivilege);
            return this;
        }

        public ConditionBuilder rightFuzzyPrivilege (List<String> rightFuzzyPrivilege){
            this.rightFuzzyPrivilege = rightFuzzyPrivilege;
            return this;
        }

        public ConditionBuilder rightFuzzyPrivilege (String ... rightFuzzyPrivilege){
            this.rightFuzzyPrivilege = solveNullList(rightFuzzyPrivilege);
            return this;
        }

        public ConditionBuilder privilegeList(String ... privilege){
            this.privilegeList = solveNullList(privilege);
            return this;
        }

        public ConditionBuilder privilegeList(List<String> privilege){
            this.privilegeList = privilege;
            return this;
        }

        public ConditionBuilder fuzzyPrivilegeUrl (List<String> fuzzyPrivilegeUrl){
            this.fuzzyPrivilegeUrl = fuzzyPrivilegeUrl;
            return this;
        }

        public ConditionBuilder fuzzyPrivilegeUrl (String ... fuzzyPrivilegeUrl){
            this.fuzzyPrivilegeUrl = solveNullList(fuzzyPrivilegeUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyPrivilegeUrl (List<String> rightFuzzyPrivilegeUrl){
            this.rightFuzzyPrivilegeUrl = rightFuzzyPrivilegeUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyPrivilegeUrl (String ... rightFuzzyPrivilegeUrl){
            this.rightFuzzyPrivilegeUrl = solveNullList(rightFuzzyPrivilegeUrl);
            return this;
        }

        public ConditionBuilder privilegeUrlList(String ... privilegeUrl){
            this.privilegeUrlList = solveNullList(privilegeUrl);
            return this;
        }

        public ConditionBuilder privilegeUrlList(List<String> privilegeUrl){
            this.privilegeUrlList = privilegeUrl;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private SysPrivilege obj;

        public Builder(){
            this.obj = new SysPrivilege();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder privilege(String privilege){
            this.obj.setPrivilege(privilege);
            return this;
        }
        public Builder privilegeUrl(String privilegeUrl){
            this.obj.setPrivilegeUrl(privilegeUrl);
            return this;
        }
        public SysPrivilege build(){return obj;}
    }

}
