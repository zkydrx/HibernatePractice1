package com.hibernate.pojo;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-10
 * Time: 10:47
 * Description:
 */
public class SchoolPoJo
{
    private int id;
    private String name;
    private String address;
    private String age;
    private Integer area;


    public SchoolPoJo()
    {
    }

    public SchoolPoJo(int id, String name, String address, String age, Integer area)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.area = area;
    }

    public SchoolPoJo(String name, String address, String age, Integer area)
    {
        this.name = name;
        this.address = address;
        this.age = age;
        this.area = area;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public Integer getArea()
    {
        return area;
    }

    public void setArea(Integer area)
    {
        this.area = area;
    }

    @Override
    public String toString()
    {
        return "SchoolPoJo{" + "id=" + id + ", name='" + name + '\'' + ", address='" + address + '\'' + ", age='" +
                age + '\'' + ", area='" + area + '\'' + '}';
    }
}
