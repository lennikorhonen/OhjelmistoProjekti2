package Ohjelmistoprojekti2.raspberryServer.domain;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Raspberry {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Long id;
	private String location;
	private int foundDevices;
	private String geoLocation;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "refDateRasp")
	private List<TimeStamp> timeStamp;

	public Raspberry(){
		super();
	}

	public Raspberry(String location, int foundDevices, String geoLocation) {
		super();
		this.location = location;
		this.foundDevices = foundDevices;
		this.geoLocation = geoLocation;
	}
	
	public Raspberry(String location, int foundDevices, String geoLocation, List<TimeStamp> timeStamp) {
		this.location = location;
		this.foundDevices = foundDevices;
		this.geoLocation = geoLocation;
		this.timeStamp = timeStamp;
	}

	public Long getId() {
		 return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getFoundDevices()  {
		return foundDevices;
	}

	public void setFoundDevices(int foundDevices) {
		this.foundDevices = foundDevices;
	}

	public String getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(String geoLocation) {
		this.geoLocation = geoLocation;
	}

	public List<TimeStamp> getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(List<TimeStamp> timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Raspberry [id=" + id + ", location=" + location + ", foundDevices =" +foundDevices+"]";
	}

	
	
}
