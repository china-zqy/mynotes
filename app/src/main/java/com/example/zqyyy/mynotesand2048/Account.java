package com.example.zqyyy.mynotesand2048;

/**
 * Created by zqy on 2020/12/13.
 *

这是一个测试
 */
public class Account {
    private String name;
    private int imageId;
    public Account(String name, int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}


