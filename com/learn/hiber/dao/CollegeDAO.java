package com.learn.hiber.dao;

import com.learn.hiber.dto.CollegeDTO;

public interface CollegeDAO {
	void saveCollegeDTO(CollegeDTO collegeDTO);
	void fetchCollege(int collegeId);
	void updateCollege(int collegeId);
	void deleteCollege(int collegeId);

}
