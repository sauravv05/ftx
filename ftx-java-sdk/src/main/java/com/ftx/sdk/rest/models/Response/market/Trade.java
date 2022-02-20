package com.ftx.sdk.rest.models.Response.market;

import java.util.Date;
import java.util.Objects;

/**
 * Created by sauravv05 on 2022/02/19.
 */
public class Trade {
    public Long id;
    public double price;
    public double size;
    public String side;
    public boolean liquidation;
    public Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public boolean isLiquidation() {
        return liquidation;
    }

    public void setLiquidation(boolean liquidation) {
        this.liquidation = liquidation;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trade trades = (Trade) o;
        return Double.compare(trades.price, price) == 0 && Double.compare(trades.size, size) == 0 && liquidation == trades.liquidation && Objects.equals(id, trades.id) && Objects.equals(side, trades.side) && Objects.equals(time, trades.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, size, side, liquidation, time);
    }

    @Override
    public String toString() {
        return "Trades{" +
                "id=" + id +
                ", price=" + price +
                ", size=" + size +
                ", side='" + side + '\'' +
                ", liquidation=" + liquidation +
                ", time=" + time +
                '}';
    }
}
