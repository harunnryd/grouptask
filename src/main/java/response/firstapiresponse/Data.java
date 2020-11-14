/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package response.firstapiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author runwols
 */
public class Data {

    @JsonProperty("ashar")
    public String getAsr() {
        return this.asr;
    }

    public void setAsr(String asr) {
        this.asr = asr;
    }
    String asr;

    @JsonProperty("dhuha")
    public String getDhuha() {
        return this.dhuha;
    }

    public void setDhuha(String dhuha) {
        this.dhuha = dhuha;
    }
    String dhuha;

    @JsonProperty("dzuhur")
    public String getDhuhr() {
        return this.dhuhr;
    }

    public void setDhuhr(String dhuhr) {
        this.dhuhr = dhuhr;
    }
    String dhuhr;

    @JsonProperty("imsak")
    public String getImsak() {
        return this.imsak;
    }

    public void setImsak(String imsak) {
        this.imsak = imsak;
    }
    String imsak;

    @JsonProperty("isya")
    public String getIsha() {
        return this.isha;
    }

    public void setIsha(String isha) {
        this.isha = isha;
    }
    String isha;

    @JsonProperty("maghrib")
    public String getMaghrib() {
        return this.maghrib;
    }

    public void setMaghrib(String maghrib) {
        this.maghrib = maghrib;
    }
    String maghrib;

    @JsonProperty("subuh")
    public String getFajr() {
        return this.fajr;
    }

    public void setShubuh(String fajr) {
        this.fajr = fajr;
    }
    String fajr;

    @JsonProperty("tanggal")
    public String getDate() {
        return this.date;
    }

    public void setTanggal(String date) {
        this.date = date;
    }
    String date;

    @JsonProperty("terbit")
    public String getSunrise() {
        return this.sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }
    String sunrise;
}
