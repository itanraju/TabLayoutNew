package com.example.tablayoutnew.Service;

import com.example.tablayoutnew.Model.Root;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface StatusServiceApi {

    @FormUrlEncoded
    @POST("getallthemes")
    Call<Root> getData(@Field("token")String name,@Field("application_id")Integer app_id,@Field("cat_id")Integer id);
}
