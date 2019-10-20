package com.leopro.dao;

import com.leopro.bean.Person;

import java.util.List;

public interface IApisDao {
        // 查找所有的问题数据
        List<Person> findAllPerson();

        // 查找单个问题
        Person findPerson(Integer id);

        // 保存问题
        void savePerson(Person person);

        // 更新问题
        void updatePerson(Person person);

        // 删除问题
        void deletePerson(Integer id);

        // 通过名称查找数据
        Person findByName(String name);
}
