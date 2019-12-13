package com.riskayunita.akademikunsri.network;

public class UtilsApi {

    // 10.0.2.2 ini adalah localhost.
    public static final String BASE_URL_API = "http://192.168.43.147/akademik/";

    // Mendeklarasikan Interface BaseApiService
    public static ApiServices getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(ApiServices.class);
    }
}
