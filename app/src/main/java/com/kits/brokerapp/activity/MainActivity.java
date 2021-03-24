package com.kits.brokerapp.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.work.WorkManager;

import android.Manifest;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import com.kits.brokerapp.R;
import com.kits.brokerapp.adapter.Get_Shared;
import com.kits.brokerapp.application.MyApplication;
import com.kits.brokerapp.databinding.ActivityMainBinding;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Get_Shared get_shared;
    ActivityMainBinding mainBinding;
    NavController navController;
    Intent intent;
    private int STORAGE_PERMISSION_CODE = 1;
    SQLiteDatabase database;
    SharedPreferences shPref;
    SharedPreferences.Editor sEdit;
    WorkManager workManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        Handler handler;

        if (ContextCompat.checkSelfPermission(MyApplication.getContext(), Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            if (ContextCompat.checkSelfPermission(MyApplication.getContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        copyFileDb();

                        DefineMethod();

                        init();
                    }
                }, 1000);
            } else {
                requstforpermission();
            }

        } else {
            requstforpermission();
        }



    }

    public void requstforpermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            new AlertDialog.Builder(this)
                    .setTitle("permission needed")
                    .setMessage("this permission is needed because of this abd that")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions((Activity) MyApplication.getContext(), new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, STORAGE_PERMISSION_CODE);
                        }
                    })
                    .setNegativeButton("cancle", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .create().show();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, STORAGE_PERMISSION_CODE);
        }

        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.READ_EXTERNAL_STORAGE)) {
            new AlertDialog.Builder(this)
                    .setTitle("permission needed")
                    .setMessage("this permission is needed because of this abd that")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions((Activity)MyApplication.getContext(), new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSION_CODE);
                        }
                    })
                    .setNegativeButton("cancle", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .create().show();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, STORAGE_PERMISSION_CODE);
        }


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == STORAGE_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                Toast.makeText(this, "permission granted", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "permission denied", Toast.LENGTH_SHORT).show();
            }

        }

    }

    public void copyFileDb() {
        InputStream in;
        OutputStream out;
        try {
            //String filename = getApplicationInfo().dataDir + "/databases/KowsarDb.sqlite";
            String filename = getApplicationInfo().dataDir + "/databases/KowsarDb.db";
            File dbfile = new File(filename);
            if (!dbfile.exists()) {

                if (!Objects.requireNonNull(dbfile.getParentFile()).exists()) {
                    dbfile.getParentFile().mkdirs();
                }
                if (!dbfile.exists()) {
                    dbfile.createNewFile();
                }

                in = getApplicationContext().getAssets().open("databases/KowsarDb.db");
                out = new FileOutputStream(dbfile);
                byte[] buffer = new byte[1024];
                int read;
                while ((read = in.read(buffer)) != -1) {
                    out.write(buffer, 0, read);
                }
            }
        } catch (IOException e) {
            Log.e("1","8="+e.getMessage());

            e.printStackTrace();
        }
    }

    public void DefineMethod(){
        mainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        get_shared= new Get_Shared();

    }


    public void init(){

//        Toast.makeText(MyApplication.getContext(), "asd", Toast.LENGTH_SHORT).show();
//        DatabaseHelper databaseHelper;
//        databaseHelper= new DatabaseHelper(MyApplication.getContext());
//        List<Good> goods =databaseHelper.test();
//        Log.e("123",""+goods.size());

        if(get_shared.firstStart()){
            get_shared.Create();
        }

        navController = Navigation.findNavController(this , R.id.fragment);
        NavigationUI.setupActionBarWithNavController(this , navController);


    }

    @Override
    public boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }
}