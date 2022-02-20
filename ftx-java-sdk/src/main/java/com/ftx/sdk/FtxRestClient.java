package com.ftx.sdk;

import com.ftx.sdk.rest.RetrofitFactory;
import com.ftx.sdk.rest.repository.market.MarketApiAdapter;
import com.ftx.sdk.rest.repository.order.OrderApiAdapter;
import retrofit2.Retrofit;

/**
 * Created by sauravv05 on 2022/02/19.
 */
public class FtxRestClient{

    private final MarketApiAdapter marketApiAdapter;
    private final OrderApiAdapter orderApiAdapter;

    public FtxRestClient(RetrofitFactory retrofitFactory){
        Retrofit retrofit = retrofitFactory.getRetrofitClient();

        marketApiAdapter = new MarketApiAdapter(retrofit);
        orderApiAdapter = new OrderApiAdapter(retrofit);
    }

    public MarketApiAdapter marketApi(){
        return marketApiAdapter;
    }

    public OrderApiAdapter orderApi(){
        return orderApiAdapter;
    }

    static class Builder {
        private String baseUrl;
        private String key;
        private String secret;
        private String subAccount = null;

        public Builder(String baseUrl) {
            this.baseUrl = baseUrl;
        }

        public Builder withKeySecret(String key,String secret) {
            this.key = key;
            this.secret = secret;
            return this;
        }

        public Builder withSubAccount(String subAccount){
            this.subAccount = subAccount;
            return this;
        }

        public FtxRestClient build(){
            return new FtxRestClient(new RetrofitFactory(baseUrl, key, secret,subAccount));
        }
    }
}
