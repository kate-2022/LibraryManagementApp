package ks.m5s.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;
//import ks.m5s.service.BookStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books implements Comparable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;
	@NotNull
	private String bookName;
	@NotNull
	private String authorLastName;
	private String authorFirstName;
	private String subjectArea;
	@NotNull
	private Integer yearOfPublication;
	@NotNull
	private Boolean bookStatus = false;
	private LocalDate dateOfLoan = LocalDate.now();
	private Long libIdOfLoan;
	
	int i;
	
	@Override
	public int compareTo(Object o) {
		return i;
	}
	
	
	
	//private Logger logger = LoggerFactory.getLogger(Books.class);

}
