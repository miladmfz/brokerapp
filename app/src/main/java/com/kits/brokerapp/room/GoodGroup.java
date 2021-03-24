package com.kits.brokerapp.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Entity(tableName = "GoodGroup")
public class GoodGroup implements Serializable {

    @PrimaryKey
    @SerializedName("GoodGroupCode")
    private Integer GoodGroupCode;
    @SerializedName("GoodRef")
    private Integer GoodRef;
    @SerializedName("GoodGroupRef")
    private Integer GoodGroupRef;


}
