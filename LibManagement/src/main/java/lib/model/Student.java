package lib.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTS")
public class Student  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer libId;
	Integer enrollmentNo;
	String firstName;
	String lastName;

	Date doB;
	
	

	public Integer getEnrollmentNo() {
		return enrollmentNo;
	}

	public void setEnrollmentNo(Integer enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Integer getLibId() {
		return libId;
	}


	public void setLibId(Integer libId) {
		this.libId = libId;
	}
	
	public Date getDoB() {
		return doB;
	}
	
	public void setDoB(Date doB) {
		this.doB = doB;
	}
	


	@Override
	public String toString() {
		return "StudentAcc [enrollmentNo=" + enrollmentNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", libId=" + libId + "]";
	}
	
	
	

}
