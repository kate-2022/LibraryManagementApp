package ks.m5s.model;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class BookStatus {
	


	
//	//default time zone
//	ZoneId defaultZoneId = ZoneId.systemDefault();
//	
//	//creating the instance of LocalDate using the day, month, year info
//	LocalDate localDate = LocalDate.of(2023, 9, 17);
//	
//	//local date + atStartOfDay() + default time zone + toInstant() = Date
//	Date dateNow = (Date) Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
	
	@Id
	private Integer lentBookId;
	private Boolean bookOut;
	private LocalDate dateOfLoan= LocalDate.now();
	private Integer libIdOfStudentLoan;
	
//	public BookStatus() {}
	
//	public BookStatus(Books checkBook) {
//		this.lentBookId = book.getBookId();
//	}
//	
	
	
	//Displaying LocalDate and Date
//	System.out.println("LocalDate is: " + localDate);
//	System.out.println("Date is: " + dateNow);
//	
	
	

}
