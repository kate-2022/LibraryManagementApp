package lib.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.Session;

@Entity
@Table(name ="TOPICS")
public class Fields {
	
	Session session;
	
	private String fieldDescription;
	private int bid;
	private int field;
	
	
	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}


	public String getFieldDescription() {
		return fieldDescription;
	}

	public void setFieldDescription(String fieldDescription) {
		this.fieldDescription = fieldDescription;
	}


	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}



	public int getField() {
		return field;
	}



	public void setField(int field) {
		this.field = field;
	}



	@Override
	public String toString() {
		return "Fields [field description=" + fieldDescription + ", book id=" + bid + ", field number="
				+ field + "]";
	}
	
	
	
}
	