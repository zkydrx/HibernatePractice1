package com.hibernate.service;

import com.hibernate.pojo.SchoolPoJo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-10
 * Time: 10:49
 * Description:
 */
public interface SchoolService
{
    /**
     * insert the school
     * @param schoolPoJo
     * @return
     */
    boolean insert(SchoolPoJo schoolPoJo);

    /**
     * delete the school according to the address.
     * @param address
     * @return
     */
    void deleteByAddress(String address);

    /**
     * delete the school according to the id.
     * @param id
     * @return
     */
    void deleteById(int id);

    /**
     * delete the school according to the age.
     * @param age
     * @return
     */
    void deleteByAge(String age);

    /**
     * delete the school according to the name.
     * @param name
     * @return
     */
    void deleteByName(String name);


    /**
     * delete the school according to the area.
     * @param area
     * @return
     */
    void deleteByArea(String area);

    /**
     * delete the school according the area and the age.
     * @param area
     * @param age
     * @return
     */
    void deleteByAreaAndAge(String area,String age);

    /**
     * update the school according to the id.
     * @param id
     * @return
     */
    void updateById(int id,String address);

    /**
     * update the school according to the name
     * @param name
     * @return
     */
    void updateByName(String name,String address);

    /**
     * update the school according to the schoolPoJo
     * @param schoolPoJo
     * @return
     */
    void updateBySchoolPoJo(SchoolPoJo schoolPoJo);

    /**
     * update the school according to the address.
     * @param schoolPoJo
     * @return
     */
    void updateByAddress(SchoolPoJo schoolPoJo );

    /**
     * get all the school.
     * @return
     */
    List<SchoolPoJo> findAll();

    /**
     * find the school by address.
     * @param address
     * @return
     */
    List<SchoolPoJo> findAddress(String address);

    /**
     * get the School according to the age
     * @param age
     * @return
     */
    List<SchoolPoJo> findByAge(String age);


    /**
     * find the school by area.
     * @param area
     * @return
     */
    List<SchoolPoJo> findByArea(String area);

    /**
     * find the schools by area and age.
     * @param area
     * @param age
     * @return
     */
    List<SchoolPoJo> findByAreaAndAge(String area,String age);
}
