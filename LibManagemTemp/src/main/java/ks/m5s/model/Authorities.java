package ks.m5s.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="authorities")
public class Authorities {
	
	@Id
	@OneToOne
	@MapsId
	private String username;              //Foreign key referencing to User table
	private String authority;

}
