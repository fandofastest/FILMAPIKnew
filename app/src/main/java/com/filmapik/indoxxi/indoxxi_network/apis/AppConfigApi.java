package com.filmapik.indoxxi.indoxxi_network.apis;

import com.filmapik.indoxxi.indoxxi_network.model.AppConfig;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AppConfigApi {

    @GET("get_config")
    Call<AppConfig> getAppConfig(@Query("api_secret_key") String apiKey);

}
