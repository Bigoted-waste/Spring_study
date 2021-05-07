package com.config;

import com.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration  //这个也会被spring容器托管，注册到容器中，应为他本来就是一个@Component
                //@Configuration代表一个配置类，就和我们之前看得beans,xml一样
@ComponentScan("com.pojo")
@Import(MyConfig2.class)
public class MyConfig {

    //注册一个bean就相当于我们之前写的一个bean标签
    //这个方法的名字，就像相当于bean标签的id属性
    //这个方法的返回值，就像相当于bean标签的class属性
    @Bean
    public User getUser(){
        return new User();  //就是返回要注入到bean的对象
    }
}
