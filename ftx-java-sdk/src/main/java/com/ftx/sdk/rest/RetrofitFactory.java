package com.ftx.sdk.rest;

import com.ftx.sdk.rest.security.AuthenticationInterceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by sauravv05 on 2022/02/19.
 */
public class RetrofitFactory {
    private final String baseUrl;
    private final String key;
    private final String secret;
    private final String subAccount;

    public RetrofitFactory(String baseUrl, String key, String secret, String subAccount){
        this.baseUrl = baseUrl;
        this.key = key;
        this.secret = secret;
        this.subAccount = subAccount;
    }

    public Retrofit getRetrofitClient(){
         return new Retrofit.Builder()
                 .baseUrl(baseUrl)
                 .client(getOkHttpClient())
                 .addConverterFactory(JacksonConverterFactory.create())
                 .build();
    }

    private OkHttpClient getOkHttpClient(){
        return new OkHttpClient().newBuilder()
                .addInterceptor(new AuthenticationInterceptor(key,secret,subAccount))
                .build();
    }
}
