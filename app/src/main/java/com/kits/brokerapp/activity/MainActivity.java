package com.kits.brokerapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import com.kits.brokerapp.R;
import com.kits.brokerapp.adapter.Get_Shared;
import com.kits.brokerapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Get_Shared get_shared;
    ActivityMainBinding mainBinding;
    NavController navController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        DefineMethod();
        init();


    }

    public void DefineMethod(){
        mainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        get_shared= new Get_Shared(getApplication().getBaseContext());

    }

    public void init(){

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