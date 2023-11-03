package ks.m5s.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="authorities")
public class Authorities {
	
	@Id
	private Long LibId;
	
	private String lastName;             
	private String authority;
	
	@OneToOne
	@MapsId
	private Student student;
	
	@OneToOne
	@MapsId
	private Librarian librarian;

}
