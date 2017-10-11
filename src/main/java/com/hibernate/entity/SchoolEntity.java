package com.hibernate.entity;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-10-11
 * Time: 12:14
 * Description:
 */
@Entity
@Table(name = "school", schema = "hibernate", catalog = "")
public class SchoolEntity
{

    private int id;
    private String name;
    private String address;
    private String age;
    private Integer area;

    @Id
    @Column(name = "id", nullable = false)
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 80)
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 80)
    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Basic
    @Column(name = "age", nullable = true, length = 80)
    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    @Basic
    @Column(name = "area", nullable = true)
    public Integer getArea()
    {
        return area;
    }

    public void setArea(Integer area)
    {
        this.area = area;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        SchoolEntity that = (SchoolEntity) o;

        if (id != that.id)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;
        if (address != null ? !address.equals(that.address) : that.address != null)
            return false;
        if (age != null ? !age.equals(that.age) : that.age != null)
            return false;
        if (area != null ? !area.equals(that.area) : that.area != null)
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        return result;
    }
}
