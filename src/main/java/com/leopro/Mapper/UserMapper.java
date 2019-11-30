package com.leopro.Mapper;

import com.leopro.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    /**
     *  通过名称获取用户数据
     */
    User getByName(String name);
}
