package com.riskayunita.akademikunsri.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class InitRetrofit {
    // URL Server API
    public static String API_URL = "http://192.168.43.147/akademik/";

    public static Retrofit setInit() {
        return new Retrofit.Builder().baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiServices getInstance() {
        return setInit().create(ApiServices.class);
    }
}