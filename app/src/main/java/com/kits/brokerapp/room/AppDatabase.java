package com.kits.brokerapp.room;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;


@Database(entities = Good.class , version = 1 )
public abstract class AppDatabase extends RoomDatabase{


    private static final String LOG_TAG=AppDatabase.class.getSimpleName();
    private static final Object LOCK = new Object();
    @SuppressLint("SdCardPath")
    private static final String DATABASE_NAME = "/data/data/com.kits.brokerapp/databases/KowsarDb.db";

    public abstract GoodDao goodDao();
    public static AppDatabase sInstance;



    public static AppDatabase getInstance (Context context){

        if (sInstance==null){

            synchronized (LOCK) {
                sInstance = Room.databaseBuilder(context.getApplicationContext() ,
                        AppDatabase.class , AppDatabase.DATABASE_NAME)
                        .addCallback(new Callback() {
                            @Override
                            public void onCreate(@NonNull SupportSQLiteDatabase db) {
                                super.onCreate(db);
                            }

                            @Override
                            public void onOpen(@NonNull SupportSQLiteDatabase db) {
                                super.onOpen(db);
                            }
                        }).allowMainThreadQueries().build();

            }
        }
        return sInstance;
    }

}

