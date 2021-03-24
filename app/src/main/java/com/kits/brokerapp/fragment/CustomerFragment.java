package com.kits.brokerapp.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kits.brokerapp.R;
import com.kits.brokerapp.adapter.CustomerItemAdapter;
import com.kits.brokerapp.databinding.FragmentCustomerBinding;
import com.kits.brokerapp.model.Customer;

import com.kits.brokerapp.viewmodel.ViewModelCustomer;

import java.util.List;


public abstract class CustomerFragment extends Fragment{

    FragmentCustomerBinding binding;
    RecyclerView recyclerView;
    CustomerItemAdapter adapterCustomer;

    Boolean edit=false;

    public CustomerFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_customer, container, false);
        recyclerView = binding.customerfragmentRecycler;
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewModelCustomer viewModelCustomer = new ViewModelProvider(requireActivity()).get(ViewModelCustomer.class);
        MutableLiveData<List<Customer>> listMutableLiveData = viewModelCustomer.getListMutableLiveData();


        listMutableLiveData.observe(requireActivity(), new Observer<List<Customer>>() {
            @Override
            public void onChanged(List<Customer> Customers) {

                int factor_target=1;
                recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2 , StaggeredGridLayoutManager.VERTICAL));
                recyclerView.setHasFixedSize(true);
                adapterCustomer = new CustomerItemAdapter(getActivity(), Customers, edit,factor_target);
                recyclerView.setAdapter(adapterCustomer);

            }
        });




    }

}