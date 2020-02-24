package model;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private String streetaddress;
	private String postoffice;
	private String postcode;
	
	public Student() {
		id = -1;
		firstName = "";
		lastName = "";
		streetaddress = "";
		postoffice = "";
		postcode = "";
		
	}
	
	public Student(int id, String firstName, String lastName, String streetaddress, String postoffice,
			String postcode) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetaddress = streetaddress;
		this.postoffice = postoffice;
		this.postcode = postcode;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getStreetaddress() {
		return streetaddress;
	}
	
	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}
	
	public String getPostoffice() {
		return postoffice;
	}
	
	public void setPostoffice(String postoffice) {
		this.postoffice = postoffice;
	}
	
	public String getPostcode() {
		return postcode;
	}
	
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	
}
