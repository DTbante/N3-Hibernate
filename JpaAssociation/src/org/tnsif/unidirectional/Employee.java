package org.tnsif.unidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//program to demonstrate on OneToOne Unidirectional association
@Entity
@Table(name="Employee")
public class Employee implements Serializable{

	@Id
	private Integer empid;
	private String empname;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	
	
	//default constructors
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized onstructors
	public Employee(Integer empid, String empname, Address address) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.address = address;
	}
	
	//getters and setters
	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", address=" + address + "]";
	}
	
	
	
}
