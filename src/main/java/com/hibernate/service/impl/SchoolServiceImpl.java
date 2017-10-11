package com.hibernate.service.impl;

import com.hibernate.dao.SchoolDao;
import com.hibernate.dao.impl.SchoolDaoImpl;
import com.hibernate.pojo.SchoolPoJo;
import com.hibernate.service.SchoolService;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-10
 * Time: 13:44
 * Description:
 */
public class SchoolServiceImpl implements SchoolService
{

    SchoolDao schoolDao = new SchoolDaoImpl();
    /**
     * insert the school
     *
     * @param schoolPoJo
     * @return
     */
    public boolean insert(SchoolPoJo schoolPoJo)
    {
        boolean insert = schoolDao.insert(schoolPoJo);
        return insert;
    }

    /**
     * delete the school according to the address.
     *
     * @param address
     * @return
     */
    public void deleteByAddress(String address)
    {
        schoolDao.deleteByAddress(address);
    }

    /**
     * delete the school according to the id.
     *
     * @param id
     * @return
     */
    public void deleteById(int id)
    {
        schoolDao.deleteById(id);
    }

    /**
     * delete the school according to the age.
     *
     * @param age
     * @return
     */
    public void deleteByAge(String age)
    {
        schoolDao.deleteByAge(age);
    }

    /**
     * delete the school according to the name.
     *
     * @param name
     * @return
     */
    public void deleteByName(String name)
    {
        schoolDao.deleteByName(name);
    }

    /**
     * delete the school according to the area.
     *
     * @param area
     * @return
     */
    public void deleteByArea(String area)
    {
        schoolDao.deleteByArea(area);
    }

    /**
     * delete the school according the area and the age.
     *
     * @param area
     * @param age
     * @return
     */
    public void deleteByAreaAndAge(String area, String age)
    {
        schoolDao.deleteByAreaAndAge(area,age);
    }

    /**
     * update the school according to the id.
     *
     * @param id
     * @return
     */
    public void updateById(int id,String address)
    {
        schoolDao.updateById(id,address);
    }

    /**
     * update the school according to the name
     *
     * @param name
     * @return
     */
    public void updateByName(String name,String address)
    {
        schoolDao.updateByName(name,address);
    }

    /**
     * update the school according to the schoolPoJo
     *
     * @param schoolPoJo
     * @return
     */
    public void updateBySchoolPoJo(SchoolPoJo schoolPoJo)
    {
        schoolDao.updateBySchoolPoJo(schoolPoJo);
    }

    /**
     * update the school according to the address.
     *
     * @param schoolPoJo
     * @return
     */
    public void updateByAddress(SchoolPoJo schoolPoJo)
    {
        schoolDao.updateByAddress(schoolPoJo);
    }

    /**
     * get all the school.
     *
     * @return
     */
    public List<SchoolPoJo> findAll()
    {
        List<SchoolPoJo> schoolDaoAll = schoolDao.findAll();
        return schoolDaoAll;
    }

    /**
     * find the school by address.
     *
     * @param address
     * @return
     */
    public List<SchoolPoJo> findAddress(String address)
    {
        List<SchoolPoJo> address1 = schoolDao.findAddress(address);
        return address1;
    }

    /**
     * get the School according to the age
     *
     * @param age
     * @return
     */
    public List<SchoolPoJo> findByAge(String age)
    {
        List<SchoolPoJo> byAge = schoolDao.findByAge(age);
        return byAge;
    }

    /**
     * find the school by area.
     *
     * @param area
     * @return
     */
    public List<SchoolPoJo> findByArea(String area)
    {
        List<SchoolPoJo> byArea = schoolDao.findByArea(area);
        return byArea;
    }

    /**
     * find the schools by area and age.
     *
     * @param area
     * @param age
     * @return
     */
    public List<SchoolPoJo> findByAreaAndAge(String area, String age)
    {
        List<SchoolPoJo> byAreaAndAge = schoolDao.findByAreaAndAge(area, age);
        return byAreaAndAge;
    }
}
