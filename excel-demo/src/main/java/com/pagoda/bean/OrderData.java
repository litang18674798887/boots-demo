package com.pagoda.bean;

/**
 * @author : litang
 * @date : Create in 2018/6/1
 *
 * 订单customer数据
 *
 */
public class OrderData {

    /**
     * 订单id
     */
    private String goodsOrderId;

    /**
     * 商品订单编号
     */
    private String  goodsOrderNumber;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 商品id
     */
    private String goodsId;

    /**
     * 门店id
     */
    private String storeID;

    /**
     * 订单编号
     */
    private String orderNumber;

    /**
     * 支付方式
     */
    private String channel;

    /**
     * 订单金额
     */
    private String orderAmount;

    /**
     * 下单时间
     */
    private String payTime;

    /**
     * 自提开始时间
     */
    private String deliveryTimeBegin;

    /**
     * 订单配送时间
     */
    private String deliveryTime;

    /**
     * 实际自提时间
     */
    private String realPickTime;

    /**
     * 取消时间
     */
    private String cancelTime;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 团长id
     */
    private String openerID;

    /**
     * 团状态
     */
    private String groupStatus;

    public String getGoodsOrderId() {
        return goodsOrderId;
    }

    public void setGoodsOrderId(String goodsOrderId) {
        this.goodsOrderId = goodsOrderId;
    }

    public String getGoodsOrderNumber() {
        return goodsOrderNumber;
    }

    public void setGoodsOrderNumber(String goodsOrderNumber) {
        this.goodsOrderNumber = goodsOrderNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getDeliveryTimeBegin() {
        return deliveryTimeBegin;
    }

    public void setDeliveryTimeBegin(String deliveryTimeBegin) {
        this.deliveryTimeBegin = deliveryTimeBegin;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getRealPickTime() {
        return realPickTime;
    }

    public void setRealPickTime(String realPickTime) {
        this.realPickTime = realPickTime;
    }

    public String getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOpenerID() {
        return openerID;
    }

    public void setOpenerID(String openerID) {
        this.openerID = openerID;
    }

    public String getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus;
    }

    @Override
    public String toString() {
        return "OrderData{" +
                "goodsOrderId=" + goodsOrderId +
                ", goodsOrderNumber='" + goodsOrderNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", goodsId=" + goodsId +
                ", storeID=" + storeID +
                ", orderNumber='" + orderNumber + '\'' +
                ", channel='" + channel + '\'' +
                ", orderAmount='" + orderAmount + '\'' +
                ", payTime='" + payTime + '\'' +
                ", deliveryTimeBegin='" + deliveryTimeBegin + '\'' +
                ", deliveryTime='" + deliveryTime + '\'' +
                ", realPickTime='" + realPickTime + '\'' +
                ", cancelTime='" + cancelTime + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", openerID=" + openerID +
                ", groupStatus='" + groupStatus + '\'' +
                '}';
    }
}
