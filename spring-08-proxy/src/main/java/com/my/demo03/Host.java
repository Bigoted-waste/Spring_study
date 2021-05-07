package com.my.demo03;

//租房
public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
