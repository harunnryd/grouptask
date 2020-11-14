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
public class Date{
    @JsonProperty("timestamp") 
    public int getTimestamp() { 
		 return this.timestamp; } 
    public void setTimestamp(int timestamp) { 
		 this.timestamp = timestamp; } 
    int timestamp;
    @JsonProperty("gregorian") 
    public String getGregorian() { 
		 return this.gregorian; } 
    public void setGregorian(String gregorian) { 
		 this.gregorian = gregorian; } 
    String gregorian;
    @JsonProperty("hijri") 
    public String getHijri() { 
		 return this.hijri; } 
    public void setHijri(String hijri) { 
		 this.hijri = hijri; } 
    String hijri;
}
