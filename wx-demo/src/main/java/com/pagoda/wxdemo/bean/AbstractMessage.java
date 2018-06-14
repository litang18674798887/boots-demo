package com.pagoda.wxdemo.bean;

public class AbstractMessage extends Message {

    /**
     * 消息id，64位整型
     */
    private Long msgId;

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }
}
