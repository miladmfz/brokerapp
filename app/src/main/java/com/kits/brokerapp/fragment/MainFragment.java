package com.kits.brokerapp.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kits.brokerapp.R;
import com.kits.brokerapp.databinding.FragmentMainBinding;


public class MainFragment extends Fragment {

    FragmentMainBinding binding;


    public MainFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);

        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btn1.setText("btn1");
        binding.btn2.setText("btn2");
        binding.btn3.setText("btn3");
        binding.btn4.setText("btn4");
    }
}