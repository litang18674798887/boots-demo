package com.pagoda.wxdemo.bean;


public class ImageMessage extends MediaAbstractMessage {
    /**
     * 图片url
     */
    private String picUrl;

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}