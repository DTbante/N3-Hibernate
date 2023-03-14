package org.tnsif.unidirectional;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address implements Serializable{

	//private data members
	private Integer pincode;
	private String area;
	private String city;
	private String state;
	
	//getters and setters
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	//toString
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", area=" + area + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
