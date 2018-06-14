package com.pagoda.wxdemo.bean;


/**
 * 视频类消息
 */
public class ThumbMediaAbstractMessage extends MediaAbstractMessage {

    /**
     * 通过素材管理中的接口上传多媒体文件，得到的id。
     */
    private String thumbMediaid;

    public String getThumbMediaid() {
        return thumbMediaid;
    }

    public void setThumbMediaid(String thumbMediaid) {
        this.thumbMediaid = thumbMediaid;
    }
}
