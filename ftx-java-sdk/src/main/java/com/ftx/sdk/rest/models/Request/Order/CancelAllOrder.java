package com.ftx.sdk.rest.models.Request.Order;

/**
 * Created by sauravv05 on 2022/02/20.
 */
public class CancelAllOrder {
    private String market;

    public CancelAllOrder(String market){
        this.market = market;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    @Override
    public String toString() {
        return "CancelAllOrder{" +
                "market='" + market + '\'' +
                '}';
    }
}
