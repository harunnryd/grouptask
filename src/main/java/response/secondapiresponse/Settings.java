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
public class Settings{
    @JsonProperty("timeformat") 
    public String getTimeformat() { 
		 return this.timeformat; } 
    public void setTimeformat(String timeformat) { 
		 this.timeformat = timeformat; } 
    String timeformat;
    @JsonProperty("school") 
    public String getSchool() { 
		 return this.school; } 
    public void setSchool(String school) { 
		 this.school = school; } 
    String school;
    @JsonProperty("juristic") 
    public String getJuristic() { 
		 return this.juristic; } 
    public void setJuristic(String juristic) { 
		 this.juristic = juristic; } 
    String juristic;
    @JsonProperty("highlat") 
    public String getHighlat() { 
		 return this.highlat; } 
    public void setHighlat(String highlat) { 
		 this.highlat = highlat; } 
    String highlat;
    @JsonProperty("fajr_angle") 
    public double getFajr_angle() { 
		 return this.fajr_angle; } 
    public void setFajr_angle(double fajr_angle) { 
		 this.fajr_angle = fajr_angle; } 
    double fajr_angle;
    @JsonProperty("isha_angle") 
    public double getIsha_angle() { 
		 return this.isha_angle; } 
    public void setIsha_angle(double isha_angle) { 
		 this.isha_angle = isha_angle; } 
    double isha_angle;
}
