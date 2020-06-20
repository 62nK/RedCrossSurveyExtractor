package com.redcross.survey.extractor.web.rest;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.redcross.survey.extractor.domain.BiomedicalVolunteerSurvey;
import com.redcross.survey.extractor.service.BiomedicalVolunteerSurveyCSVParserService;
import com.redcross.survey.extractor.service.BiomedicalVolunteerSurveyService;

@RestController
@RequestMapping(path = "biomedical-volunteer-survey")
public class BiomedicalVolunteerSurveyResource {
	
	@Autowired
	private BiomedicalVolunteerSurveyService biomedicalVolunteerSurveyService;
	
	@Autowired
	private BiomedicalVolunteerSurveyCSVParserService biomedicalVolunteerSurveyCSVParserService;
	
	@GetMapping(path = "/parse-csv")
	public ResponseEntity<List<BiomedicalVolunteerSurvey>> parseBiomedicalVolunteerSurvey(
			@RequestParam("csv") MultipartFile file) throws IOException{
		return ResponseEntity.ok().body(biomedicalVolunteerSurveyCSVParserService.parseBiomedicalVolunteerSurvey(file));
	}
	
	@PostMapping(path = "/save")
	public ResponseEntity<List<BiomedicalVolunteerSurvey>> saveAll(@RequestBody List<BiomedicalVolunteerSurvey> biomedicalVolunteerSurveys) {
		return ResponseEntity.ok().body(biomedicalVolunteerSurveyService.saveAll(biomedicalVolunteerSurveys));
	}
	
	
	@PostMapping(path = "/import")
	public ResponseEntity<List<BiomedicalVolunteerSurvey>> importS(
			@RequestParam("csv") MultipartFile file) throws IOException{
		return ResponseEntity.ok().body(
				biomedicalVolunteerSurveyService.saveAll(biomedicalVolunteerSurveyCSVParserService.parseBiomedicalVolunteerSurvey(file)));
	}
}
