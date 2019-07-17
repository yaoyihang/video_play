package com.acode.player.lib.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

/**
 * user:yaoyh
 * date:2018/4/261348
 * email:345709209@qq.com
 */
public class PlayerBean extends Observable implements Serializable {
    //视频的uri集合
    private ArrayList<String> playerUrls;

    //线路集合
    private ArrayList<String> lineNames;

    //视频名称
    private String title;

    //视频介绍
    private String info;

    //视频的封面图片地址
    private String imgUrl;

    //视频的当前播放时间
    private String currentTime;

    //视频的总时长
    private String endTime;

    //视频的上传地址
    private String url;

    //视频的上传进度
    private int uploadProgress;

    //当前的播放位置
    private long currentPosition;
    //当前视频的总长度
    private long duration;
    //当前视频的缓冲进度
    private int bufferedPercentage;

    private long ms;

    public PlayerBean() {
    }

    public long getMs() {
        return ms;
    }

    public PlayerBean setMs(long ms) {
        this.ms = ms;
        return this;
    }

    @Override
    public String toString() {
        return "PlayerBean{" +
                ", title='" + title + '\'' +
                ", playerUrls='" + playerUrls.toString() + '\'' +
                ", lineNames='" + lineNames.toString() + '\'' +
                ", info='" + info + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", currentTime=" + currentTime +
                ", endTime=" + endTime +
                ", url='" + url + '\'' +
                ", uploadProgress=" + uploadProgress +
                ", currentPosition=" + currentPosition +
                ", duration=" + duration +
                ", bufferedPercentage=" + bufferedPercentage +
                '}';
    }

    public ArrayList<String> getLineNames() {
        return lineNames;
    }

    public PlayerBean setLineNames(ArrayList<String> lineNames) {
        this.lineNames = lineNames;
        return this;
    }

    public ArrayList<String> getPlayerUrls() {
        return playerUrls;
    }

    public PlayerBean setPlayerUrls(ArrayList<String> playerUrls) {
        this.playerUrls = playerUrls;
        return this;
    }

    public int getBufferedPercentage() {
        return bufferedPercentage;
    }

    public PlayerBean setBufferedPercentage(int bufferedPercentage) {
        this.bufferedPercentage = bufferedPercentage;
        return this;
    }

    public long getDuration() {
        return duration;
    }

    public PlayerBean setDuration(long duration) {
        this.duration = duration;
        return this;
    }

    public long getCurrentPosition() {
        return currentPosition;
    }

    public PlayerBean setCurrentPosition(long currentPosition) {
        this.currentPosition = currentPosition;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public PlayerBean setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getInfo() {
        return info;
    }

    public PlayerBean setInfo(String info) {
        this.info = info;
        return this;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public PlayerBean setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public PlayerBean setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public PlayerBean setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public PlayerBean setUrl(String url) {
        this.url = url;
        return this;
    }

    public int getUploadProgress() {
        return uploadProgress;
    }

    public PlayerBean setUploadProgress(int uploadProgress) {
        this.uploadProgress = uploadProgress;
        return this;
    }
}
