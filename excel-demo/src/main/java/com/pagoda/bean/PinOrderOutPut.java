package com.pagoda.bean;

import org.springframework.stereotype.Component;

/**
 * @author : litang
 * @date : Create in 2018/6/1
 */
@Component
public class PinOrderOutPut {

    /**
     * 序号
     */
    private Integer id;

    /**
     * 城市id
     */
    private String cityID;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 门店id
     */
    private String storeID;

    /**
     * 门店编号
     */
    private String storeNum;

    /**
     * 门店名称
     */
    private String storeName;

    /**
     * 商品名称
     */
    private String groupGoodsName;

    /**
     * 活动id
     */
    private String groupActivityId;

    /**
     * 手机
     */
    private String customerPhone;

    /**
     * 团单编号
     */
    private String groupOrderNum;

    /**
     * 订单金额
     */
    private String orderAmount;

    /**
     * 团状态
     */
    private String groupStatus;

    /**
     * 支付方式
     */
    private String payTheWay;

    /**
     * 下单时间
     */
    private String payTime;

    /**
     * 商户订单编号
     */
    private String MerchantOrders;

    /**
     * 团开始时间
     */
    private String groupBeaginTime;

    /**
     * 成团时间
     */
    private String groupSuccessTime;

    /**
     * 订单编号
     */
    private String orderNumber;

    /**
     * 应自提时间
     */
    private String shouldPickTime;

    /**
     * 实际自提时间
     */
    private String realPickTime;

    /**
     * 取消时间
     */
    private String cancelTime;

    /**
     * 取消原因
     */
    private String cancelReason;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public void setGroupActivityId(String groupActivityId) {
        this.groupActivityId = groupActivityId;
    }

    public String getStoreNum() {
        return storeNum;
    }

    public void setStoreNum(String storeNum) {
        this.storeNum = storeNum;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getGroupGoodsName() {
        return groupGoodsName;
    }

    public void setGroupGoodsName(String groupGoodsName) {
        this.groupGoodsName = groupGoodsName;
    }


    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getGroupOrderNum() {
        return groupOrderNum;
    }

    public void setGroupOrderNum(String groupOrderNum) {
        this.groupOrderNum = groupOrderNum;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus;
    }

    public String getPayTheWay() {
        return payTheWay;
    }

    public void setPayTheWay(String payTheWay) {
        this.payTheWay = payTheWay;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getMerchantOrders() {
        return MerchantOrders;
    }

    public void setMerchantOrders(String merchantOrders) {
        MerchantOrders = merchantOrders;
    }

    public String getGroupBeaginTime() {
        return groupBeaginTime;
    }

    public void setGroupBeaginTime(String groupBeaginTime) {
        this.groupBeaginTime = groupBeaginTime;
    }

    public String getGroupSuccessTime() {
        return groupSuccessTime;
    }

    public void setGroupSuccessTime(String groupSuccessTime) {
        this.groupSuccessTime = groupSuccessTime;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getShouldPickTime() {
        return shouldPickTime;
    }

    public void setShouldPickTime(String shouldPickTime) {
        this.shouldPickTime = shouldPickTime;
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

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    @Override
    public String toString() {
        return "PinOrderOutPut{" +
                "id=" + id +
                ", cityID=" + cityID +
                ", cityName='" + cityName + '\'' +
                ", storeID=" + storeID +
                ", storeNum='" + storeNum + '\'' +
                ", storeName='" + storeName + '\'' +
                ", groupGoodsName='" + groupGoodsName + '\'' +
                ", groupActivityId=" + groupActivityId +
                ", customerPhone='" + customerPhone + '\'' +
                ", groupOrderNum='" + groupOrderNum + '\'' +
                ", orderAmount='" + orderAmount + '\'' +
                ", groupStatus='" + groupStatus + '\'' +
                ", payTheWay='" + payTheWay + '\'' +
                ", payTime='" + payTime + '\'' +
                ", MerchantOrders='" + MerchantOrders + '\'' +
                ", groupBeaginTime='" + groupBeaginTime + '\'' +
                ", groupSuccessTime='" + groupSuccessTime + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", shouldPickTime='" + shouldPickTime + '\'' +
                ", realPickTime='" + realPickTime + '\'' +
                ", cancelTime='" + cancelTime + '\'' +
                ", cancelReason='" + cancelReason + '\'' +
                '}';
    }
}
