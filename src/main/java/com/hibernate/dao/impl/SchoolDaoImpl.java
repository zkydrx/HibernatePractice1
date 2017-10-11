package com.hibernate.dao.impl;

import com.hibernate.dao.SchoolDao;
import com.hibernate.entity.SchoolEntity;
import com.hibernate.pojo.SchoolPoJo;
import com.hibernate.utils.SessionFactoryUtil;
import com.hibernate.utils.SessionUtil;
import com.tyd.util.BeanMapper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-10
 * Time: 13:44
 * Description:
 */
public class SchoolDaoImpl implements SchoolDao
{
    SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
    Session session = SessionUtil.getSession();

    BeanMapper beanMapper = new BeanMapper();
    /**
     * insert the school
     *
     * @param schoolPoJo
     * @return
     */
    public boolean insert(SchoolPoJo schoolPoJo)
    {
        Transaction transaction = session.getTransaction();

        try
        {
            transaction.begin();
            BeanMapper beanMapper = new BeanMapper();
            SchoolEntity schoolEntity = beanMapper.map(schoolPoJo, SchoolEntity.class);
            Serializable save = session.save(schoolEntity);
            session.flush();
            session.clear();
            transaction.commit();
            if(save != null)
            {
                return true;
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
            transaction.rollback();
        }
        return false;

    }

    /**
     * delete the school according to the address.
     *
     * @param address
     * @return
     */
    public void deleteByAddress(String address)
    {
        try
        {
            session.beginTransaction();
            String s = "from SchoolEntity u where u.address = ?";

            Query query = session.createQuery(s);
            query.setParameter(0,address);
            List<SchoolEntity> resultList = query.getResultList();
            for (int i = 0; i < resultList.size(); i++)
            {
                session.delete(resultList.get(i));
            }
            session.flush();
            session.clear();
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally
        {
            session.close();
        }
    }

    /**
     * delete the school according to the id.
     *
     * @param id
     * @return
     */
    public void deleteById(int id)
    {
        try
        {
            session.beginTransaction();
            String s = "from SchoolEntity u where u.id = ?";
            Query query = session.createQuery(s);
            query.setParameter(0,id);
            List<SchoolEntity> resultList = query.getResultList();
            for (int i = 0; i < resultList.size(); i++)
            {
                session.delete(resultList.get(i));
            }
            session.flush();
            session.clear();
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }

    }

    /**
     * delete the school according to the age.
     *
     * @param age
     * @return
     */
    public void deleteByAge(String age)
    {
        try
        {
            session.beginTransaction();
            String s = "from SchoolEntity u where u.age > ?";
            Query query = session.createQuery(s);
            query.setParameter(0,age);
            List<SchoolEntity> resultList = query.getResultList();
            for (int i = 0; i < resultList.size(); i++)
            {
                session.delete(resultList.get(i));
            }
            session.flush();
            session.clear();
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    /**
     * delete the school according to the name.
     *
     * @param name
     * @return
     */
    public void deleteByName(String name)
    {
        try
        {
            session.beginTransaction();
            String s = "from SchoolEntity s where s.name like ?";
            Query query = session.createQuery(s);
            query.setParameter(0,"%"+name+"%");
            List<SchoolEntity> resultList = query.getResultList();
            for (int i = 0; i < resultList.size(); i++)
            {
                session.delete(resultList.get(i));
            }
            session.flush();
            session.clear();
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    /**
     * delete the school according to the area.
     *
     * @param area
     * @return
     */
    public void deleteByArea(String area)
    {
        try
        {
            session.beginTransaction();
            String s = "from SchoolEntity u where u.area > ?";

            Query query = session.createQuery(s);
            int parseInt = Integer.parseInt(area);
            query.setParameter(0, parseInt);
            List<SchoolEntity> resultList = query.getResultList();
            for (int i = 0; i < resultList.size(); i++)
            {
                session.delete(resultList.get(i));
            }
            session.flush();
            session.clear();
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
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
        try
        {
            session.beginTransaction();
            String s = " from SchoolEntity u where u.area > ? and u.age > ?";
            Query query = session.createQuery(s);
            query.setParameter(0,Integer.parseInt(area));
            query.setParameter(1,age);
            List<SchoolEntity> resultList = query.getResultList();
            for (int i = 0; i < resultList.size(); i++)
            {
                session.delete(resultList.get(i));

            }
            session.flush();
            session.clear();
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    /**
     * update the school according to the id.
     *
     * @param id
     * @return
     */
    public void updateById(int id,String address)
    {
        try
        {
            session.beginTransaction();
            String s = "from SchoolEntity u where u.id =:_id";
            Query query = session.createQuery(s);
            query.setParameter("_id",id);
            List<SchoolEntity> resultList = query.getResultList();
            for (int i = 0; i < resultList.size(); i++)
            {
                resultList.get(i).setAddress(address);
                session.update(resultList.get(i));
            }
            session.flush();
            session.clear();
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally
        {
            session.close();
        }
    }


    /**
     * update the school according to the name
     *
     * @param name
     * @return
     */
    public void updateByName(String name,String address)
    {
        try
        {
            session.beginTransaction();
            String s = "from SchoolEntity u where u.name like  :_name";
            Query query = session.createQuery(s);
            query.setParameter("_name","%"+name+"%");
            List<SchoolEntity> resultList = query.getResultList();
            for (int i = 0; i < resultList.size(); i++)
            {
                resultList.get(i).setAddress(address);
                session.update(resultList.get(i));
            }
            session.flush();
            session.clear();
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally
        {
            session.close();
        }
    }

    /**
     * update the school according to the schoolPoJo
     *
     * @param schoolPoJo
     * @return
     */
    public void updateBySchoolPoJo(SchoolPoJo schoolPoJo)
    {
        try
        {
            session.beginTransaction();
            String s = "from SchoolEntity u where u.area > ?";
            Query query = session.createQuery(s);
            query.setParameter(0,schoolPoJo.getArea());
            List<SchoolEntity> resultList = query.getResultList();
            SchoolEntity schoolEntity = beanMapper.map(schoolPoJo, SchoolEntity.class);
            String ss = "update SchoolEntity u set u.area=?,u.name=?,u.address=?,u.age=? where u.id =?";
            Query query1 = session.createQuery(ss);
            for (int i = 0; i < resultList.size(); i++)
            {
                SchoolEntity schoolEntity1 = resultList.get(i);
                /**
                 * if execute a lot of data should add batch and should use executeUpdate(String id,Object)
                 * It equals executeBatch();
                 */
                query1.setParameter(0,schoolEntity.getArea());
                query1.setParameter(1,schoolEntity.getName());
                query1.setParameter(2,schoolEntity.getAddress());
                query1.setParameter(3,schoolEntity.getAge());
                query1.setParameter(4,schoolEntity1.getId());
                query1.executeUpdate();

            }
            session.flush();
            session.clear();
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally
        {
            session.close();
        }
    }

    /**
     * update the school according to the address.
     *
     * @param schoolPoJo
     * @return
     */
    public void updateByAddress(SchoolPoJo schoolPoJo)
    {
        try
        {
            session.beginTransaction();
            String s = "from SchoolEntity u where u.address like ?";
            Query query = session.createQuery(s);
            query.setParameter(0,"%"+schoolPoJo.getAddress()+"%");
            List<SchoolEntity> resultList = query.getResultList();

            String ss = "update SchoolEntity u set u.name=:_name,u.age=:_age,u.area=:_area where u.id=:_id";
            Query query1 = session.createQuery(ss);
            for (int i = 0; i < resultList.size(); i++)
            {
                query1.setParameter("_name",schoolPoJo.getName());
                query1.setParameter("_age",schoolPoJo.getAge());
                query1.setParameter("_area",schoolPoJo.getArea());
                query1.setParameter("_id",resultList.get(i).getId());
                query1.executeUpdate();
            }
            session.flush();
            session.clear();
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally
        {
            session.close();
        }
    }

    /**
     * get all the school.
     *
     * @return
     */
    public List<SchoolPoJo> findAll()
    {
        /**
         * test the default cache session and it doesn't work rightly.
         * and I will be do it later.
         */
//        Session session = SessionUtil.getSession();
//        try
//        {
//            session.beginTransaction();
//            SchoolEntity schoolEntity = session.load(SchoolEntity.class, 1);
//            System.out.println("schoolEntity.name = "+schoolEntity.getName());
//            schoolEntity=session.load(SchoolEntity.class,11);
//            System.out.println("schoolEntity.name = "+schoolEntity.getName());
//            session.getTransaction().commit();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//            session.getTransaction().rollback();
//        }
//        finally
//        {
//            session.close();
//        }
        /**
         * select all the data from the table.
         */
        try
        {
            session.beginTransaction();
            String s = "from SchoolEntity";
            Query query = session.createQuery(s);
            List<SchoolEntity> resultList = query.getResultList();
            session.getTransaction().commit();
            List<SchoolPoJo> schoolPoJosList = beanMapper.map(resultList, SchoolPoJo.class);
            return schoolPoJosList;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally
        {
            session.close();
        }
        return null;
    }

    /**
     * find the school by address.
     *
     * @param address
     * @return
     */
    public List<SchoolPoJo> findAddress(String address)
    {
        try
        {
            session.beginTransaction();
            String s = "from SchoolEntity u where u.address=:_address";
            Query query = session.createQuery(s);
            query.setParameter("_address",address);
            List<SchoolEntity> resultList = query.getResultList();
            session.flush();
            session.clear();
            session.getTransaction().commit();
            List<SchoolPoJo> schoolPoJoList = beanMapper.map(resultList, SchoolPoJo.class);
            return schoolPoJoList;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally
        {
            session.close();
        }
        return null;
    }

    /**
     * get the School according to the age
     *
     * @param age
     * @return
     */
    public List<SchoolPoJo> findByAge(String age)
    {
        try
        {
            /**
             * if the compare data is number
             * and don't use the format like ":formate" or "?"
             * like this:"from SchoolEntity u where u.age > ?";
             * like this:"from SchoolEntity u where u.age > :_age";
             * and you should direct use the paragram connect the target string.
             * like this:"from SchoolEntity u where u.age > "+age;
             *
             */
            session.beginTransaction();
            String s = "from SchoolEntity u where u.age > "+age;
            Query query = session.createQuery(s);
            double aDouble = Double.parseDouble(age);
//            query.setParameter("_age","120");
            List<SchoolEntity> resultList = query.getResultList();
            session.flush();
            session.clear();
            session.getTransaction().commit();
            List<SchoolPoJo> schoolPoJoList = beanMapper.map(resultList, SchoolPoJo.class);
            return schoolPoJoList;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally
        {
            session.close();
        }
        return null;
    }

    /**
     * find the school by area.
     *
     * @param area
     * @return
     */
    public List<SchoolPoJo> findByArea(String area)
    {
        try
        {
            session.beginTransaction();
            String s = "from SchoolEntity  u where u.area >"+area;
            Query query = session.createQuery(s);
            List<SchoolEntity> resultList = query.getResultList();
            List<SchoolPoJo> schoolPoJoList = beanMapper.map(resultList, SchoolPoJo.class);
            session.flush();
            session.clear();
            session.getTransaction().commit();
            return schoolPoJoList;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally
        {
            session.close();
        }
        return null;
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
        try
        {
            session.beginTransaction();
            String s = "from SchoolEntity u where u.area >"+area+" and u.age < "+age;
            Query query = session.createQuery(s);
            List<SchoolEntity> resultList = query.getResultList();
            List<SchoolPoJo> schoolPoJoList= beanMapper.map(resultList, SchoolPoJo.class);
            session.flush();
            session.clear();
            session.getTransaction().commit();
            return schoolPoJoList;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally
        {
            session.close();
        }
        return null;
    }
}
