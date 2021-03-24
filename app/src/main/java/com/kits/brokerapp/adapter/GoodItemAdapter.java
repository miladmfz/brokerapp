package com.kits.brokerapp.adapter;


import android.content.Context;
import android.content.SharedPreferences;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import androidx.annotation.NonNull;

import com.kits.brokerapp.R;
import com.kits.brokerapp.databinding.GooditemvieTwBinding;
import com.kits.brokerapp.room.Good;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;
import java.util.List;



public class GoodItemAdapter extends RecyclerView.Adapter<GoodItemAdapter.MyViewHolder> {
    private Context mContext;
    private DecimalFormat decimalFormat = new DecimalFormat("0,000");
    private List<Good> goods;

    private SharedPreferences shPref;
    private byte[] imageByteArray;
    int flag = 1;
    public boolean multi_select;



    public GoodItemAdapter(Context context,List<Good> goods) {
        this.mContext = context;
        this.goods = goods;
        shPref = mContext.getSharedPreferences("act", Context.MODE_PRIVATE);

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        GooditemvieTwBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.gooditemvie_tw, parent, false);

        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        holder.binding.setGood(goods.get(position));
//        holder.binding.gooditemcodeW.setText(goods.get(position).getGoodCode()+"");
//        holder.binding.gooditemnameW.setText(goods.get(position).getGoodName()+"");


//        Log.e("getGoodCode",goods.get(position).getGoodCode()+"");
//        Log.e("getGoodName",goods.get(position).getGoodName()+"");
    }

    @Override
    public int getItemCount() {
        return goods.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        GooditemvieTwBinding binding;
        public MyViewHolder(@NonNull GooditemvieTwBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
