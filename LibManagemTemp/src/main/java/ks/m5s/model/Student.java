package ks.m5s.model;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="students")
@Data
@Getter
@NoArgsConstructor
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long LibId;
	
	@NotNull
	private Integer enrolNo;
	private String firstName;
	@NotNull
	private String lastName;
	private Date doB;
	@NotEmpty
	@Size(min= 6)
	private String password;
	private int enabled;
	@NotNull
// 	@Email
	private String eMail;
	private Integer noOfBooksOut =0;
	
	@OneToOne (mappedBy ="student", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Authorities authorities;
	 
	
	// private ArrayList<Books> booksLoan;
	

}
