package com.redcross.survey.extractor.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "biomedical_volunteer_survey")
public class BiomedicalVolunteerSurvey {

	@Id @GeneratedValue
	@Column(name = "p_key")
	private Long pKey;
	
	@Column(name = "id")
	private String id;
	
	@Column(name = "start_time")
	private String startTime;
	
	@Column(name = "completion_time")
	private String completionTime;

	@Column(name = "email")
	private String email;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "full_name")
	@Lob
	private String fullName;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "volunteering_date")
	private String volunteeringDate;
	
	@Column(name = "blood_drive_name")
	private String bloodDriveName;
	
	@Column(name = "volunteer_role")
	private String volunteerRole;
	
	@Column(name = "q1")
	private String q1;
	
	@Column(name = "q2")
	private String q2;
	
	@Column(name = "q3")
	private String q3;
	
	@Column(name = "q4")
	private String q4;
	
	@Column(name = "q5")
	private String q5;
	
	@Column(name = "q6")
	@Lob
	private String q6;
	
	@Column(name = "concern")
	@Lob
	private String concern;
	
	@Column(name = "comment")
	@Lob
	private String comment;
	
	@Column(name = "question")
	@Lob
	private String question;

	public Long getpKey() {
		return pKey;
	}

	public void setpKey(Long pKey) {
		this.pKey = pKey;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getCompletionTime() {
		return completionTime;
	}

	public void setCompletionTime(String completionTime) {
		this.completionTime = completionTime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getVolunteeringDate() {
		return volunteeringDate;
	}

	public void setVolunteeringDate(String volunteeringDate) {
		this.volunteeringDate = volunteeringDate;
	}

	public String getBloodDriveName() {
		return bloodDriveName;
	}

	public void setBloodDriveName(String bloodDriveName) {
		this.bloodDriveName = bloodDriveName;
	}

	public String getVolunteerRole() {
		return volunteerRole;
	}

	public void setVolunteerRole(String volunteerRole) {
		this.volunteerRole = volunteerRole;
	}

	public String getQ1() {
		return q1;
	}

	public void setQ1(String q1) {
		this.q1 = q1;
	}

	public String getQ2() {
		return q2;
	}

	public void setQ2(String q2) {
		this.q2 = q2;
	}

	public String getQ3() {
		return q3;
	}

	public void setQ3(String q3) {
		this.q3 = q3;
	}

	public String getQ4() {
		return q4;
	}

	public void setQ4(String q4) {
		this.q4 = q4;
	}

	public String getQ5() {
		return q5;
	}

	public void setQ5(String q5) {
		this.q5 = q5;
	}

	public String getQ6() {
		return q6;
	}

	public void setQ6(String q6) {
		this.q6 = q6;
	}

	public String getConcern() {
		return concern;
	}

	public void setConcern(String concern) {
		this.concern = concern;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "BiomedicalVolunteerSurvey [pKey=" + pKey + ", id=" + id + ", startTime=" + startTime
				+ ", completionTime=" + completionTime + ", email=" + email + ", name=" + name + ", fullName="
				+ fullName + ", state=" + state + ", volunteeringDate=" + volunteeringDate + ", bloodDriveName="
				+ bloodDriveName + ", volunteerRole=" + volunteerRole + ", q1=" + q1 + ", q2=" + q2 + ", q3=" + q3
				+ ", q4=" + q4 + ", q5=" + q5 + ", q6=" + q6 + ", concern=" + concern + ", comment=" + comment
				+ ", question=" + question + "]";
	}
	
	
}
