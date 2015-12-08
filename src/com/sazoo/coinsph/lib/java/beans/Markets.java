/*
 */
package com.sazoo.coinsph.lib.java.beans;

/**
 *
 * @author DeoEmboltorio
 */
public class Markets {
    
    private String symbol;
    private String product;
    private String bid;
    private String ask;
    private String expires_in_seconds;

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @param symbol the symbol to set
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the bid
     */
    public String getBid() {
        return bid;
    }

    /**
     * @param bid the bid to set
     */
    public void setBid(String bid) {
        this.bid = bid;
    }

    /**
     * @return the ask
     */
    public String getAsk() {
        return ask;
    }

    /**
     * @param ask the ask to set
     */
    public void setAsk(String ask) {
        this.ask = ask;
    }

    /**
     * @return the expires_in_seconds
     */
    public String getExpires_in_seconds() {
        return expires_in_seconds;
    }

    /**
     * @param expires_in_seconds the expires_in_seconds to set
     */
    public void setExpires_in_seconds(String expires_in_seconds) {
        this.expires_in_seconds = expires_in_seconds;
    }
}
