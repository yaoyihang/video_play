package com.acode.player.lib.tablayout;

import java.io.Serializable;

/**
 * user:yaoyh
 * date:2018/4/261348
 * email:345709209@qq.com
 */
public class Tab implements Serializable{
    private int id;
    private String title;
    private String info;

    public int getId() {
        return id;
    }

    public Tab setId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Tab setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getInfo() {
        return info;
    }

    public Tab setInfo(String info) {
        this.info = info;
        return this;
    }

    @Override
    public String toString() {
        return "Tab{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
