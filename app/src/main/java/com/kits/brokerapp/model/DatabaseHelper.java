package com.kits.brokerapp.model;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


import com.kits.brokerapp.R;
import com.kits.brokerapp.application.MyApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class DatabaseHelper extends SQLiteOpenHelper {

    private Context mContext;
    @SuppressLint("SdCardPath")
    private static final String DATABASE_NAME = "/data/data/com.kits.brokerapp/databases/KowsarDb.db";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        this.mContext = context;
    }
    public DatabaseHelper() {
        super(MyApplication.getContext(), DATABASE_NAME, null, 1);

    }

    public List<Good> test() {


        String query = "SELECT * FROM Good LIMIT 10 " ;
        ArrayList<Good> goods = new ArrayList<Good>();
        SQLiteDatabase database = getReadableDatabase();
        Cursor c = database.rawQuery(query, null);

        if (c != null) {
            while (c.moveToNext()) {
                Good gooddetail = new Good();
                gooddetail.setGoodName(c.getString(c.getColumnIndex("GoodName")));
                gooddetail.setCheck(false);
                goods.add(gooddetail);

            }
        }
        c.close();

        return goods;
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}