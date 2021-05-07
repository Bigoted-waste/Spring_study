package com.my.MyProxyTest;

public class client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        UserService proxy =(UserService) pih.getProxy();
        proxy.add();
    }
}
