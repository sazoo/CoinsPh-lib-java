/*
 */
package com.sazoo.coinsph.lib.java.beans;

/**
 *
 * @author DeoEmboltorio
 */
public class Meta {
    private String total_count;
    private String next_page;
    private String previous_page;

    /**
     * @return the total_count
     */
    public String getTotal_count() {
        return total_count;
    }

    /**
     * @param total_count the total_count to set
     */
    public void setTotal_count(String total_count) {
        this.total_count = total_count;
    }

    /**
     * @return the next_page
     */
    public String getNext_page() {
        return next_page;
    }

    /**
     * @param next_page the next_page to set
     */
    public void setNext_page(String next_page) {
        this.next_page = next_page;
    }

    /**
     * @return the previous_page
     */
    public String getPrevious_page() {
        return previous_page;
    }

    /**
     * @param previous_page the previous_page to set
     */
    public void setPrevious_page(String previous_page) {
        this.previous_page = previous_page;
    }
}
