/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptask;

import com.fasterxml.jackson.databind.ObjectMapper;

import response.firstapiresponse.Root;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author runwols
 */
public class FirstApiProvider implements PrayerProvider {

    public void getPrayerTime() throws IOException {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd");
        String currentDate = formatter.format(date);

        try {
            // Create a neat value object to hold the URL
            URL url = new URL("https://api.banghasan.com/sholat/format/json/jadwal/kota/667/tanggal/" + currentDate);

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
        System.out.println("=== Jadwal Sholat dan Imsakiyah dari Provider #1 ===");
        System.out.println("[+] Untuk Wilayah DKI Jakarta");
        System.out.println("[+] Tanggal : " + response.getQuery().getDate() + "\n");

        System.out.println("Terbit  : " + response.getSchedule().getData().getSunrise());
        System.out.println("Dhuha   : " + response.getSchedule().getData().getDhuha());
        System.out.println("Subuh   : " + response.getSchedule().getData().getFajr());
        System.out.println("Dzuhur  : " + response.getSchedule().getData().getDhuhr());
        System.out.println("Ashar   : " + response.getSchedule().getData().getAsr());
        System.out.println("Maghrib : " + response.getSchedule().getData().getMaghrib());
        System.out.println("Isya    : " + response.getSchedule().getData().getIsha());

        System.out.println(
                "\n\"Dan laksanakanlah sholat, tunaikanlah zakat, dan \ntaatlah kepada Rasul (Muhammad), agar kamu diberi rahmat.\"\n(QS. An-Nuur:56)\n");
    }
}
