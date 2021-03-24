package com.kits.brokerapp.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Entity(tableName = "PreFactor")
public class PreFactor implements Serializable {

    @PrimaryKey
    @SerializedName("PreFactorCode")
    private String PreFactorCode;

    @SerializedName("PreFactorName")
    private String PreFactorName;


//    @SerializedName("PreFactorKowsarCode")
//    private String PreFactorKowsarCode;
//    @SerializedName("PreFactorDate")
//    private String PreFactorDate;
//    @SerializedName("PreFactorTime")
//    private String PreFactorTime;
//    @SerializedName("PreFactorkowsarDate")
//    private String PreFactorkowsarDate;
//    @SerializedName("PreFactorExplain")
//    private String PreFactorExplain;
//
//
//    private String Customer;
//    private String SumPrice;
//    private String SumAmount;
//    private String RowCount;
//    private String Act;
//    private String LastCode;
//    private String LastFactor;
//
//
//    public String getPreFactorCode() {
//        return PreFactorCode;
//    }
//
//    public void setPreFactorCode(String preFactorCode) {
//        PreFactorCode = preFactorCode;
//    }
//
//    public String getPreFactorKowsarCode() {
//        return PreFactorKowsarCode;
//    }
//
//    public void setPreFactorKowsarCode(String preFactorKowsarCode) {
//        PreFactorKowsarCode = preFactorKowsarCode;
//    }
//
//    public String getPreFactorDate() {
//        return PreFactorDate;
//    }
//
//    public void setPreFactorDate(String preFactorDate) {
//        PreFactorDate = preFactorDate;
//    }
//
//    public String getPreFactorTime() {
//        return PreFactorTime;
//    }
//
//    public void setPreFactorTime(String preFactorTime) {
//        PreFactorTime = preFactorTime;
//    }
//
//    public String getPreFactorkowsarDate() {
//        return PreFactorkowsarDate;
//    }
//
//    public void setPreFactorkowsarDate(String preFactorkowsarDate) {
//        PreFactorkowsarDate = preFactorkowsarDate;
//    }
//
//    public String getPreFactorExplain() {
//        return PreFactorExplain;
//    }
//
//    public void setPreFactorExplain(String preFactorExplain) {
//        PreFactorExplain = preFactorExplain;
//    }
//
//    public String getCustomer() {
//        return Customer;
//    }
//
//    public void setCustomer(String customer) {
//        Customer = customer;
//    }
//
//    public String getSumPrice() {
//        return SumPrice;
//    }
//
//    public void setSumPrice(String sumPrice) {
//        SumPrice = sumPrice;
//    }
//
//    public String getSumAmount() {
//        return SumAmount;
//    }
//
//    public void setSumAmount(String sumAmount) {
//        SumAmount = sumAmount;
//    }
//
//    public String getRowCount() {
//        return RowCount;
//    }
//
//    public void setRowCount(String rowCount) {
//        RowCount = rowCount;
//    }
//
//    public String getAct() {
//        return Act;
//    }
//
//    public void setAct(String act) {
//        Act = act;
//    }
//
//    public String getLastCode() {
//        return LastCode;
//    }
//
//    public void setLastCode(String lastCode) {
//        LastCode = lastCode;
//    }
//
//    public String getLastFactor() {
//        return LastFactor;
//    }
//
//    public void setLastFactor(String lastFactor) {
//        LastFactor = lastFactor;
//    }
}
