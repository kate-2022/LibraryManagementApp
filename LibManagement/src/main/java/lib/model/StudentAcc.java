package lib.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTS")
public class StudentAcc {
	
	Integer enrollmentNo;
	String firstName;
	String lastName;
	Integer libId;
	

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


	@Override
	public String toString() {
		return "StudentAcc [enrollmentNo=" + enrollmentNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", libId=" + libId + "]";
	}
	
	
	

}
