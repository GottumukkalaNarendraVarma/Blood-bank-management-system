package org.hcl.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Bloodrequests")
public class RequestBlood {
	@Id
	private Integer requesterId;
	private String patientName;
	private String reqBloodGroup;
	private String city;
	private String doctorName;
	private String hospitalName;
	private String hospitalAddress;
	private String date;
	private String contactName;
	private String contactNumber;
	private String contactEmail;
	private String msg;

	public RequestBlood() {
		// TODO Auto-generated constructor stub
	}

	public RequestBlood(Integer requesterId, String patientName, String reqBloodGroup, String city, String doctorname,
			String hospitalName, String hospitalAddress, String date, String contactName, String contactNumber,
			String contactEmail, String msg) {
		super();
		this.requesterId = requesterId;
		this.patientName = patientName;
		this.reqBloodGroup = reqBloodGroup;
		this.city = city;
		this.doctorName = doctorname;
		this.hospitalName = hospitalName;
		this.hospitalAddress = hospitalAddress;
		this.date = date;
		this.contactName = contactName;
		this.contactNumber = contactNumber;
		this.contactEmail = contactEmail;
		this.msg = msg;
	}

	public Integer getRequesterId() {
		return requesterId;
	}

	public void setRequesterId(Integer requesterId) {
		this.requesterId = requesterId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getReqBloodGroup() {
		return reqBloodGroup;
	}

	public void setReqBloodGroup(String reqBloodGroup) {
		this.reqBloodGroup = reqBloodGroup;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorname) {
		this.doctorName = doctorname;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
