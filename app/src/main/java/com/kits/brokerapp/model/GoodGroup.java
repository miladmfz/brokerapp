package com.kits.brokerapp.model;

import com.google.gson.annotations.SerializedName;

public class GoodGroup {

    @SerializedName("GoodGroupCode")
    private String GoodGroupCode;
    @SerializedName("Name")
    private String Name;
    @SerializedName("L1")
    private String L1;
    @SerializedName("L2")
    private String L2;
    @SerializedName("L3")
    private String L3;
    @SerializedName("L4")
    private String L4;
    @SerializedName("L5")
    private String L5;


    public String getGoodGroupCode() {
        return GoodGroupCode;
    }

    public void setGoodGroupCode(String goodGroupCode) {
        GoodGroupCode = goodGroupCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getL1() {
        return L1;
    }

    public void setL1(String l1) {
        L1 = l1;
    }

    public String getL2() {
        return L2;
    }

    public void setL2(String l2) {
        L2 = l2;
    }

    public String getL3() {
        return L3;
    }

    public void setL3(String l3) {
        L3 = l3;
    }

    public String getL4() {
        return L4;
    }

    public void setL4(String l4) {
        L4 = l4;
    }

    public String getL5() {
        return L5;
    }

    public void setL5(String l5) {
        L5 = l5;
    }
}
