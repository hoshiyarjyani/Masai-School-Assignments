package com.ui;

import com.dao.CourtDAO;
import com.dao.CourtDAOimpl;
import com.model.Lawyer;

public class UiMain {

	public static void main(String[] args) {
		CourtDAO cd = new CourtDAOimpl();
		// 1. Lawyer Added
		Lawyer lw = new Lawyer("Hoshiyar", "abc@gmail.com", "Jaipur", 5);
		
		String str = cd.saveLawyer(lw);
		System.out.println(str);

       //  2. Lawyer Findout
		
		Lawyer lwer = cd.findLawyerById(3);
		System.out.println(lwer);

		// 3. Lawyer Update

		String lwr = cd.updateLawyerExperience(3, 35);
		System.out.println(lwr);

		// 4. Delete Lawyer
		
		String del = cd.deleteLawyerById(2);
		System.out.println(del);

	}

}
