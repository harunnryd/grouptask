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
public class Location{
    @JsonProperty("latitude") 
    public double getLatitude() { 
		 return this.latitude; } 
    public void setLatitude(double latitude) { 
		 this.latitude = latitude; } 
    double latitude;
    @JsonProperty("longitude") 
    public double getLongitude() { 
		 return this.longitude; } 
    public void setLongitude(double longitude) { 
		 this.longitude = longitude; } 
    double longitude;
    @JsonProperty("elevation") 
    public double getElevation() { 
		 return this.elevation; } 
    public void setElevation(double elevation) { 
		 this.elevation = elevation; } 
    double elevation;
    @JsonProperty("city") 
    public String getCity() { 
		 return this.city; } 
    public void setCity(String city) { 
		 this.city = city; } 
    String city;
    @JsonProperty("country") 
    public String getCountry() { 
		 return this.country; } 
    public void setCountry(String country) { 
		 this.country = country; } 
    String country;
    @JsonProperty("country_code") 
    public String getCountryCode() { 
		 return this.countryCode; } 
    public void setCountryCode(String countryCode) { 
		 this.countryCode = countryCode; } 
    String countryCode;
    @JsonProperty("timezone") 
    public String getTimezone() { 
		 return this.timezone; } 
    public void setTimezone(String timezone) { 
		 this.timezone = timezone; } 
    String timezone;
    @JsonProperty("local_offset") 
    public double getLocalOffset() { 
		 return this.localOffset; } 
    public void setLocalOffset(double localOffset) { 
		 this.localOffset = localOffset; } 
    double localOffset;
}
