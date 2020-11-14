/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package response.secondapiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author runwols
 */
public class Results{
    @JsonProperty("datetime") 
    public List<Datetime> getDatetime() { 
		 return this.datetime; } 
    public void setDatetime(List<Datetime> datetime) { 
		 this.datetime = datetime; } 
    List<Datetime> datetime;
    @JsonProperty("location") 
    public Location getLocation() { 
		 return this.location; } 
    public void setLocation(Location location) { 
		 this.location = location; } 
    Location location;
    @JsonProperty("settings") 
    public Settings getSettings() { 
		 return this.settings; } 
    public void setSettings(Settings settings) { 
		 this.settings = settings; } 
    Settings settings;
}
