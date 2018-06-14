package com.pagoda.wxdemo.bean;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class InputMessage implements Serializable {

	private static final long serialVersionUID = 1L;

	@XStreamAlias("ToUserName")
	private String toUserName;
	@XStreamAlias("FromUserName")
	private String fromUserName;
	@XStreamAlias("CreateTime")
	private Long createTime;
	@XStreamAlias("MsgType")
	private String msgType = "text";
	@XStreamAlias("Content")
	private String content;

	/*** 媒体类 ***/
	@XStreamAlias("MsgId")
	private Long msgId;
	@XStreamAlias("MediaId")
	private String mediaId;
	@XStreamAlias("PicUrl")
	// 图片消息 msgType = "image"
	private String picUrl;
	// 语音消息 msgType = "voice"
	@XStreamAlias("Format")
	private String format;
	@XStreamAlias("Recognition")
	private String recognition;
	// 视频消息 msgType ="video"，小视频msgType = "shortvideo"
	@XStreamAlias("ThumbMediaId")
	private String thumbMediaId;

	// 位置消息 msgType = "location";
	@XStreamAlias("Location_X")
	private String locationX;
	@XStreamAlias("Location_Y")
	private String locationY;
	@XStreamAlias("Scale")
	private String scale;
	@XStreamAlias("Label")
	private String label;

	// 链接消息 msgType = "link"
	@XStreamAlias("Title")
	private String title;
	@XStreamAlias("Description")
	private String description;
	@XStreamAlias("Url")
	private String url;

	/** 事件 */
	// msgType = "event"
	// 扫描带参数二维码事件
	// event = subscribe(订阅)、event = unsubscribe(取消订阅)
	@XStreamAlias("Event")
	private String event;
	// eventKey = qrscene_ 前缀扫描带参数的二维码
	@XStreamAlias("EventKey")
	private String eventKey;
	@XStreamAlias("Ticket")
	private String ticket;
	@XStreamAlias("MenuId")
	private String menuId;

	// 上报地理位置事件
	// event = LOCATION
	@XStreamAlias("Latitude")
	private String latitude;
	@XStreamAlias("Longitude")
	private String longitude;
	@XStreamAlias("Precision")
	private String precision;

	// 自定义菜单事件
	// event = CLICK 点击菜单拉取消息时的事件推送
	// event = VIEW 点击菜单跳转链接时的事件推送

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

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

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getRecognition() {
		return recognition;
	}

	public void setRecognition(String recognition) {
		this.recognition = recognition;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	public String getLocationX() {
		return locationX;
	}

	public void setLocationX(String locationX) {
		this.locationX = locationX;
	}

	public String getLocationY() {
		return locationY;
	}

	public void setLocationY(String locationY) {
		this.locationY = locationY;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPrecision() {
		return precision;
	}

	public void setPrecision(String precision) {
		this.precision = precision;
	}

	@Override
	public String toString() {
		return "InputMessage{" + "ToUserName='" + toUserName + '\'' + ", FromUserName='" + fromUserName + '\''
				+ ", CreateTime=" + createTime + ", MsgType='" + msgType + '\'' + ", Content='" + content + '\''
				+ ", MsgId=" + msgId + ", MediaId='" + mediaId + '\'' + ", PicUrl='" + picUrl + '\'' + ", Format='"
				+ format + '\'' + ", Recognition='" + recognition + '\'' + ", ThumbMediaId='" + thumbMediaId + '\''
				+ ", LocationX='" + locationX + '\'' + ", LocationY='" + locationY + '\'' + ", Scale='" + scale + '\''
				+ ", Label='" + label + '\'' + ", Title='" + title + '\'' + ", Description='" + description + '\''
				+ ", URL='" + url + '\'' + ", Event='" + event + '\'' + ", EventKey='" + eventKey + '\'' + ", Ticket='"
				+ ticket + '\'' + ", menuId='" + menuId + '\'' + ", Latitude='" + latitude + '\'' + ", Longitude='"
				+ longitude + '\'' + ", Precision='" + precision + '\'' + '}';
	}

}
