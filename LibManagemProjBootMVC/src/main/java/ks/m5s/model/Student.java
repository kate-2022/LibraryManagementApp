package ks.m5s.model;

import java.io.Serializable;
import java.sql.Date;
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer enrolNo;
	private String firstName;
	private String lastName;
	private Date doB;
	private Integer studLibId;
	private Integer noOfBooksOut;
	// private List<BookCatalogue> listOfBooksLent;

	private Date dateOfLoan;
	
	

}
