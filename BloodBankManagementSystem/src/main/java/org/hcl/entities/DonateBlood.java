package org.hcl.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Blooddonations")
public class DonateBlood {
	@Id
	private Integer patientId;
	private String timeOfTheDay;
	private Integer bloodGlucoseLevel;
	private String notes;

	public DonateBlood() {
		// TODO Auto-generated constructor stub
	}

	public DonateBlood(Integer patientId, String timeOfTheDay, Integer bloodGlucoseLevel, String notes) {
		super();
		this.patientId = patientId;
		this.timeOfTheDay = timeOfTheDay;
		this.bloodGlucoseLevel = bloodGlucoseLevel;
		this.notes = notes;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getTimeOfTheDay() {
		return timeOfTheDay;
	}

	public void setTimeOfTheDay(String timeOfTheDay) {
		this.timeOfTheDay = timeOfTheDay;
	}

	public Integer getBloodGlucoseLevel() {
		return bloodGlucoseLevel;
	}

	public void setBloodGlucoseLevel(Integer bloodGlucoseLevel) {
		this.bloodGlucoseLevel = bloodGlucoseLevel;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
