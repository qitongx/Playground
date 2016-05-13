package com.roamdata.mavenHelloWorld;

import com.google.gson.annotations.SerializedName;

/**
 * Created by j on 5/13/16.
 */
public class Wsapi6Configuration {

    @SerializedName("account.permissions.add_submerchant.merchant_portal")
    Boolean permissionAddSubmerchantInMerchantPortal;

    /**
     * Example:
     *  {"code":"USD","iso":840,"symbol":"$"}
     **/
    @SerializedName("processing.config.currency")
    Wsapi6Currency organizationCurrency;


    @Override
    public String toString() {
        StringBuilder toStringBuilder = new StringBuilder();
        toStringBuilder.append("\npermissionAddSubmerchantInMerchantPortal:" + String.valueOf(permissionAddSubmerchantInMerchantPortal));
        toStringBuilder.append("\norganizationCurrency:" + organizationCurrency.toString());
        return toStringBuilder.toString();
    }
}
