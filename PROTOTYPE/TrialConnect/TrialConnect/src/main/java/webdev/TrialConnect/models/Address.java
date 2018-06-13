package webdev.TrialConnect.models;
import javax.persistence.*;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String street;
	private String apartment;
	private String city;
	private String state;
	private String country;
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL, 
            fetch = FetchType.LAZY, optional = false)
    private Doctor doctor;
	
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL, 
            fetch = FetchType.LAZY, optional = false)
    private Patient patient;
	
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL, 
            fetch = FetchType.LAZY, optional = false)
    private Collaborator collaborator;
	
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL, 
            fetch = FetchType.LAZY, optional = false)
    private Sponsor sponsor;
	
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Collaborator getCollaborator() {
		return collaborator;
	}
	public void setCollaborator(Collaborator collaborator) {
		this.collaborator = collaborator;
	}
	public Sponsor getSponsor() {
		return sponsor;
	}
	public void setSponsor(Sponsor sponsor) {
		this.sponsor = sponsor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getApartment() {
		return apartment;
	}
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
