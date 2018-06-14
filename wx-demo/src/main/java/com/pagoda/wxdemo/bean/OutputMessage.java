package com.pagoda.wxdemo.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class OutputMessage {

    @XStreamAlias("ToUserName")
    @XStreamCDATA
    private String toUserName;

    @XStreamAlias("FromUserName")
    @XStreamCDATA
    private String fromUserName;

    @XStreamAlias("CreateTime")
    private Long createTime;

    @XStreamAlias("MsgType")
    @XStreamCDATA
    private String msgType = "text";

    @XStreamAlias("Content")
    @XStreamCDATA
    private String content;

    @XStreamAlias("Image")
    @XStreamCDATA
    private ImageMessage imageMessage;

    @XStreamAlias("Voice")
    @XStreamCDATA
    private VoiceMessage voiceMessage;

    @XStreamAlias("Video")
    @XStreamCDATA
    private VideoMessage videoMessage;
    /**
     * 消息体
     * @param toUserName 客户方
     * @param fromUserName 服务方
     * @param createTime 创建时间
     * @param msgType 消息类型
     */
    public OutputMessage(String toUserName, String fromUserName, Long createTime, String msgType) {
        this.toUserName = toUserName;
        this.fromUserName = fromUserName;
        this.createTime = createTime;
        this.msgType = msgType;
//        if(message instanceof TextMessage){
//            this.textMessage = (TextMessage) message;
//        }else if(message instanceof ImageMessage){
//            this.imageMessage = (ImageMessage) message;
//        }else if(message instanceof VoiceMessage){
//            this.voiceMessage = (VoiceMessage) message;
//        }else if(message instanceof VideoMessage){
//            this.videoMessage = (VideoMessage) message;
//        }else if(message instanceof MusicMessage){
//            this.musicMessage = (MusicMessage) message;
//        }else if(message instanceof NewsMessage){
//            this.newsMessage = (NewsMessage) message;
//        }
    }

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public ImageMessage getImageMessage() {
        return imageMessage;
    }

    public void setImageMessage(ImageMessage imageMessage) {
        this.imageMessage = imageMessage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public VoiceMessage getVoiceMessage() {
        return voiceMessage;
    }

    public void setVoiceMessage(VoiceMessage voiceMessage) {
        this.voiceMessage = voiceMessage;
    }

    public VideoMessage getVideoMessage() {
        return videoMessage;
    }

    public void setVideoMessage(VideoMessage videoMessage) {
        this.videoMessage = videoMessage;
    }
}