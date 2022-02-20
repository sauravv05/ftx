package com.ftx.sdk.rest.repository.market;

import com.ftx.sdk.rest.models.Response.FtxResponse;
import com.ftx.sdk.rest.models.Response.FtxResponseSingle;
import com.ftx.sdk.rest.models.Response.market.Candle;
import com.ftx.sdk.rest.models.Response.market.Market;
import com.ftx.sdk.rest.models.Response.market.Orderbook;
import com.ftx.sdk.rest.models.Response.market.Trade;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by sauravv05 on 2022/02/19.
 */
public interface MarketApiRetrofit {

    @GET("markets")
    Call<FtxResponse<Market>> getMarkets();

    @GET("markets/{market_name}")
    Call<FtxResponseSingle<Market>> getMarket(@Path("market_name")String marketName);

    @GET("markets/{market_name}/orderbook")
    Call<FtxResponseSingle<Orderbook>> getOrderbook(@Path("market_name") String marketName,
                                                    @Query("depth") Integer depth);

    @GET("markets/{market_name}/trades")
    Call<FtxResponse<Trade>> getTrades(@Path("market_name") String marketName,
                                       @Query("start_time") Long startTimeSec,
                                       @Query("end_time") Long endTimeSec);

    @GET("markets/{market_name}/candles")
    Call<FtxResponse<Candle>> getHistoricalPrices(@Path("market_name") String marketName,
                                                  @Query("resolution") int resolution,
                                                  @Query("start_time") Long startTimeSec,
                                                  @Query("end_time") Long endTimeSec);
}
