package com.redcross.survey.extractor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redcross.survey.extractor.domain.BiomedicalVolunteerSurvey;
import com.redcross.survey.extractor.repository.BiomedicalVolunteerSurveyRepository;
import com.redcross.survey.extractor.service.BiomedicalVolunteerSurveyService;

@Service
public class BiomedicalVolunteerSurveyServiceImpl implements BiomedicalVolunteerSurveyService{
	
	@Autowired
	private BiomedicalVolunteerSurveyRepository biomedicalVolunteerSurveyRepository;
	
	public List<BiomedicalVolunteerSurvey> saveAll(List<BiomedicalVolunteerSurvey> biomedicalVolunteerSurveys) {
		return biomedicalVolunteerSurveyRepository.saveAll(biomedicalVolunteerSurveys);
	}

}
