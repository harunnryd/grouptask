/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptask;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import response.secondapiresponse.Root;

/**
 *
 * @author runwols
 */
public class SecondApiProvider implements PrayerProvider {
    public void getPrayerTime() throws IOException {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd");
        String currentDate = formatter.format(date);
        
        try {
             // Create a neat value object to hold the URL
            URL url = new URL("https://api.pray.zone/v2/times/day.json?city=jakarta&date=" + currentDate);

            // Open a connection(?) on the URL(?) and cast the response(??)
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Now it's "open", we can set the request method, headers etc.
            connection.setRequestProperty("accept", "application/json");

            // This line makes the request
            InputStream responseStream = connection.getInputStream();

            // Manually converting the response body InputStream to APOD using Jackson
            ObjectMapper mapper = new ObjectMapper();
            Root response = mapper.readValue(responseStream, Root.class);

            // Finally we have the response
            this.printResponse(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void printResponse(Root response) {
        System.out.println("=== Jadwal Sholat dan Imsakiyah ===");
        System.out.println("[+] Untuk Wilayah DKI Jakarta");
        System.out.println("[+] Tanggal : " + response.getResults().getDatetime().get(1).getDate().getGregorian() + "\n");

        System.out.println("Terbit  : " + response.getResults().getDatetime().get(0).getTimes().getSunrise());
        System.out.println("Subuh   : " + response.getResults().getDatetime().get(0).getTimes().getFajr());
        System.out.println("Dzuhur  : " + response.getResults().getDatetime().get(0).getTimes().getDhuhr());
        System.out.println("Ashar   : " + response.getResults().getDatetime().get(0).getTimes().getAsr());
        System.out.println("Maghrib : " + response.getResults().getDatetime().get(0).getTimes().getMaghrib());
        System.out.println("Isya    : " + response.getResults().getDatetime().get(0).getTimes().getIsha());
        
        System.out.println(
                "\n\"Dan laksanakanlah sholat, tunaikanlah zakat, dan \ntaatlah kepada Rasul (Muhammad), agar kamu diberi rahmat.\"\n(QS. An-Nuur:56)\n");
    }
}