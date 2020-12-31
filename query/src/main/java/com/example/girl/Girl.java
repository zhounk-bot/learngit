package com.example.girl;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//定义一个实体类
@Entity
public class Girl {

    //声明一个实体类的属性映射为数据库的主键列
    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private Long id;
    private String cpuSize;
    private Integer age;


    public void setId(Long id) {
        this.id = id;
    }

    public String getCpuSize() {
        return cpuSize;
    }

    public void setCpuSize(String cpuSize) {
        this.cpuSize = cpuSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Girl() {
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id='" + id + '\'' +
                ", cpuSize='" + cpuSize + '\'' +
                ", age=" + age +
                '}';
    }

}
