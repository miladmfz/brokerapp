package com.kits.brokerapp.room;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface GoodDao {


    @Query("SELECT GoodCode,Goodname,PreFactorCode FROM Good Join prefactor Limit 10")
    List<Join> getallGood() ;


}
