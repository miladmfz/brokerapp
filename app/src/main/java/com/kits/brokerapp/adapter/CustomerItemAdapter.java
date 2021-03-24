package com.kits.brokerapp.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.kits.brokerapp.R;
import com.kits.brokerapp.databinding.CustomeritemviewBinding;

import com.kits.brokerapp.model.Customer;
import com.kits.brokerapp.model.DatabaseHelper;
import com.kits.brokerapp.model.UserInfo;

import java.util.List;

public class CustomerItemAdapter extends RecyclerView.Adapter<CustomerItemAdapter.MyViewHolder> {



    private Context mContext;
    private List<Customer> customers;
    private Boolean edit;
    private Integer factor_target;
    private DatabaseHelper dbh;
    private Action action;
    private Intent intent;
    UserInfo auser;
    Customer Customerview;


    public CustomerItemAdapter( Context context,List<Customer> customers, Boolean edit, int factor_target) {
        this.mContext = context;
        this.customers = customers;
        this.edit = edit;
        this.factor_target = factor_target;
        this.dbh = new DatabaseHelper(mContext);
        this.action = new Action(mContext);

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        CustomeritemviewBinding binding = DataBindingUtil.inflate(inflater , R.layout.customeritemview , parent , false);
        return new MyViewHolder(binding);
    }



    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {

        Customerview = customers.get(position);
        holder.binding.setCustomer(Customerview);

        holder.binding.customeritemcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return customers.size();
    }
    static class MyViewHolder extends RecyclerView.ViewHolder {
        CustomeritemviewBinding binding;
        public MyViewHolder(@NonNull CustomeritemviewBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }


}
