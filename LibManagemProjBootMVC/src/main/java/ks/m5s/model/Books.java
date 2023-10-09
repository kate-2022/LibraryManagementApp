package ks.m5s.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
//import ks.m5s.service.BookStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	private String bookName;
	private String authorLastName;
	private String authorFirstName;
	private Integer yearOfPublication;

	


}
