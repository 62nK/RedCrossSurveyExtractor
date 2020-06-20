package com.redcross.survey.extractor.service.impl;

import com.redcross.survey.extractor.domain.BiomedicalVolunteerSurvey;

public class BiomedicalVolunteerSurveyFormatUtil {
	
	public static final String VALUE_SEPARATOR = ",";
	public static final int ID = 0;
	public static final int START_TIME = 1;
	public static final int COMPLETION_TIME = 2;
	public static final int EMAIL = 3;
	public static final int NAME = 4;
	public static final int FULL_NAME = 5;
	public static final int STATE = 6;
	public static final int VOLUNTEERING_DATE = 7;
	public static final int BLOOD_DRIVE_NAME = 8;
	public static final int VOLUNTEER_ROLE = 9;
	public static final int Q1 = 10;
	public static final int Q2 = 11;
	public static final int Q3 = 12;
	public static final int Q4 = 13;
	public static final int Q5 = 14;
	public static final int Q6 = 15;
	public static final int CONCERN = 16;
	public static final int COMMENT = 17;
	public static final int QUESTION = 18;

	public static BiomedicalVolunteerSurvey csvLineToBiomedicalVolunteerSurvey(String line) {
		
		String[] splitUpLine = line.split(VALUE_SEPARATOR);
		
		BiomedicalVolunteerSurvey biomedicalVolunteerSurvey = new BiomedicalVolunteerSurvey();
		
		try {
			biomedicalVolunteerSurvey.setId(splitUpLine[ID]);
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setStartTime(splitUpLine[START_TIME]);
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setCompletionTime(splitUpLine[COMPLETION_TIME]);
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try{
			biomedicalVolunteerSurvey.setEmail(splitUpLine[EMAIL]);
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setName(splitUpLine[NAME]);
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setFullName(splitUpLine[FULL_NAME]);
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setState(
					extendIfStateCode(splitUpLine[STATE].toUpperCase().replaceAll("[^A-Z ]", "").trim()));
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setVolunteeringDate(splitUpLine[VOLUNTEERING_DATE]);
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setBloodDriveName(splitUpLine[BLOOD_DRIVE_NAME]);
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setVolunteerRole(splitUpLine[VOLUNTEER_ROLE]);
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setQ1(splitUpLine[Q1].toLowerCase().replaceAll("[^a-z]", "").trim());
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setQ2(splitUpLine[Q2].toLowerCase().replaceAll("[^a-z]", "").trim());
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setQ3(splitUpLine[Q3].toLowerCase().replaceAll("[^a-z]", "").trim());
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setQ4(splitUpLine[Q4].toLowerCase().replaceAll("[^a-z]", "").trim());
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setQ5(splitUpLine[Q5].toLowerCase().replaceAll("[^a-z]", "").trim());
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setQ6(splitUpLine[Q6]);
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setConcern(splitUpLine[CONCERN]);
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setComment(splitUpLine[COMMENT]);
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		try {
			biomedicalVolunteerSurvey.setQuestion(splitUpLine[QUESTION]);
		} catch(ArrayIndexOutOfBoundsException e) { System.err.print("col: "+e.getMessage()+" @line:"+ line+"\n");}
		
		return biomedicalVolunteerSurvey;
	}
	
	private static String extendIfStateCode(String stateCode) {
		if(stateCode.length() > 2)
			return stateCode;
		else {
			switch(stateCode){
				case "AL":
					return "ALABAMA";
					
				case "AK":
					return "ALASKA";
					
				case "AZ":
					return "ARIZONA";
					
				case "CA":
					return "CALIFORNIA";
					
				case "CO":
					return "COLORADO";
					
				case "CT":
					return "CONNECTICUT";
					
				case "DE":
					return "DELAWARE";
					
				case "FL":
					return "FLORIDA";
					
				case "GA":
					return "GEORGIA";
					
				case "HI":
					return "HAWAII";
					
				case "ID":
					return "IDAHO";
					
				case "IL":
					return "ILLINOIS";
					
				case "IN":
					return "INDIANA";
					
				case "IA":
					return "IOWA";
					
				case "KS":
					return "KANSAS";
					
				case "KY":
					return "KENTUCKY";
					
				case "LA":
					return "LOUISIANA";
					
				case "ME":
					return "MAINE";
					
				case "MD":
					return "MARYLAND";
					
				case "MA":
					return "MASSACHUSETTS";
					
				case "MI":
					return "MICHIGAN";
					
				case "MN":
					return "MINNESOTA";
					
				case "MS":
					return "MISSISSIPPI";
					
				case "MO":
					return "MISSOURI";
					
				case "MT":
					return "MONTANA";
					
				case "NE":
					return "NEBRASKA";
					
				case "NV":
					return "NEVADA";
					
				case "NH":
					return "NEW HAMPSHIRE";
					
				case "NJ":
					return "NEW JERSEY";
					
				case "NM":
					return "NEW MEXICO";
					
				case "NY":
					return "NEW YORK";
					
				case "NC":
					return "NORTH CAROLINA";
					
				case "ND":
					return "NORTH DAKOTA";
					
				case "OH":
					return "OHIO";
					
				case "OK":
					return "OKLAHOMA";
					
				case "OR":
					return "OREGON";
					
				case "PA":
					return "PENNSYLVANIA";
					
				case "RI":
					return "RHODE ISLAND";
					
				case "SC":
					return "SOUTH CAROLINA";
					
				case "SD":
					return "SOUTH DAKOTA";
					
				case "TN":
					return "TENNESSEE";
					
				case "TX":
					return "TEXAS";
					
				case "UT":
					return "UTAH";
					
				case "VT":
					return "VERMONT";
					
				case "VA":
					return "VIRGINIA";
					
				case "WA":
					return "WASHINGTON";
					
				case "WV":
					return "WEST VIRGINIA";
					
				case "WI":
					return "WISCONSIN";
					
				case "WY":
					return "WYOMING";
					
				default:
					return stateCode;
					 
			}
		}
	}

}
