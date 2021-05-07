package com.my.demo01;

import java.net.Proxy;

public class client {
    public static void main(String[] args) {
        //房东要租房子
        Host host=new Host();
        //代理  中介帮房东房子,但是？代理一般会有一些操作
        proxy proxy = new proxy(host);

        //你不用面对房东，直接找中介租房即可！
        proxy.rent();
    }
}
