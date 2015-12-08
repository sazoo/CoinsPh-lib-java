/*
 */
package com.sazoo.coinsph.lib.java;

import com.eclipsesource.json.JsonObject;
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
    
    public String getBidPrice(){
        String line = "";
        line = this.httpGET(CoinsPhMarketsURL);
        System.out.println(line);
        System.out.println(JsonObject.readFrom(line).get("BTC-CLP"));
        return line;
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

            System.out.println("Response Code : "
                    + response.getStatusLine().getStatusCode());

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
