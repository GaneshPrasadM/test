package com.websystique.spring.model;

import java.io.Serializable;

public class MeerkatParameters implements Serializable {
	
	private int buldingNumber;
	private String streetName;
	private int postalCode;
	private int longitude;
	private int latitude;
	private String city;
	private String country;
	private String state;
	private String service;
	private String technology;
	private int speed;
	private int load;
	
	public int getBuldingNumber() {
		return buldingNumber;
	}
	public void setBuldingNumber(int buldingNumber) {
		this.buldingNumber = buldingNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCOde) {
		this.postalCode = postalCOde;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getLoad() {
		return load;
	}
	public void setLoad(int load) {
		this.load = load;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + buldingNumber;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + latitude;
		result = prime * result + load;
		result = prime * result + longitude;
		result = prime * result + postalCode;
		result = prime * result + ((service == null) ? 0 : service.hashCode());
		result = prime * result + speed;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result + ((technology == null) ? 0 : technology.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MeerkatParameters other = (MeerkatParameters) obj;
		if (buldingNumber != other.buldingNumber)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (latitude != other.latitude)
			return false;
		if (load != other.load)
			return false;
		if (longitude != other.longitude)
			return false;
		if (postalCode != other.postalCode)
			return false;
		if (service == null) {
			if (other.service != null)
				return false;
		} else if (!service.equals(other.service))
			return false;
		if (speed != other.speed)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (technology == null) {
			if (other.technology != null)
				return false;
		} else if (!technology.equals(other.technology))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "MeerkatParameters [buldingNumber=" + buldingNumber + ", streetName=" + streetName + ", postalCode=" + postalCode + ", longitude=" + longitude + ", latitude=" + latitude + ", city=" + city + ", country=" + country + ", state=" + state + ", service=" + service + ", technology=" + technology + ", speed=" + speed + ", load=" + load + "]";
	
	}

}
