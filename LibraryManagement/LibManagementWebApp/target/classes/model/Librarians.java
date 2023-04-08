package lib.model;

@Entity
@Table(name="Librarians")
public class Librarians {
	
	private Integer eid;
	private String lastName;
	private Date doJoyning;
	
	
	
	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	
	public String lastName() {
		return lastName;
	}


	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	public Date getDoJoyning() {
		return getDoJoyning;
	}

	public void setDoJoyning(Date doJoyning) {
		this.doJoyning = doJoyning;
	}
	
	@Override
	public String toString() {
		return "Librarians [employee Id=" + eid + ", last name=" + lastName + ", date od joyning="
				+ doJoyning + "]";
	}

}
