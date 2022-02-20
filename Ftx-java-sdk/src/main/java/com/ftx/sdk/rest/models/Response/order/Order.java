package com.ftx.sdk.rest.models.Response.order;

import java.util.Date;
import java.util.Objects;

/**
 * Created by sauravv05 on 2022/02/20.
 */
public class Order {
    public double avgFillPrice;
    public Long clientId;
    public Date createdAt;
    public double filledSize;
    public String future;
    public Long id;
    public boolean ioc;
    public String market;
    public boolean postOnly;
    public double price;
    public boolean reduceOnly;
    public double remainingSize;
    public String side;
    public double size;
    public String status;
    public String type;
    private boolean liquidation;

    public double getAvgFillPrice() {
        return avgFillPrice;
    }

    public void setAvgFillPrice(double avgFillPrice) {
        this.avgFillPrice = avgFillPrice;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public double getFilledSize() {
        return filledSize;
    }

    public void setFilledSize(double filledSize) {
        this.filledSize = filledSize;
    }

    public String getFuture() {
        return future;
    }

    public void setFuture(String future) {
        this.future = future;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isIoc() {
        return ioc;
    }

    public void setIoc(boolean ioc) {
        this.ioc = ioc;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public boolean isPostOnly() {
        return postOnly;
    }

    public void setPostOnly(boolean postOnly) {
        this.postOnly = postOnly;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isReduceOnly() {
        return reduceOnly;
    }

    public void setReduceOnly(boolean reduceOnly) {
        this.reduceOnly = reduceOnly;
    }

    public double getRemainingSize() {
        return remainingSize;
    }

    public void setRemainingSize(double remainingSize) {
        this.remainingSize = remainingSize;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLiquidation() {
        return liquidation;
    }

    public void setLiquidation(boolean liquidation) {
        this.liquidation = liquidation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.avgFillPrice, avgFillPrice) == 0 && Double.compare(order.filledSize, filledSize) == 0 && ioc == order.ioc && postOnly == order.postOnly && Double.compare(order.price, price) == 0 && reduceOnly == order.reduceOnly && Double.compare(order.remainingSize, remainingSize) == 0 && Double.compare(order.size, size) == 0 && liquidation == order.liquidation && Objects.equals(clientId, order.clientId) && Objects.equals(createdAt, order.createdAt) && Objects.equals(future, order.future) && Objects.equals(id, order.id) && Objects.equals(market, order.market) && Objects.equals(side, order.side) && Objects.equals(status, order.status) && Objects.equals(type, order.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avgFillPrice, clientId, createdAt, filledSize, future, id, ioc, market, postOnly, price, reduceOnly, remainingSize, side, size, status, type, liquidation);
    }

    @Override
    public String toString() {
        return "Order{" +
                "avgFillPrice=" + avgFillPrice +
                ", clientId=" + clientId +
                ", createdAt=" + createdAt +
                ", filledSize=" + filledSize +
                ", future='" + future + '\'' +
                ", id=" + id +
                ", ioc=" + ioc +
                ", market='" + market + '\'' +
                ", postOnly=" + postOnly +
                ", price=" + price +
                ", reduceOnly=" + reduceOnly +
                ", remainingSize=" + remainingSize +
                ", side='" + side + '\'' +
                ", size=" + size +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", liquidation=" + liquidation +
                '}';
    }
}
