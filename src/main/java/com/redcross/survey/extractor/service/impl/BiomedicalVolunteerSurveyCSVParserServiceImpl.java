package com.redcross.survey.extractor.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.redcross.survey.extractor.domain.BiomedicalVolunteerSurvey;
import com.redcross.survey.extractor.service.BiomedicalVolunteerSurveyCSVParserService;


@Service
public class BiomedicalVolunteerSurveyCSVParserServiceImpl implements BiomedicalVolunteerSurveyCSVParserService {
	
	public List<BiomedicalVolunteerSurvey> parseBiomedicalVolunteerSurvey(MultipartFile file) throws IOException{
		Stream<String> lines = new BufferedReader(new InputStreamReader(file.getInputStream(), Charset.defaultCharset())).lines();
		return lines
				.map(BiomedicalVolunteerSurveyFormatUtil::csvLineToBiomedicalVolunteerSurvey)
				.collect(Collectors.toList());
	}

}
