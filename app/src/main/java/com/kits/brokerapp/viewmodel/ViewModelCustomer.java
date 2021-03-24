package com.kits.brokerapp.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kits.brokerapp.model.Customer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.disposables.CompositeDisposable;

public class ViewModelCustomer extends ViewModel {

    ArrayList<Customer> customers;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    private MutableLiveData<List<Customer>> listMutableLiveData = new MutableLiveData<>();

    public MutableLiveData<List<Customer>> getListMutableLiveData(){

        if (listMutableLiveData==null) {
            listMutableLiveData = new MutableLiveData<>();
            listMutableLiveData.setValue(customers);
        }
        return listMutableLiveData;
    }


    @Override
    protected void onCleared() {
        compositeDisposable.clear();
        super.onCleared();
    }
}
