package ks.m5s.model;

import java.time.LocalDate;import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import ks.m5s.service.BookStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Books {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	private String bookName;
	private String authorLastName;
	private String authorFirstName;
	private Integer yearOfPublication;

	


}
