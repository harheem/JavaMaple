package model.control;

public class Entry {
	private String id;
	private String password;
	private String name;
	private String birthDate;
	
	public Entry(String a, String b, String c, String d)
	{
		this.id = a;
		this.password = b;
		this.name = c;
		this.birthDate = d;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
}
