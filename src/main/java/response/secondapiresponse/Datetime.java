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
public class Datetime {

    @JsonProperty("times")
    public Times getTimes() {
        return this.times;
    }

    public void setTimes(Times times) {
        this.times = times;
    }
    Times times;

    @JsonProperty("date")
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    Date date;
}
