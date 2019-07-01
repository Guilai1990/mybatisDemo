package com.bruce.mybatisspringboot.mapper;

import com.bruce.mybatisspringboot.model.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Bruce
 * @Date: 2019/7/1 13:16
 * @Version 1.0
 */
@Mapper
public interface CountryMapper {

    List<Country> selectAll();
}
