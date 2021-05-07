package com.my.demo01;

public class proxy implements Rent{
    private Host host;

    public proxy(Host host) {
        this.host = host;
    }

    public proxy() {
    }


    @Override
    public void rent() {
        seeHouse();
        host.rent();
        heTong();
        fare();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    //签合同
    public void heTong(){
        System.out.println("签租赁合同");
    }

    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}
