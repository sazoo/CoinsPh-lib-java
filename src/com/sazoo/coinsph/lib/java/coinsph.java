/*
 */
package com.sazoo.coinsph.lib.java;

import com.eclipsesource.json.JsonObject;
import com.google.gson.Gson;
import com.sazoo.coinsph.lib.java.beans.MarketQuote;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static org.apache.http.HttpHeaders.USER_AGENT;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 *
 * @author DeoEmboltorio
 */
public class coinsph {

    public static final String CoinsPhMarketsURL = "https://quote.coins.ph/v1/markets";

    Gson gson = new Gson();

    /**
     * This method gets the current bid price of the currency provided in the 
     * parameter.
     * CLP - Chilean Peso
     * HKD - Hongkong Dollar
     * IDR - Indonesian Rupiah
     * MYR - Malaysian Ringgit
     * PHP - Philippine Peso
     * THB - Thailand Baht
     * TWD - Taiwan Dollar
     * USD - US Dollar
     * VND - Vietnamese Dong
     * @param currency - Currency bid price
     * @return 
     */
    public String getBidPrice(String currency) {
        String line = "";
        line = this.httpGET(CoinsPhMarketsURL);
        MarketQuote obj = gson.fromJson(line, MarketQuote.class);

        for(int i = 0; i < obj.getMarkets().size(); i++){
            if(obj.getMarkets().get(i).getSymbol().equals("BTC-"+ currency)){
                return obj.getMarkets().get(i).getBid();
            }
        }
        return obj.getMarkets().get(4).getBid();//default to Philippine Peso
    }
    
    /**
     * This method gets the current ask price of the currency provided in the 
     * parameter.
     * CLP - Chilean Peso
     * HKD - Hongkong Dollar
     * IDR - Indonesian Rupiah
     * MYR - Malaysian Ringgit
     * PHP - Philippine Peso
     * THB - Thailand Baht
     * TWD - Taiwan Dollar
     * USD - US Dollar
     * VND - Vietnamese Dong
     * @param currency - Currency bid price
     * @return 
     */
    public String getAskPrice(String currency) {
        String line = "";
        line = this.httpGET(CoinsPhMarketsURL);
        MarketQuote obj = gson.fromJson(line, MarketQuote.class);

        for(int i = 0; i < obj.getMarkets().size(); i++){
            if(obj.getMarkets().get(i).getSymbol().equals("BTC-"+ currency)){
                return obj.getMarkets().get(i).getAsk();
            }
        }
        return obj.getMarkets().get(4).getAsk();//default to Philippine Peso
    }

    private String httpGET(String url) {
        String line = "";
        StringBuffer result = new StringBuffer();

        try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(url);

            // add request header
            request.addHeader("User-Agent", USER_AGENT);
            HttpResponse response = client.execute(request);

            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(response.getEntity().getContent()));

            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result.toString();
    }

}
