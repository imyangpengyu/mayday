package javaPart.bean;

import javax.xml.crypto.Data;

/**
 * @author ypy
 * @date 2018/1/20 13:58
 *
 * Dao中数据库相应的javaBean类
 */

public class LotteryUser {
    private int id;
    private String name;
    private String picturePatch;
    private String data;
    private int state;
    private int teamId;

    public LotteryUser(int id, String name, String picturePatch, String data, int state, int teamId) {
        this.id = id;
        this.name = name;
        this.picturePatch = picturePatch;
        this.data = data;
        this.state = state;
        this.teamId = teamId;
    }

    public LotteryUser() {
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", picturePatch='" + picturePatch + '\'' +
                ", data=" + data +
                ", state=" + state +
                ", timeId=" + teamId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicturePatch() {
        return picturePatch;
    }

    public void setPicturePatch(String picturePatch) {
        this.picturePatch = picturePatch;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}
