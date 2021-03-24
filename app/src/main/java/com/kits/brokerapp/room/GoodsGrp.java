package com.kits.brokerapp.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Entity(tableName = "GoodGroup")
public class GoodsGrp implements Serializable {

        @PrimaryKey
        @SerializedName("GoodGroupCode")
        private Integer GoodGroupCode;
        @SerializedName("GoodGroupName")
        private Integer GoodGroupName;

}
