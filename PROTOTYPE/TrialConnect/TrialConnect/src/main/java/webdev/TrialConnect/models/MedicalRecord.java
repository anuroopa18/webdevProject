package webdev.TrialConnect.models;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class MedicalRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String gender;
	private String problems;
	private List<String> medicine;
	private List<String> results;
	private List<Date> visits;
	

	@ManyToOne
	@JsonIgnore
	private Patient patient;
	
	 @OneToMany(mappedBy="medical_record")
	 private List<Vitals> vitals;
	 
	 @OneToMany(mappedBy="medical_record")
	 private List<Doctor> doctor;
	 
	 public List<Doctor> getDoctor() {
		return doctor;
	}
	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}
	@OneToMany(mappedBy="medical_record")
	 private List<Allergy> allergy;
	 
	 @OneToMany(mappedBy="medical_record")
	 private List<Vaccine> vaccine;
	 
	 
	public List<Allergy> getAllergy() {
		return allergy;
	}
	public void setAllergy(List<Allergy> allergy) {
		this.allergy = allergy;
	}
	public List<Vaccine> getVaccine() {
		return vaccine;
	}
	public void setVaccine(List<Vaccine> vaccine) {
		this.vaccine = vaccine;
	}
	public List<Vitals> getVitals() {
		return vitals;
	}
	public void setVitals(List<Vitals> vitals) {
		this.vitals = vitals;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProblems() {
		return problems;
	}
	public void setProblems(String problems) {
		this.problems = problems;
	}
	public List<String> getMedicine() {
		return medicine;
	}
	public void setMedicine(List<String> medicine) {
		this.medicine = medicine;
	}
	public List<String> getResults() {
		return results;
	}
	public void setResults(List<String> results) {
		this.results = results;
	}
	public List<Date> getVisits() {
		return visits;
	}
	public void setVisits(List<Date> visits) {
		this.visits = visits;
	}
	
	
	
	
	

}
