package model;
import java.time.LocalDate;

public class Astrozone_entervalues {
	private String name;
	private String gender;
	private String dob;
	public Astrozone_entervalues(String name, String gender, String dob){
		this.name = name;
		this.gender = gender;
		this.dob = dob;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
}
}