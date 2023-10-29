package ks.m5s.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@OneToOne (mappedBy ="user", cascade =  CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private String username;
	private String password;
	private int enabled;
}
