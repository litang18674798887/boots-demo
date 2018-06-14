package com.pagoda.wxdemo.bean;


/**
 * 媒体消息
 */
public class MediaAbstractMessage extends Message {

    /**
     * 消息id，64位整型
     */
    private Long msgId;

    /**
     * 通过素材管理中的接口上传多媒体文件，得到的id。
     */
    private String mediaId;

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }
}
