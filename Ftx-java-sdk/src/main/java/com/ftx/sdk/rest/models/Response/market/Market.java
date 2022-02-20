package com.ftx.sdk.rest.models.Response.market;

/**
 * Created by sauravv05 on 2022/02/19.
 */
public class Market {
    public String name;
    public boolean enabled;
    public boolean postOnly;
    public double priceIncrement;
    public Long sizeIncrement;
    public Long minProvideSize;
    public double last;
    public double bid;
    public double ask;
    public double price;
    public String type;
    public Object baseCurrency;
    public Object quoteCurrency;
    public String underlying;
    public boolean restricted;
    public boolean tokenizedEquity;
    public boolean highLeverageFeeExempt;
    public Long largeOrderThreshold;
    public double change1h;
    public double change24h;
    public double changeBod;
    public double quoteVolume24h;
    public double volumeUsd24h;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Market() {
    }

    @SuppressWarnings("all")
    public String getName() {
        return this.name;
    }

    @SuppressWarnings("all")
    public boolean isEnabled() {
        return this.enabled;
    }

    @SuppressWarnings("all")
    public boolean isPostOnly() {
        return this.postOnly;
    }

    @SuppressWarnings("all")
    public double getPriceIncrement() {
        return this.priceIncrement;
    }

    @SuppressWarnings("all")
    public Long getSizeIncrement() {
        return this.sizeIncrement;
    }

    @SuppressWarnings("all")
    public Long getMinProvideSize() {
        return this.minProvideSize;
    }

    @SuppressWarnings("all")
    public double getLast() {
        return this.last;
    }

    @SuppressWarnings("all")
    public double getBid() {
        return this.bid;
    }

    @SuppressWarnings("all")
    public double getAsk() {
        return this.ask;
    }

    @SuppressWarnings("all")
    public double getPrice() {
        return this.price;
    }

    @SuppressWarnings("all")
    public String getType() {
        return this.type;
    }

    @SuppressWarnings("all")
    public Object getBaseCurrency() {
        return this.baseCurrency;
    }

    @SuppressWarnings("all")
    public Object getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @SuppressWarnings("all")
    public String getUnderlying() {
        return this.underlying;
    }

    @SuppressWarnings("all")
    public boolean isRestricted() {
        return this.restricted;
    }

    @SuppressWarnings("all")
    public boolean isTokenizedEquity() {
        return this.tokenizedEquity;
    }

    @SuppressWarnings("all")
    public boolean isHighLeverageFeeExempt() {
        return this.highLeverageFeeExempt;
    }

    @SuppressWarnings("all")
    public Long getLargeOrderThreshold() {
        return this.largeOrderThreshold;
    }

    @SuppressWarnings("all")
    public double getChange1h() {
        return this.change1h;
    }

    @SuppressWarnings("all")
    public double getChange24h() {
        return this.change24h;
    }

    @SuppressWarnings("all")
    public double getChangeBod() {
        return this.changeBod;
    }

    @SuppressWarnings("all")
    public double getQuoteVolume24h() {
        return this.quoteVolume24h;
    }

    @SuppressWarnings("all")
    public double getVolumeUsd24h() {
        return this.volumeUsd24h;
    }

    @SuppressWarnings("all")
    public void setName(final String name) {
        this.name = name;
    }

    @SuppressWarnings("all")
    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    @SuppressWarnings("all")
    public void setPostOnly(final boolean postOnly) {
        this.postOnly = postOnly;
    }

    @SuppressWarnings("all")
    public void setPriceIncrement(final double priceIncrement) {
        this.priceIncrement = priceIncrement;
    }

    @SuppressWarnings("all")
    public void setSizeIncrement(final Long sizeIncrement) {
        this.sizeIncrement = sizeIncrement;
    }

    @SuppressWarnings("all")
    public void setMinProvideSize(final Long minProvideSize) {
        this.minProvideSize = minProvideSize;
    }

    @SuppressWarnings("all")
    public void setLast(final double last) {
        this.last = last;
    }

    @SuppressWarnings("all")
    public void setBid(final double bid) {
        this.bid = bid;
    }

    @SuppressWarnings("all")
    public void setAsk(final double ask) {
        this.ask = ask;
    }

    @SuppressWarnings("all")
    public void setPrice(final double price) {
        this.price = price;
    }

    @SuppressWarnings("all")
    public void setType(final String type) {
        this.type = type;
    }

    @SuppressWarnings("all")
    public void setBaseCurrency(final Object baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    @SuppressWarnings("all")
    public void setQuoteCurrency(final Object quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
    }

    @SuppressWarnings("all")
    public void setUnderlying(final String underlying) {
        this.underlying = underlying;
    }

    @SuppressWarnings("all")
    public void setRestricted(final boolean restricted) {
        this.restricted = restricted;
    }

    @SuppressWarnings("all")
    public void setTokenizedEquity(final boolean tokenizedEquity) {
        this.tokenizedEquity = tokenizedEquity;
    }

    @SuppressWarnings("all")
    public void setHighLeverageFeeExempt(final boolean highLeverageFeeExempt) {
        this.highLeverageFeeExempt = highLeverageFeeExempt;
    }

    @SuppressWarnings("all")
    public void setLargeOrderThreshold(final Long largeOrderThreshold) {
        this.largeOrderThreshold = largeOrderThreshold;
    }

    @SuppressWarnings("all")
    public void setChange1h(final double change1h) {
        this.change1h = change1h;
    }

    @SuppressWarnings("all")
    public void setChange24h(final double change24h) {
        this.change24h = change24h;
    }

    @SuppressWarnings("all")
    public void setChangeBod(final double changeBod) {
        this.changeBod = changeBod;
    }

    @SuppressWarnings("all")
    public void setQuoteVolume24h(final double quoteVolume24h) {
        this.quoteVolume24h = quoteVolume24h;
    }

    @SuppressWarnings("all")
    public void setVolumeUsd24h(final double volumeUsd24h) {
        this.volumeUsd24h = volumeUsd24h;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Market)) return false;
        final Market other = (Market) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.isEnabled() != other.isEnabled()) return false;
        if (this.isPostOnly() != other.isPostOnly()) return false;
        if (Double.compare(this.getPriceIncrement(), other.getPriceIncrement()) != 0) return false;
        if (Double.compare(this.getLast(), other.getLast()) != 0) return false;
        if (Double.compare(this.getBid(), other.getBid()) != 0) return false;
        if (Double.compare(this.getAsk(), other.getAsk()) != 0) return false;
        if (Double.compare(this.getPrice(), other.getPrice()) != 0) return false;
        if (this.isRestricted() != other.isRestricted()) return false;
        if (this.isTokenizedEquity() != other.isTokenizedEquity()) return false;
        if (this.isHighLeverageFeeExempt() != other.isHighLeverageFeeExempt()) return false;
        if (Double.compare(this.getChange1h(), other.getChange1h()) != 0) return false;
        if (Double.compare(this.getChange24h(), other.getChange24h()) != 0) return false;
        if (Double.compare(this.getChangeBod(), other.getChangeBod()) != 0) return false;
        if (Double.compare(this.getQuoteVolume24h(), other.getQuoteVolume24h()) != 0) return false;
        if (Double.compare(this.getVolumeUsd24h(), other.getVolumeUsd24h()) != 0) return false;
        final Object this$sizeIncrement = this.getSizeIncrement();
        final Object other$sizeIncrement = other.getSizeIncrement();
        if (this$sizeIncrement == null ? other$sizeIncrement != null : !this$sizeIncrement.equals(other$sizeIncrement)) return false;
        final Object this$minProvideSize = this.getMinProvideSize();
        final Object other$minProvideSize = other.getMinProvideSize();
        if (this$minProvideSize == null ? other$minProvideSize != null : !this$minProvideSize.equals(other$minProvideSize)) return false;
        final Object this$largeOrderThreshold = this.getLargeOrderThreshold();
        final Object other$largeOrderThreshold = other.getLargeOrderThreshold();
        if (this$largeOrderThreshold == null ? other$largeOrderThreshold != null : !this$largeOrderThreshold.equals(other$largeOrderThreshold)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$baseCurrency = this.getBaseCurrency();
        final Object other$baseCurrency = other.getBaseCurrency();
        if (this$baseCurrency == null ? other$baseCurrency != null : !this$baseCurrency.equals(other$baseCurrency)) return false;
        final Object this$quoteCurrency = this.getQuoteCurrency();
        final Object other$quoteCurrency = other.getQuoteCurrency();
        if (this$quoteCurrency == null ? other$quoteCurrency != null : !this$quoteCurrency.equals(other$quoteCurrency)) return false;
        final Object this$underlying = this.getUnderlying();
        final Object other$underlying = other.getUnderlying();
        if (this$underlying == null ? other$underlying != null : !this$underlying.equals(other$underlying)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof Market;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.isEnabled() ? 79 : 97);
        result = result * PRIME + (this.isPostOnly() ? 79 : 97);
        final long $priceIncrement = Double.doubleToLongBits(this.getPriceIncrement());
        result = result * PRIME + (int) ($priceIncrement >>> 32 ^ $priceIncrement);
        final long $last = Double.doubleToLongBits(this.getLast());
        result = result * PRIME + (int) ($last >>> 32 ^ $last);
        final long $bid = Double.doubleToLongBits(this.getBid());
        result = result * PRIME + (int) ($bid >>> 32 ^ $bid);
        final long $ask = Double.doubleToLongBits(this.getAsk());
        result = result * PRIME + (int) ($ask >>> 32 ^ $ask);
        final long $price = Double.doubleToLongBits(this.getPrice());
        result = result * PRIME + (int) ($price >>> 32 ^ $price);
        result = result * PRIME + (this.isRestricted() ? 79 : 97);
        result = result * PRIME + (this.isTokenizedEquity() ? 79 : 97);
        result = result * PRIME + (this.isHighLeverageFeeExempt() ? 79 : 97);
        final long $change1h = Double.doubleToLongBits(this.getChange1h());
        result = result * PRIME + (int) ($change1h >>> 32 ^ $change1h);
        final long $change24h = Double.doubleToLongBits(this.getChange24h());
        result = result * PRIME + (int) ($change24h >>> 32 ^ $change24h);
        final long $changeBod = Double.doubleToLongBits(this.getChangeBod());
        result = result * PRIME + (int) ($changeBod >>> 32 ^ $changeBod);
        final long $quoteVolume24h = Double.doubleToLongBits(this.getQuoteVolume24h());
        result = result * PRIME + (int) ($quoteVolume24h >>> 32 ^ $quoteVolume24h);
        final long $volumeUsd24h = Double.doubleToLongBits(this.getVolumeUsd24h());
        result = result * PRIME + (int) ($volumeUsd24h >>> 32 ^ $volumeUsd24h);
        final Object $sizeIncrement = this.getSizeIncrement();
        result = result * PRIME + ($sizeIncrement == null ? 43 : $sizeIncrement.hashCode());
        final Object $minProvideSize = this.getMinProvideSize();
        result = result * PRIME + ($minProvideSize == null ? 43 : $minProvideSize.hashCode());
        final Object $largeOrderThreshold = this.getLargeOrderThreshold();
        result = result * PRIME + ($largeOrderThreshold == null ? 43 : $largeOrderThreshold.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $baseCurrency = this.getBaseCurrency();
        result = result * PRIME + ($baseCurrency == null ? 43 : $baseCurrency.hashCode());
        final Object $quoteCurrency = this.getQuoteCurrency();
        result = result * PRIME + ($quoteCurrency == null ? 43 : $quoteCurrency.hashCode());
        final Object $underlying = this.getUnderlying();
        result = result * PRIME + ($underlying == null ? 43 : $underlying.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "Market(name=" + this.getName() + ", enabled=" + this.isEnabled() + ", postOnly=" + this.isPostOnly() + ", priceIncrement=" + this.getPriceIncrement() + ", sizeIncrement=" + this.getSizeIncrement() + ", minProvideSize=" + this.getMinProvideSize() + ", last=" + this.getLast() + ", bid=" + this.getBid() + ", ask=" + this.getAsk() + ", price=" + this.getPrice() + ", type=" + this.getType() + ", baseCurrency=" + this.getBaseCurrency() + ", quoteCurrency=" + this.getQuoteCurrency() + ", underlying=" + this.getUnderlying() + ", restricted=" + this.isRestricted() + ", tokenizedEquity=" + this.isTokenizedEquity() + ", highLeverageFeeExempt=" + this.isHighLeverageFeeExempt() + ", largeOrderThreshold=" + this.getLargeOrderThreshold() + ", change1h=" + this.getChange1h() + ", change24h=" + this.getChange24h() + ", changeBod=" + this.getChangeBod() + ", quoteVolume24h=" + this.getQuoteVolume24h() + ", volumeUsd24h=" + this.getVolumeUsd24h() + ")";
    }
}
    //</editor-fold>
