package com.dao;

import com.model.Lawyer;

public interface CourtDAO {
	Lawyer findLawyerById(int id);

	String saveLawyer(Lawyer lawyer);

	String deleteLawyerById(int id);

	String updateLawyerExperience(int id, int experience);
}
