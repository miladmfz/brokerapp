package com.kits.brokerapp.viewmodel;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kits.brokerapp.application.MyApplication;
import com.kits.brokerapp.model.DatabaseHelper;
import com.kits.brokerapp.room.AppDatabase;
import com.kits.brokerapp.room.Good;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.disposables.CompositeDisposable;

public class ViewModelGoodroom extends ViewModel {

    Context context;
    ArrayList<Good> goods;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private MutableLiveData<List<Good>> listMutableLiveDataGood ;
    DatabaseHelper databaseHelper;

    public MutableLiveData<List<Good>> getListMutableLiveData(){



        listMutableLiveDataGood = new MutableLiveData<>();
        listMutableLiveDataGood.setValue(AppDatabase.getInstance(MyApplication.getContext()).goodDao().getallGood());

        return listMutableLiveDataGood;
    }


    @Override
    protected void onCleared() {
        compositeDisposable.clear();
        super.onCleared();
    }


}
