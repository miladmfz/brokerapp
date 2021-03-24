package com.kits.brokerapp.InterFces;

import android.view.View;

import com.kits.brokerapp.model.Customer;
import com.kits.brokerapp.model.GoodResponse;
import com.kits.brokerapp.model.PreFactor;
import com.kits.brokerapp.model.UserInfo;

public interface onClickListener {

    void onClick(Customer customer);

    void onClick(Good good);
    void onClick(GoodGroup goodGroup);
    void onClick(PreFactor preFactor);
    void onClick(UserInfo userInfo);
    void onClick(GoodResponse goodResponse);


    void onClick(String string);
    void onClick(View view);
    void onClick(Integer integer);



}
