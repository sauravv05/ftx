package com.ftx.sdk.rest.repository.market;

import com.ftx.sdk.rest.models.Response.market.Candle;
import com.ftx.sdk.rest.models.Response.market.Market;
import com.ftx.sdk.rest.models.Response.market.Orderbook;
import com.ftx.sdk.rest.models.Response.market.Trade;
import com.ftx.sdk.rest.repository.AbstractApiAdapter;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

/**
 * Created by sauravv05 on 2022/02/19.
 */
public class MarketApiAdapter extends AbstractApiAdapter {
    private final MarketApiRetrofit marketApi;

    public MarketApiAdapter(Retrofit retrofit){
        marketApi = retrofit.create(MarketApiRetrofit.class);
    }

    public List<Market> getMarkets() throws IOException {
        return  super.executeSync(marketApi.getMarkets()).getResult();
    }

    public Market getMarket(String marketName) throws IOException{
        return super.executeSync(marketApi.getMarket(marketName)).getResult();
    }

    public Orderbook getOrderbook(String marketName, Integer depth) throws IOException{
        return super.executeSync(marketApi.getOrderbook(marketName,depth)).getResult();
    }

    public Orderbook getOrderbook(String marketName) throws IOException{
        return getOrderbook(marketName,null);
    }


    public List<Trade> getTrades(String marketName, Long startTimeSec, Long endTimeSec) throws IOException{
        return super.executeSync(marketApi.getTrades(marketName,startTimeSec,endTimeSec)).getResult();
    }

    public List<Trade> getTrades(String marketName) throws IOException{
        return getTrades(marketName,null,null);
    }

    public List<Candle> getHistoricalPrices(String marketName, int resolution,
                                            Long startTimeSec, Long endTimeSec) throws IOException {
        return super.executeSync(marketApi.getHistoricalPrices(marketName,resolution,
                startTimeSec, endTimeSec)).getResult();
    }

    public List<Candle> getHistoricalPrices(String marketName, int resolution) throws IOException {
        return getHistoricalPrices(marketName, resolution,null,null);
    }
}