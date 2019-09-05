package tws.entity;

public class Form {
	private String id;
	private String person;
	private String phone;
	private String weight;
	
	
	public Form() {
	
	}
	public Form(String id, String person, String phone, String weight) {
		super();
		this.id = id;
		this.person = person;
		this.phone = phone;
		this.weight = weight;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	

}
