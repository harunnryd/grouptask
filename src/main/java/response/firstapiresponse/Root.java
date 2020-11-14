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
public class Root {

    @JsonProperty("status")
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    String status;

    @JsonProperty("query")
    public Query getQuery() {
        return this.query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
    Query query;

    @JsonProperty("jadwal")
    public Schedule getSchedule() {
        return this.schedule;
    }

    public void setJadwal(Schedule schedule) {
        this.schedule = schedule;
    }
    Schedule schedule;
}
