package com.redcross.survey.extractor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redcross.survey.extractor.domain.BiomedicalVolunteerSurvey;

public interface BiomedicalVolunteerSurveyRepository extends JpaRepository<BiomedicalVolunteerSurvey, Long> {

}
