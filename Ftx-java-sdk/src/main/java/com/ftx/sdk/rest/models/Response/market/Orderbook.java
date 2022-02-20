package com.ftx.sdk.rest.models.Response.market;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by sauravv05 on 2022/02/19.
 */
public class Orderbook {
    public ArrayList<OrderbookElement> bids;
    public ArrayList<OrderbookElement> asks;

    public ArrayList<OrderbookElement> getBids() {
        return bids;
    }

    public void setBids(ArrayList<OrderbookElement> bids) {
        this.bids = bids;
    }

    public ArrayList<OrderbookElement> getAsks() {
        return asks;
    }

    public void setAsks(ArrayList<OrderbookElement> asks) {
        this.asks = asks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orderbook orderbook = (Orderbook) o;
        return Objects.equals(bids, orderbook.bids) && Objects.equals(asks, orderbook.asks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bids, asks);
    }

    @Override
    public String toString() {
        return "Orderbook{" +
                "bids=" + bids +
                ", asks=" + asks +
                '}';
    }
}
