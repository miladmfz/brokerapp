package com.kits.brokerapp.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

public class Get_Shared {
    Context mContext;
    private SharedPreferences shPref;
    String response;
    SharedPreferences.Editor sEdit;


    @SuppressLint("CommitPrefEdits")
    public Get_Shared(Context context) {
        shPref = context.getSharedPreferences("BrokerShared", Context.MODE_PRIVATE);
        sEdit = shPref.edit();

    }
    
    public void Edit_SH(String Key ,String Value){
        sEdit.putString(Key, Value);
        sEdit.apply();
    }
    
    public String Read_SH(String Key){
        return shPref.getString(Key, "");
    }

    public boolean firstStart(){
        return shPref.getBoolean("firstStart", true);
    }


    public void Create(){
        sEdit.putBoolean("firstStart", false);
        sEdit.apply();
    }


    
    
}
