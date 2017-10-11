package com.hibernate.utils;

import com.hibernate.entity.SchoolEntity;
import com.hibernate.pojo.SchoolPoJo;
import com.tyd.util.BeanMapper;
import com.tyd.util.MD5Util;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-10
 * Time: 13:45
 * Description:
 */
public class BeanMapperUtil
{
    public static void main(String[] args)
    {
        BeanMapper beanMapper = new BeanMapper();
        SchoolPoJo schoolPoJo = new SchoolPoJo();
        schoolPoJo.setId(1);
        schoolPoJo.setAddress("北京");
        schoolPoJo.setAge("120");
        schoolPoJo.setArea(20000);
        schoolPoJo.setName("清华大学");
        SchoolEntity schoolEntity = new SchoolEntity();
        SchoolEntity map = beanMapper.map(schoolPoJo, SchoolEntity.class);

        System.out.println(map);

        String zky = MD5Util.getMD5("zky");

        System.out.println("加密后："+zky);

    }
}
