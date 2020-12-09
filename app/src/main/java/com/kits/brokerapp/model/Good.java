package com.kits.brokerapp.model;

import android.os.Environment;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import static android.text.TextUtils.isEmpty;

public class Good implements Serializable {

    @SerializedName("GoodCode")
    private String GoodCode;
    @SerializedName("state")
    private String state;
    @SerializedName("GoodMainCode")
    private String GoodMainCode;
    @SerializedName("GoodSubCode")
    private String GoodSubCode;
    @SerializedName("MaxSellPrice")
    private String MaxSellPrice;
    @SerializedName("DefaultUnitValue")
    private String DefaultUnitValue;
    @SerializedName("Amount")
    private String Amount;
    @SerializedName("Amount1")
    private String Amount1;
    @SerializedName("Amount2")
    private String Amount2;

    @SerializedName("ReservedAmount")
    private String ReservedAmount;
    @SerializedName("SellPrice1")
    private String SellPrice1;
    @SerializedName("FactorAmount")
    private String FactorAmount;
    @SerializedName("Shortage")
    private String Shortage;
    @SerializedName("Price")
    private String Price;
    @SerializedName("Float1")
    private String Float1;
    @SerializedName("Float5")
    private String Float5;
    @SerializedName("GoodName")
    private String GoodName;
    @SerializedName("GoodExplain1")
    private String GoodExplain1;
    @SerializedName("GoodExplain2")
    private String GoodExplain2;
    @SerializedName("GoodExplain3")
    private String GoodExplain3;
    @SerializedName("GoodExplain4")
    private String GoodExplain4;
    @SerializedName("FirstBarCode")
    private String FirstBarCode;
    @SerializedName("ImageName")
    private String ImageName;
    @SerializedName("UnitName")
    private String UnitName;
    @SerializedName("Nvarchar1")
    private String Nvarchar1;
    @SerializedName("Nvarchar2")
    private String Nvarchar2;
    @SerializedName("Nvarchar10")
    private String Nvarchar10;
    @SerializedName("Nvarchar13")
    private String Nvarchar13;
    @SerializedName("Nvarchar20")
    private String Nvarchar20;
    @SerializedName("Date2")
    private String Date2;
    @SerializedName("Date1")
    private String Date1;
    @SerializedName("RowCode")
    private String RowCode;
    @SerializedName("Isbn")
    private String Isbn;
    @SerializedName("GoodType")
    private String GoodType;

    @SerializedName("Itam_Show")
    private String Itam_Show;

    @SerializedName("Check")
    private boolean Check;


    public String getGoodCode() {
        return GoodCode;
    }

    public void setGoodCode(String goodCode) {
        GoodCode = goodCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGoodMainCode() {
        return GoodMainCode;
    }

    public void setGoodMainCode(String goodMainCode) {
        GoodMainCode = goodMainCode;
    }

    public String getGoodSubCode() {
        return GoodSubCode;
    }

    public void setGoodSubCode(String goodSubCode) {
        GoodSubCode = goodSubCode;
    }

    public String getMaxSellPrice() {
        return MaxSellPrice;
    }

    public void setMaxSellPrice(String maxSellPrice) {
        MaxSellPrice = maxSellPrice;
    }

    public String getDefaultUnitValue() {
        return DefaultUnitValue;
    }

    public void setDefaultUnitValue(String defaultUnitValue) {
        DefaultUnitValue = defaultUnitValue;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getAmount1() {
        return Amount1;
    }

    public void setAmount1(String amount1) {
        Amount1 = amount1;
    }

    public String getAmount2() {
        return Amount2;
    }

    public void setAmount2(String amount2) {
        Amount2 = amount2;
    }

    public String getReservedAmount() {
        return ReservedAmount;
    }

    public void setReservedAmount(String reservedAmount) {
        ReservedAmount = reservedAmount;
    }

    public String getSellPrice1() {
        return SellPrice1;
    }

    public void setSellPrice1(String sellPrice1) {
        SellPrice1 = sellPrice1;
    }

    public String getFactorAmount() {
        return FactorAmount;
    }

    public void setFactorAmount(String factorAmount) {
        FactorAmount = factorAmount;
    }

    public String getShortage() {
        return Shortage;
    }

    public void setShortage(String shortage) {
        Shortage = shortage;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getFloat1() {
        return Float1;
    }

    public void setFloat1(String float1) {
        Float1 = float1;
    }

    public String getFloat5() {
        return Float5;
    }

    public void setFloat5(String float5) {
        Float5 = float5;
    }

    public String getGoodName() {
        return GoodName;
    }

    public void setGoodName(String goodName) {
        GoodName = goodName;
    }

    public String getGoodExplain1() {
        return GoodExplain1;
    }

    public void setGoodExplain1(String goodExplain1) {
        GoodExplain1 = goodExplain1;
    }

    public String getGoodExplain2() {
        return GoodExplain2;
    }

    public void setGoodExplain2(String goodExplain2) {
        GoodExplain2 = goodExplain2;
    }

    public String getGoodExplain3() {
        return GoodExplain3;
    }

    public void setGoodExplain3(String goodExplain3) {
        GoodExplain3 = goodExplain3;
    }

    public String getGoodExplain4() {
        return GoodExplain4;
    }

    public void setGoodExplain4(String goodExplain4) {
        GoodExplain4 = goodExplain4;
    }

    public String getFirstBarCode() {
        return FirstBarCode;
    }

    public void setFirstBarCode(String firstBarCode) {
        FirstBarCode = firstBarCode;
    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String imageName) {
        ImageName = imageName;
    }

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }

    public String getNvarchar1() {
        return Nvarchar1;
    }

    public void setNvarchar1(String nvarchar1) {
        Nvarchar1 = nvarchar1;
    }

    public String getNvarchar2() {
        return Nvarchar2;
    }

    public void setNvarchar2(String nvarchar2) {
        Nvarchar2 = nvarchar2;
    }

    public String getNvarchar10() {
        return Nvarchar10;
    }

    public void setNvarchar10(String nvarchar10) {
        Nvarchar10 = nvarchar10;
    }

    public String getNvarchar13() {
        return Nvarchar13;
    }

    public void setNvarchar13(String nvarchar13) {
        Nvarchar13 = nvarchar13;
    }

    public String getNvarchar20() {
        return Nvarchar20;
    }

    public void setNvarchar20(String nvarchar20) {
        Nvarchar20 = nvarchar20;
    }

    public String getDate2() {
        return Date2;
    }

    public void setDate2(String date2) {
        Date2 = date2;
    }

    public String getDate1() {
        return Date1;
    }

    public void setDate1(String date1) {
        Date1 = date1;
    }

    public String getRowCode() {
        return RowCode;
    }

    public void setRowCode(String rowCode) {
        RowCode = rowCode;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public String getGoodType() {
        return GoodType;
    }

    public void setGoodType(String goodType) {
        GoodType = goodType;
    }

    public String getItam_Show() {
        return Itam_Show;
    }

    public void setItam_Show(String itam_Show) {
        Itam_Show = itam_Show;
    }

    public boolean isCheck() {
        return Check;
    }

    public void setCheck(boolean check) {
        Check = check;
    }
}
