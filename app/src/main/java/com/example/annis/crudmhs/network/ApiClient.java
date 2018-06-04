package com.example.annis.crudmhs.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by annisa on 28/05/2018.
 */

public class ApiClient  {
    public static final  String BASE_URL = "http://192.168.43.92/LARA/Laraku/public/";
    private static Retrofit mRetrofit;


    public static Retrofit getmRetrofit(){
        if (mRetrofit == null) {
            Retrofit mRetrofit = new Retrofit.Builder()
                                    .baseUrl(BASE_URL)
                                    .addConverterFactory(GsonConverterFactory.create())
                                    .build();
        }
        return mRetrofit;
    }

}
