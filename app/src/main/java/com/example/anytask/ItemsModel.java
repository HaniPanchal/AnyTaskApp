package com.example.anytask;

import java.io.Serializable;

public class ItemsModel implements Serializable {

    private String name;
    private String desc;
    private int img;

    public ItemsModel(String name,String desc,int img ) {
        this.name = name;
        this.desc = desc;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
