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
public class Schedule{
    @JsonProperty("status") 
    public String getStatus() { 
		 return this.status; } 
    public void setStatus(String status) { 
		 this.status = status; } 
    String status;
    @JsonProperty("data") 
    public Data getData() { 
		 return this.data; } 
    public void setData(Data data) { 
		 this.data = data; } 
    Data data;
}