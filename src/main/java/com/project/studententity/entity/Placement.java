package com.project.studententity.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="placement")
public class Placement {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
    private Long id;
	
	@Column(name="companyName")
    private String companyname;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pincode")
	private int pincode;
	
	@Column(name="jobRole")
	private String jobrole;

	@Column(name="experience")
    private int experience;
	
	@Column(name="mailId")
    private String mailid;
	
	@Column(name="vacancy")
    private String vacancy;
	
	@Column(name="qualification")
    private String qualification;
	@Column(name="hireDate")
    private String hiredate;	
    
	public Placement() {
 
	}

	public Placement(Long id, String companyname, String city, String state, int pincode, String jobrole,
			int experience, String mailid, String vacancy, String qualification, String hiredate) {
		super();
		this.id = id;
		this.companyname = companyname;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.jobrole = jobrole;
		this.experience = experience;
		this.mailid = mailid;
		this.vacancy = vacancy;
		this.qualification = qualification;
		this.hiredate = hiredate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getJobrole() {
		return jobrole;
	}

	public void setJobrole(String jobrole) {
		this.jobrole = jobrole;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getVacancy() {
		return vacancy;
	}

	public void setVacancy(String vacancy) {
		this.vacancy = vacancy;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, companyname, experience, hiredate, id, jobrole, mailid, pincode, qualification, state,
				vacancy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Placement other = (Placement) obj;
		return Objects.equals(city, other.city) && Objects.equals(companyname, other.companyname)
				&& experience == other.experience && Objects.equals(hiredate, other.hiredate)
				&& Objects.equals(id, other.id) && Objects.equals(jobrole, other.jobrole)
				&& Objects.equals(mailid, other.mailid) && pincode == other.pincode
				&& Objects.equals(qualification, other.qualification) && Objects.equals(state, other.state)
				&& Objects.equals(vacancy, other.vacancy);
	}

	@Override
	public String toString() {
		return "Placement [id=" + id + ", companyname=" + companyname + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + ", jobrole=" + jobrole + ", experience=" + experience + ", mailid=" + mailid
				+ ", vacancy=" + vacancy + ", qualification=" + qualification + ", hiredate=" + hiredate + "]";
	}

	}