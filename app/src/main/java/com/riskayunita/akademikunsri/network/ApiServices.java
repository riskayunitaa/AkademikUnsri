package com.riskayunita.akademikunsri.network;

import com.riskayunita.akademikunsri.response.ResponseKrs;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {

    //@TIPEMETHOD("API_END_POINT")
    @GET("tampil_krs.php")
    Call<ResponseKrs> getKrs();
    // <ModelData> nama_method()

}
