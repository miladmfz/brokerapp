package com.kits.brokerapp.viewmodel;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kits.brokerapp.model.DatabaseHelper;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.disposables.CompositeDisposable;

public class ViewModelGood extends ViewModel {

    Context context;
    ArrayList<Good> goods;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private MutableLiveData<List<Good>> listMutableLiveDataGood = new MutableLiveData<>();
    DatabaseHelper databaseHelper;

    public MutableLiveData<List<Good>> getListMutableLiveData(){

//        databaseHelper=new DatabaseHelper() ;


//        listMutableLiveDataGood = new MutableLiveData<>();
//        listMutableLiveDataGood.setValue((List<Good>) AppDatabase.getInstance(MyApplication.getContext()).goodDao().getTenGood());

        listMutableLiveDataGood.setValue(goods);


        return listMutableLiveDataGood;
    }


    @Override
    protected void onCleared() {
        compositeDisposable.clear();
        super.onCleared();
    }


}
