package com.example.tablayoutnew.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Instance {

    static StatusServiceApi statusServiceApi;

    public static StatusServiceApi getStatusServiceApi()
    {
        if(statusServiceApi==null)
        {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://beatsadmin.trendinganimations.com/public/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            statusServiceApi = retrofit.create(StatusServiceApi.class);
        }
        return statusServiceApi;
    }
}
