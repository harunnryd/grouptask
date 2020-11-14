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
public class Query {

    @JsonProperty("format")
    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    String format;

    @JsonProperty("kota")
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    String city;

    @JsonProperty("tanggal")
    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    String date;
}
