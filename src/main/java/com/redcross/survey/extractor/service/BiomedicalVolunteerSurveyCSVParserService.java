package com.redcross.survey.extractor.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.redcross.survey.extractor.domain.BiomedicalVolunteerSurvey;

public interface BiomedicalVolunteerSurveyCSVParserService {
	
	public List<BiomedicalVolunteerSurvey> parseBiomedicalVolunteerSurvey(MultipartFile file) throws IOException;

}
