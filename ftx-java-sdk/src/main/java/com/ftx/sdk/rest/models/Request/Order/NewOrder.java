package com.ftx.sdk.rest.models.Request.Order;

/**
 * Created by sauravv05 on 2022/02/20.
 */
public class NewOrder {
    public String market;
    public String side;
    public double price;
    public String type;
    public double size;
    public boolean reduceOnly;
    public boolean ioc;
    public boolean postOnly;
    public Long clientId;

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isReduceOnly() {
        return reduceOnly;
    }

    public void setReduceOnly(boolean reduceOnly) {
        this.reduceOnly = reduceOnly;
    }

    public boolean isIoc() {
        return ioc;
    }

    public void setIoc(boolean ioc) {
        this.ioc = ioc;
    }

    public boolean isPostOnly() {
        return postOnly;
    }

    public void setPostOnly(boolean postOnly) {
        this.postOnly = postOnly;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "PlaceOrder{" +
                "market='" + market + '\'' +
                ", side='" + side + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", reduceOnly=" + reduceOnly +
                ", ioc=" + ioc +
                ", postOnly=" + postOnly +
                ", clientId=" + clientId +
                '}';
    }
}
