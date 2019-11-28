package com.leopro.dao;

import com.leopro.bean.Person;

import java.util.List;

/**
 *  接口dao类管理
 *  *后期修改为对应接口
 */
public interface IApisDao {
        /**
         *  查找所有的问题数据
         */
        List<Person> listAllPerson();

        /**
         *  查找单个问题
         */
        Person getPerson(Integer id);

        /**
         *  保存问题
         */
        void savePerson(Person person);

        // 更新问题
        void updatePerson(Person person);

        // 删除问题
        void deletePerson(Integer id);

        // 通过名称查找数据
        Person getByName(String name);
}
