package com.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

public class People {

    //如果显示定义了Autowired的required属性为false,说明这个对象可以为null,否则不允许为空
//    @Autowired
//    @Qualifier(value = "cat111")
    @Resource
    private cat cat;

//    @Autowired
//    @Qualifier(value = "dog111")
    @Resource
    private Dog dog;



    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

//    public com.pojo.cat getCat() {
//        return cat;
//    }
//
//
//    public void setCat(com.pojo.cat cat) {
//        this.cat = cat;
//    }
//
//    public Dog getDog() {
//        return dog;
//    }
//
//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private String name;
}
