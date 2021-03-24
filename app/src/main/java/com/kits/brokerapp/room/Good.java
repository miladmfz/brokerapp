package com.kits.brokerapp.room;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Good  {


    @SerializedName("GoodCode")
    private String GoodCode;

    @SerializedName("GoodName")
    private String GoodName;

    @SerializedName("SellPrice")
    private String SellPrice;

    @SerializedName("Detail")
    private String Detail;

}
