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
import com.kits.brokerapp.adapter.Get_Shared;
import com.kits.brokerapp.adapter.GoodItemAdapter;
import com.kits.brokerapp.databinding.FragmentSearchBinding;
import com.kits.brokerapp.room.Good;
import com.kits.brokerapp.viewmodel.ViewModelGoodroom;

import java.util.List;


public class SearchFragment extends Fragment {

    FragmentSearchBinding binding;
    RecyclerView recyclerView;
    GoodItemAdapter adapterGood;
    Get_Shared get_shared=new Get_Shared();
    public SearchFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_search, container, false);
        recyclerView = binding.searcgfragmentRecycler;
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.searchfragmentEd.setHint("salam");

        ViewModelGoodroom viewModelGoodroom = new ViewModelProvider(requireActivity()).get(ViewModelGoodroom.class);
        MutableLiveData<List<Good>> listMutableLiveData = viewModelGoodroom.getListMutableLiveData();

        listMutableLiveData.observe(requireActivity(), new Observer<List<Good>>() {
            @Override
            public void onChanged(List<Good> goods) {
                recyclerView.setLayoutManager(new StaggeredGridLayoutManager(Integer.parseInt(get_shared.Read_SH("ItemsShow")) , StaggeredGridLayoutManager.VERTICAL));
                recyclerView.setHasFixedSize(true);
                adapterGood = new GoodItemAdapter(getActivity(), goods);
                recyclerView.setAdapter(adapterGood);
            }
        });
    }

}