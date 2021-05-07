package com.my.demo04;


import com.my.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//自动生成代理类!

/**
 * Proxy：生成动态代理的实例的
 * InvocationHandler：调用处理程序，并返回一个结果
 */
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的一个接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //处理代理实例，并返回结果
    public Object getProxy(){
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader()
                , target.getClass().getInterfaces()     //getInterfaces()返回由此对象表示的类或接口实现的接口
                ,this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        //动态代理的本质，就是使用反射机制实现！
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
