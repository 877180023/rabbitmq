package com.zking.rabbitmq.branch_01;

import java.io.Serializable;



public class B_test01 implements Serializable{

    private  Integer  shopId;
    private  String  shopName;
    private  String  shopType;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }





}
