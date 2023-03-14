package org.tnsif.tableperclass;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Emp_store")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

//Program to demonstrate on TablePerClass Inheritance 
public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
