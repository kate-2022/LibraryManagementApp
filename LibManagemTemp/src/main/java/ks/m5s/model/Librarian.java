package ks.m5s.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Librarian implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long LibId;
	
	@NotNull
	private Integer emplNo;
	private String firstName;
	@NotNull
	private String lastName;
	private Date doB;
	@NotEmpty
	@Size(min= 6)
	private String password;
	@NotNull
 	@Email
	private String eMail;
	
//
//	@OneToOne (mappedBy = "librarian", cascade = CascadeType.ALL)
//	@PrimaryKeyJoinColumn
//	private Authorities authorities;
	
//	private Logger logger = LoggerFactory.getLogger(Librarian.class);
	
//	private Date entryDate;

}