package com.xworkz.roseplant.dao;

import com.xworkz.roseplant.dto.RosePlantDTO;

public interface RosePlantDAO {
	void saveRosePlant(RosePlantDTO rosePlantDTO);
	void fetchRosePlant(int roseId);
	void updateRosePlant(int roseId);
	void deleteRosePlant(int roseId);

}
