package com.ftx.sdk.rest.models.Response.market;

import java.util.Date;
import java.util.Objects;

/**
 * Created by sauravv05 on 2022/02/19.
 */
public class Candle {
    public double close;
    public double high;
    public double low;
    public double open;
    public Date startTime;
    public double volume;
    public long time;

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candle candle = (Candle) o;
        return Double.compare(candle.close, close) == 0 && Double.compare(candle.high, high) == 0 && Double.compare(candle.low, low) == 0 && Double.compare(candle.open, open) == 0 && Double.compare(candle.volume, volume) == 0 && time == candle.time && Objects.equals(startTime, candle.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(close, high, low, open, startTime, volume, time);
    }

    @Override
    public String toString() {
        return "Candle{" +
                "close=" + close +
                ", high=" + high +
                ", low=" + low +
                ", open=" + open +
                ", startTime=" + startTime +
                ", volume=" + volume +
                ", time=" + time +
                '}';
    }
}
