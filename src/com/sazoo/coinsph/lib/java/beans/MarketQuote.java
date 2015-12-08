/*
 */
package com.sazoo.coinsph.lib.java.beans;

import java.util.List;

/**
 *
 * @author DeoEmboltorio
 */
public class MarketQuote {
    private Meta meta;
    private List<Markets> markets;

    /**
     * @return the meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * @param meta the meta to set
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * @return the markets
     */
    public List<Markets> getMarkets() {
        return markets;
    }

    /**
     * @param markets the markets to set
     */
    public void setMarkets(List<Markets> markets) {
        this.markets = markets;
    }
}
