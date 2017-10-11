package com.hibernate.main;

import com.hibernate.pojo.SchoolPoJo;
import com.hibernate.service.SchoolService;
import com.hibernate.service.impl.SchoolServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-10
 * Time: 10:48
 * Description:
 */
public class TestsAll
{
    SchoolService schoolService = new SchoolServiceImpl();

    /**
     * test insert the data to the table.
     */
    @Test
    public void testInsert()
    {
        SchoolPoJo schoolPoJo = new SchoolPoJo("Stanford University", "American", "367", 10000);
        SchoolPoJo schoolPoJo1 = new SchoolPoJo("Stanford University1", "American1", "3671", 100001);
        SchoolPoJo schoolPoJo2 = new SchoolPoJo("Stanford University2", "American2", "3672", 100002);
        SchoolPoJo schoolPoJo3 = new SchoolPoJo("Stanford University3", "American3", "3673", 100003);
        for (int i = 0; i < 20; i++)
        {
            boolean insert = schoolService.insert(schoolPoJo);

            boolean insert1 = schoolService.insert(schoolPoJo1);

            boolean insert2 = schoolService.insert(schoolPoJo2);

            boolean insert3 = schoolService.insert(schoolPoJo3);
            boolean insert4 = schoolService.insert(new SchoolPoJo("1", "2", "3", 4));

            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            if (insert)
            {
                System.out.println("Successful");
            }
            else
            {
                System.out.println("Faild");
            }

            if (insert1)
            {
                System.out.println("Successful");
            }
            else
            {
                System.out.println("Faild");
            }

            if (insert2)
            {
                System.out.println("Successful");
            }
            else
            {
                System.out.println("Faild");
            }

            if (insert3)
            {
                System.out.println("Successful");
            }
            else
            {
                System.out.println("Faild");
            }

            if (insert4)
            {
                System.out.println("Successful");
            }
            else
            {
                System.out.println("Faild");
            }
        }

    }

    @Test
    public void testInsertForVeryTest()
    {
        SchoolPoJo schoolPoJo = new SchoolPoJo("beijingdaxue", "beijing", "100", 10000);
        for (int i = 0; i < 8; i++)
        {
            schoolPoJo = new SchoolPoJo("beijingdaxue", i+"shanghai"+i*i*i, "100" + i, 10000 + i * i);

            boolean insert = schoolService.insert(schoolPoJo);
            if (insert)
            {
                System.out.println("Successful to save");
            }
            else
            {
                System.out.println("Faild to save");
            }
        }
    }

    @Test
    public void testDeleteByAddress()
    {
        schoolService.deleteByAddress("beijing");
    }

    @Test
    public void testDeleteById()
    {
        schoolService.deleteById(106);
        schoolService.deleteById(107);
        schoolService.deleteById(108);
        schoolService.deleteById(109);
        schoolService.deleteById(110);
    }

    @Test
    public void testDeleteByAge()
    {
        schoolService.deleteByAge("1005");
    }

    @Test
    public void testDeleteByName()
    {
        schoolService.deleteByName("beijingdaxue");
    }

    @Test
    public void testDeleteByArea()
    {
        schoolService.deleteByArea("10009");
    }

    @Test
    public void testDeleteByAreaAndAge()
    {
        schoolService.deleteByAreaAndAge("10009", "1003");
    }


    @Test
    public void testUpdateById()
    {
        schoolService.updateById(496,"hangzhou");
    }

    @Test
    public void testUpdateByName()
    {
        schoolService.updateByName("beijingdaxue","beijing");
    }

    @Test
    public void testUpdateBySchoolPoJo()
    {
        SchoolPoJo schoolPoJo = new SchoolPoJo("zhejiangdaxue","hangzhou","120",10000);
        schoolService.updateBySchoolPoJo(schoolPoJo);
    }

    @Test
    public void testUpdateByAddress()
    {
        SchoolPoJo schoolPoJo = new SchoolPoJo("shanghaijiaotongdaxue","shanghai","100",12000);

        schoolService.updateByAddress(schoolPoJo);
    }


    /**
     * test select all data from the table.
     */
    @Test
    public void testFindAll()
    {
        List<SchoolPoJo> all = schoolService.findAll();
        System.out.println(all);
    }

    @Test
    public void testFindAddress()
    {
        List<SchoolPoJo> hangzhou = schoolService.findAddress("hangzhou");

        System.out.println(hangzhou);
    }

    @Test
    public void testFindByAge()
    {
        List<SchoolPoJo> byAge = schoolService.findByAge("120");

        System.out.println(byAge);
    }

    @Test
    public void testFindByArea()
    {
        List<SchoolPoJo> byArea = schoolService.findByArea("10000");

        System.out.println(byArea);
    }

    @Test
    public void testFindByAreaAndAge()
    {
        List<SchoolPoJo> byAreaAndAge = schoolService.findByAreaAndAge("10000", "110");

        System.out.println(byAreaAndAge);
    }
}
