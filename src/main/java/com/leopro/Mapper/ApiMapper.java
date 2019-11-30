package com.leopro.Mapper;

import com.leopro.bean.Api;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ApiMapper {

    /**
     *  通过名称查找Api
     */
    @Select("select * from apis where name=#{name}")
    Api getByName(String name);
}
