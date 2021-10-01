package entity;

public class Student {

	private int rollno;

	private String firstname;

	private String lastname;

	public Student(int rollno, String firstname, String lastname) {
		super();
		this.rollno = rollno;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
