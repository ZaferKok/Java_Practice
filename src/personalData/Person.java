package personalData;

public class Person {
	
	private String firstname;
	private String lastname;
	private int birthmonth;
	private int birthday;
	private int birthyear;
	private String ssn;

	Person(String firstname, String lastname,
			int birthmonth, int birthday,
			int birthyear, String ssn) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthmonth = birthmonth;
		this.birthday = birthday;
		this.birthyear = birthyear;
		this.ssn = ssn;
	}

	public void setFirstname(String name) {
		this.firstname = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getBirthday() {
		String brth = birthmonth + "/" + birthday + "/" + birthyear;
		return brth;

	}

	public boolean verifySSN(String social) {
		return social.equals(ssn);
	}

}