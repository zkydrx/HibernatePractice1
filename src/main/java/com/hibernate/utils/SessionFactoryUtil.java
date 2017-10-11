package com.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-10
 * Time: 10:49
 * Description:
 */
public class SessionFactoryUtil
{
    public static SessionFactory getSessionFactory()
    {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }

    public static void main(String[] args)
    {
        SessionFactory sessionFactory = getSessionFactory();

        System.out.println(sessionFactory != null?"successful":"faild");
    }
}
