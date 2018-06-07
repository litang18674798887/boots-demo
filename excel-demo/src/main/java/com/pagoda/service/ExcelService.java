package com.pagoda.service;

import com.google.common.collect.Lists;
import com.pagoda.bean.Goods;
import com.pagoda.bean.OrderData;
import com.pagoda.bean.PinOrderOutPut;
import com.pagoda.bean.Store;
import com.pagoda.excel.PoiExcelExportUtils;
import com.pagoda.excel.ReadExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.*;

/**
 * @author : litang
 * @date : Create in 2018/6/2
 */
@Service
public class ExcelService {


    @Autowired
    ReadExcel readExcel;

    public void excelData() {

        //订单信息
        List<OrderData> totalOrderDataList = new ArrayList<>();
        //读文件
        File file01 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\01.xls");
        totalOrderDataList.addAll(getOrderDataList(file01));

        //读文件
        File file02 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\02.xls");
        totalOrderDataList.addAll(getOrderDataList(file02));

        //读文件
        File file03 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\03.xls");
        totalOrderDataList.addAll(getOrderDataList(file03));

        //读文件
        File file04 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\04.xls");
        totalOrderDataList.addAll(getOrderDataList(file04));

        //读文件
        File file05 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\05.xls");
        totalOrderDataList.addAll(getOrderDataList(file05));

        //读文件
        File file06 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\06.xls");
        totalOrderDataList.addAll(getOrderDataList(file06));

        //读文件
        File file07 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\07.xls");
        totalOrderDataList.addAll(getOrderDataList(file07));

        //读文件
        File file08 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\08.xls");
        totalOrderDataList.addAll(getOrderDataList(file08));

        //读文件
        File file09 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\09.xls");
        totalOrderDataList.addAll(getOrderDataList(file09));

        //读文件
        File file10 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\10.xls");
        totalOrderDataList.addAll(getOrderDataList(file10));

        //读文件
        File file11 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\11.xls");
        totalOrderDataList.addAll(getOrderDataList(file11));

        //读文件
        File file12 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\12.xls");
        totalOrderDataList.addAll(getOrderDataList(file12));

        //读文件
        File file13 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\13.xls");
        totalOrderDataList.addAll(getOrderDataList(file13));

        //读文件
        File file14 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\14.xls");
        totalOrderDataList.addAll(getOrderDataList(file14));

        //读文件
        File file15 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\15.xls");
        totalOrderDataList.addAll(getOrderDataList(file15));

        //读文件
        File file16 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\16.xls");
        totalOrderDataList.addAll(getOrderDataList(file16));

        //读文件
        File file17 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\17.xls");
        totalOrderDataList.addAll(getOrderDataList(file17));

        //读文件
        File file18 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\18.xls");
        totalOrderDataList.addAll(getOrderDataList(file18));

        //读文件
        File file19 = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\order\\19.xls");
        totalOrderDataList.addAll(getOrderDataList(file19));

        System.out.println(totalOrderDataList);


        //********************************获取门店信息**********************************//
        File storeFile = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\门店信息.xls");
        List<Store> storeArrayList = new ArrayList<>();
        List storeList = readExcel.readExcel(storeFile);
        for (int i = 0; i < storeList.size(); i++) {
            List<String> data = (List<String>) storeList.get(i);
            Store store = new Store();
            store.setStoreID(data.get(0));
            store.setStoreNum(data.get(1));
            store.setStoreName(data.get(2));
            store.setCityName(data.get(3));
            storeArrayList.add(store);
        }
        Map<String, Store> storeMap = new HashMap<>();
        for (Store store : storeArrayList) {
            storeMap.put(store.getStoreID(), store);
        }

        //********************************商品信息*********************************//
        File goodsFile = new File("C:\\Users\\67382\\Desktop\\拼团日报1201-0531\\商品信息.xls");
        List<Goods> goodsList = new ArrayList<>();
        List goodsList2 = readExcel.readExcel(goodsFile);
        for (int i = 0; i < goodsList2.size(); i++) {
            List<String> goods2 = (List<String>) goodsList2.get(i);
            Goods goods = new Goods();
            goods.setId(goods2.get(0));
            goods.setName(goods2.get(1));
            goodsList.add(goods);
        }
        Map<String, Goods> goodsMap = new HashMap<>();
        for (Goods goods : goodsList) {
            goodsMap.put(goods.getId(), goods);
        }


        List<PinOrderOutPut> result = new ArrayList<>();

        /****************数据组装****************/
        int i = 0;
        for (OrderData orderData : totalOrderDataList) {
            PinOrderOutPut pinOrderOutPut = new PinOrderOutPut();
            pinOrderOutPut.setId(++i);
            pinOrderOutPut.setStoreID(orderData.getStoreID());
            pinOrderOutPut.setCustomerPhone(orderData.getPhoneNumber());
            pinOrderOutPut.setOrderAmount(orderData.getOrderAmount());
            String groupStatus = orderData.getGroupStatus();
            if ("PROCESS".equals(groupStatus)) {
                pinOrderOutPut.setGroupStatus("拼团中");
            } else if ("SUCCESS".equals(groupStatus)) {
                pinOrderOutPut.setGroupStatus("拼团成功");
            } else if ("FAILED".equals(groupStatus)) {
                pinOrderOutPut.setGroupStatus("拼团失败");
            }
            String channel = orderData.getChannel();
            if ("alipay".equals(channel)) {
                pinOrderOutPut.setPayTheWay("支付宝");
            } else if ("gb".equals(channel)) {
                pinOrderOutPut.setPayTheWay("果币支付");
            } else if ("wx".equals(channel)) {
                pinOrderOutPut.setPayTheWay("微信支付(App)");
            } else if ("wx_pub".equals(channel)) {
                pinOrderOutPut.setPayTheWay("微信支付(公众号)");
            } else {
                pinOrderOutPut.setPayTheWay("-");
            }
            pinOrderOutPut.setPayTime(orderData.getPayTime());
            pinOrderOutPut.setOrderNumber(orderData.getOrderNumber());
            pinOrderOutPut.setMerchantOrders(orderData.getOrderNumber());
            pinOrderOutPut.setOrderNumber(orderData.getGoodsOrderNumber());
            pinOrderOutPut.setRealPickTime(orderData.getRealPickTime());
            pinOrderOutPut.setCancelTime(orderData.getCancelTime());
            String orderStatus = orderData.getOrderStatus();
            if ("10".equals(orderStatus) || "21".equals(orderStatus)) {
                pinOrderOutPut.setCancelReason("用户取消");
            } else if ("22".equals(orderStatus)) {
                pinOrderOutPut.setCancelReason("客服取消");
            } else if ("19".equals(orderStatus) || "25".equals(orderStatus)) {
                pinOrderOutPut.setCancelReason("系统取消");
            }
            result.add(pinOrderOutPut);
        }
        for (PinOrderOutPut pinOrderOutPut : result) {
            if (pinOrderOutPut.getStoreID() != null) {
                Store store = storeMap.get(pinOrderOutPut.getStoreID());
                if (store != null) {
                    if (store.getStoreNum() != null) {
                        pinOrderOutPut.setStoreNum(store.getStoreNum());
                    }
                    if (store.getStoreName() != null) {
                        pinOrderOutPut.setStoreName(store.getStoreName());
                    }
                    if (store.getCityName() != null) {
                        pinOrderOutPut.setCityName(store.getCityName());
                    }
                }
            }
        }

        System.out.println(result);

        List<List<PinOrderOutPut>> partition = Lists.partition(result, 60000);
        for (List<PinOrderOutPut> pinOrderOutPuts : partition) {
            if (!pinOrderOutPuts.isEmpty()) {
                //生成报表
                String name = "拼团订单"+UUID.randomUUID().toString();
                String Path = "C:\\Users\\67382\\Desktop\\汇总\\"+name+".xls";
                PoiExcelExportUtils poiExcelExportUtils = new PoiExcelExportUtils(Path,"拼团订单");
                String[] titleName = {"序号","门店名称","门店编号","城市名称","订单金额","下单时间","订单编号","手机","支付方式","商户订单编号","自提时间","取消时间","取消原因","团状态"};
                String[] titleColumn = {"id","storeName","storeNum","cityName","orderAmount","payTime","orderNumber","customerPhone","payTheWay","MerchantOrders","realPickTime","cancelTime","cancelReason","groupStatus"};
                int[] titleSize = {25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25,25};
                poiExcelExportUtils.wirteExcelOutPut(titleColumn, titleName, titleSize, pinOrderOutPuts);
            }

        }











    }

    private List<OrderData> getOrderDataList(File file) {
        List list = readExcel.readExcel(file);
        List<OrderData> orderDataList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            List<String> data = (List<String>) list.get(i);
            System.out.println(data);
            int size = data.size();
            //一行数据长度
            System.out.println(size);
            OrderData orderData = new OrderData();
            //订单id
            orderData.setGoodsOrderId(data.get(0));
            orderData.setGoodsId(data.get(1));
            orderData.setGoodsOrderNumber(data.get(2));
            orderData.setPhoneNumber(data.get(3));
            orderData.setStoreID(data.get(4));
            orderData.setOrderNumber(data.get(5));
            orderData.setChannel(data.get(6));
            orderData.setOrderAmount(data.get(7));
            orderData.setPayTime(data.get(8));
            orderData.setDeliveryTimeBegin(data.get(9));
            orderData.setDeliveryTime(data.get(10));
            orderData.setRealPickTime(data.get(11));
            orderData.setCancelTime(data.get(12));
            orderData.setOrderStatus(data.get(13));
            orderData.setOpenerID(data.get(14));
            orderData.setGroupStatus(data.get(15));
            System.out.println(orderData);
            orderDataList.add(orderData);
        }

        return orderDataList;
    }
}
