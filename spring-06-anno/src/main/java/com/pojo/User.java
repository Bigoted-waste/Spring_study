package com.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于 <bean id="user" class="com.pojo,User" />
//@Component 组件
@Component
@Scope("prototype")     //单例模式singleton 原型模式prototype
public class User {


    public String name;

    //相当于 <property name="name" value="jiangnan" />
    @Value("jiangnan")
    public void setName(String name) {
        this.name = name;
    }
}
