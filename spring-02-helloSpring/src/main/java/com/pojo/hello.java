package com.pojo;

public class hello {
    private String str;

    @Override
    public String toString() {
        return "hello{" +
                "str='" + str + '\'' +
                '}';
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
