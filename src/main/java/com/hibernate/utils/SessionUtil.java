package com.hibernate.utils;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-10
 * Time: 10:53
 * Description:
 */
public class SessionUtil
{
    public static Session getSession()
    {
        Configuration configuration = new Configuration().configure();
        Session session = configuration.buildSessionFactory().openSession();
        return session;
    }

    public static void main(String[] args)
    {
        Session session = getSession();

        System.out.println(session != null?"successful":"faild");
    }
}
