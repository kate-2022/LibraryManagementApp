package ks.m5s.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


@Entity
@Table(name="users")
public class User {
	
	@Id
//	@OneToOne (mappedBy ="user", cascade =  CascadeType.ALL)
//	@PrimaryKeyJoinColumn
	private String username;
	private String password;
	private int enabled;
	
	
//	private Logger logger = LoggerFactory.getLogger(User.class);
}
