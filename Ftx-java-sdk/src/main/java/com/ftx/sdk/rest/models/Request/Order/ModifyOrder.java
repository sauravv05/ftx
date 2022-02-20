package com.ftx.sdk.rest.models.Request.Order;

import java.util.Objects;

/**
 * Created by sauravv05 on 2022/02/20.
 */
public class ModifyOrder {
    private double size;
    private double price;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModifyOrder that = (ModifyOrder) o;
        return Double.compare(that.size, size) == 0 && Double.compare(that.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, price);
    }

    @Override
    public String toString() {
        return "ModifyOrder{" +
                "size=" + size +
                ", price=" + price +
                '}';
    }
}
