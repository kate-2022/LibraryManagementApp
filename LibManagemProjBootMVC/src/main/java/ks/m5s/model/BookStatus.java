package ks.m5s.model;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class BookStatus {
		

//	//creating the instance of LocalDate using the day, month, year info
//	LocalDate localDate = LocalDate.of(2023, 9, 17);

	
	@Id
	private Integer lentBookId;
	private Boolean bookOut = true;
	private LocalDate dateOfLoan= LocalDate.now();
	private Integer libIdOfStudentLoan;
	
//	public BookStatus() {}
	
//	public BookStatus(Books checkBook) {
//		this.lentBookId = book.getBookId();
//	}
	
	

	
	

}
