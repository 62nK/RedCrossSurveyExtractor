package com.redcross.survey.extractor.service;

import java.util.List;

import com.redcross.survey.extractor.domain.BiomedicalVolunteerSurvey;

public interface BiomedicalVolunteerSurveyService {
	
	public List<BiomedicalVolunteerSurvey> saveAll(List<BiomedicalVolunteerSurvey> biomedicalVolunteerSurveys);

}
