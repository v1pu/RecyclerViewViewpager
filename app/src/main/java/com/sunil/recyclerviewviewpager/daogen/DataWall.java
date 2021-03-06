package com.sunil.recyclerviewviewpager.daogen;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "DATA_WALL".
 */
@Entity
public class DataWall {

    @Id
    private Long id;
    private int name_id;
    private String name;
    private String imageurl;

    @Generated(hash = 150755502)
    public DataWall() {
    }

    public DataWall(Long id) {
        this.id = id;
    }

    @Generated(hash = 115511314)
    public DataWall(Long id, int name_id, String name, String imageurl) {
        this.id = id;
        this.name_id = name_id;
        this.name = name;
        this.imageurl = imageurl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getName_id() {
        return name_id;
    }

    public void setName_id(int name_id) {
        this.name_id = name_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

}
