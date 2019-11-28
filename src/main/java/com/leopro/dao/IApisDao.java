package com.leopro.dao;

import com.leopro.bean.Person;

import java.util.List;

/**
 *  接口dao类管理
 *  *后期修改为对应接口
 */
public interface IApisDao {
        /**
         *  查找所有的api
         */
        List<Person> listAllPerson();

        /**
         *  查找单个api
         */
        Person getPerson(Integer id);

        /**
         *  保存api
         */
        void savePerson(Person person);

        /**
         *  更新api
         */
        void updatePerson(Person person);

        /**
         *  删除api
         */
        void deletePerson(Integer id);

        /**
         *  通过名称查找api
         */
        Person getByName(String name);
}
