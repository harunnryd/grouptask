/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package response.secondapiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author runwols
 */
public class Times {

    @JsonProperty("Imsak")
    public String getImsak() {
        return this.imsak;
    }

    public void setImsak(String imsak) {
        this.imsak = imsak;
    }
    String imsak;

    @JsonProperty("Sunrise")
    public String getSunrise() {
        return this.sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }
    String sunrise;

    @JsonProperty("Fajr")
    public String getFajr() {
        return this.fajr;
    }

    public void setFajr(String fajr) {
        this.fajr = fajr;
    }
    String fajr;

    @JsonProperty("Dhuhr")
    public String getDhuhr() {
        return this.dhuhr;
    }

    public void setDhuhr(String dhuhr) {
        this.dhuhr = dhuhr;
    }
    String dhuhr;

    @JsonProperty("Asr")
    public String getAsr() {
        return this.asr;
    }

    public void setAsr(String asr) {
        this.asr = asr;
    }
    String asr;

    @JsonProperty("Sunset")
    public String getSunset() {
        return this.sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }
    String sunset;

    @JsonProperty("Maghrib")
    public String getMaghrib() {
        return this.maghrib;
    }

    public void setMaghrib(String maghrib) {
        this.maghrib = maghrib;
    }
    String maghrib;

    @JsonProperty("Isha")
    public String getIsha() {
        return this.isha;
    }

    public void setIsha(String isha) {
        this.isha = isha;
    }
    String isha;

    @JsonProperty("Midnight")
    public String getMidnight() {
        return this.midnight;
    }

    public void setMidnight(String midnight) {
        this.midnight = midnight;
    }
    String midnight;
}
