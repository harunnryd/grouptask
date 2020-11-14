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
public class Root{
    @JsonProperty("code") 
    public int getCode() { 
		 return this.code; } 
    public void setCode(int code) { 
		 this.code = code; } 
    int code;
    @JsonProperty("status") 
    public String getStatus() { 
		 return this.status; } 
    public void setStatus(String status) { 
		 this.status = status; } 
    String status;
    @JsonProperty("results") 
    public Results getResults() { 
		 return this.results; } 
    public void setResults(Results results) { 
		 this.results = results; } 
    Results results;
}
