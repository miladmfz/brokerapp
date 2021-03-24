package com.kits.brokerapp.model;

import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.databinding.BindingAdapter;

import com.google.gson.annotations.SerializedName;
import com.kits.brokerapp.R;

import java.text.DecimalFormat;

public class Customer {

    private static final DecimalFormat decimalFormat = new DecimalFormat("0,000");

    @SerializedName("CustomerCode")
    private String CustomerCode;
    @SerializedName("CustomerName")
    private String CustomerName;

    @SerializedName("PriceTip")
    private String PriceTip;
    @SerializedName("Address")
    private String Address;
    @SerializedName("Manager")
    private String Manager;
    @SerializedName("Mobile")
    private String Mobile;
    @SerializedName("Phone")
    private String Phone;
    @SerializedName("Delegacy")
    private String Delegacy;
    @SerializedName("CityName")
    private String CityName;
    @SerializedName("CityCode")
    private String CityCode;
    @SerializedName("Bestankar")
    private String Bestankar;
    @SerializedName("Active")
    private String Active;
    @SerializedName("CentralPrivateCode")
    private String CentralPrivateCode;
    @SerializedName("EtebarNaghd")
    private String EtebarNaghd;
    @SerializedName("EtebarCheck")
    private String EtebarCheck;
    @SerializedName("Takhfif")
    private String Takhfif;
    @SerializedName("MobileName")
    private String MobileName;
    @SerializedName("Email")
    private String Email;
    @SerializedName("Fax")
    private String Fax;
    @SerializedName("ZipCode")
    private String ZipCode;
    @SerializedName("PostCode")
    private String PostCode;
    @SerializedName("ErrCode")
    private String ErrCode;
    @SerializedName("ErrDesc")
    private String ErrDesc;
    @SerializedName("IsExist")
    private String IsExist;
    @SerializedName("KodeMelli")
    private String KodeMelli;



    @BindingAdapter({"android:TVBestankar"})
    public static void loadCircleImageView(TextView TextView , String data){

        if (Integer.parseInt(data)> -1) {
            TextView.setText(Farsi_number.PerisanNumber(decimalFormat.format(Integer.parseInt(data))));
            //TextView.setTextColor(ContextCompat.getColor(mContext, R.color.green_900));
        } else {
            int a = (Integer.parseInt(data) * (-1));
            TextView.setText(Farsi_number.PerisanNumber(decimalFormat.format(a)));
            //TextView.setTextColor(ContextCompat.getColor(, R.color.red_900));
        }

    }





    public String getCustomerCode() {
        return Farsi_number.PerisanNumber(CustomerCode);
    }

    public void setCustomerCode(String customerCode) {
        CustomerCode = customerCode;
    }

    public String getPriceTip() {
        return Farsi_number.PerisanNumber(PriceTip);
    }

    public void setPriceTip(String priceTip) {
        PriceTip = priceTip;
    }

    public String getCustomerName() {
        return Farsi_number.PerisanNumber(CustomerName);
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getAddress() {
        return Farsi_number.PerisanNumber(Address);
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getManager() {
        return Farsi_number.PerisanNumber(Manager);
    }

    public void setManager(String manager) {
        Manager = manager;
    }

    public String getMobile() {
        return Farsi_number.PerisanNumber(Mobile);
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getPhone() {
        return Farsi_number.PerisanNumber(Phone);
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getDelegacy() {
        return Farsi_number.PerisanNumber(Delegacy);
    }

    public void setDelegacy(String delegacy) {
        Delegacy = delegacy;
    }

    public String getCityName() {return Farsi_number.PerisanNumber(CityName);}

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getCityCode() {
        return CityCode;
    }

    public void setCityCode(String cityCode) {
        CityCode = cityCode;
    }

    public String getBestankar() { return Bestankar; }

    public void setBestankar(String bestankar) {
        Bestankar = bestankar;
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }

    public String getCentralPrivateCode() {
        return CentralPrivateCode;
    }

    public void setCentralPrivateCode(String centralPrivateCode) {
        CentralPrivateCode = centralPrivateCode;
    }

    public String getEtebarNaghd() {
        return EtebarNaghd;
    }

    public void setEtebarNaghd(String etebarNaghd) {
        EtebarNaghd = etebarNaghd;
    }

    public String getEtebarCheck() {
        return EtebarCheck;
    }

    public void setEtebarCheck(String etebarCheck) {
        EtebarCheck = etebarCheck;
    }

    public String getTakhfif() {
        return Takhfif;
    }

    public void setTakhfif(String takhfif) {
        Takhfif = takhfif;
    }

    public String getMobileName() {
        return MobileName;
    }

    public void setMobileName(String mobileName) {
        MobileName = mobileName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String postCode) {
        PostCode = postCode;
    }

    public String getErrCode() {
        return ErrCode;
    }

    public void setErrCode(String errCode) {
        ErrCode = errCode;
    }

    public String getErrDesc() {
        return ErrDesc;
    }

    public void setErrDesc(String errDesc) {
        ErrDesc = errDesc;
    }

    public String getIsExist() {
        return IsExist;
    }

    public void setIsExist(String isExist) {
        IsExist = isExist;
    }

    public String getKodeMelli() {
        return KodeMelli;
    }

    public void setKodeMelli(String kodeMelli) {
        KodeMelli = kodeMelli;
    }
}
