package com.dao;

import javax.persistence.EntityManager;

import com.model.Lawyer;
import com.util.EmUtils;

public class CourtDAOimpl implements CourtDAO{

	@Override
	public Lawyer findLawyerById(int id) {
	EntityManager em = EmUtils.getEntityManager();
	return em.find(Lawyer.class, id);
		
	}

	@Override
	public String saveLawyer(Lawyer lawyer) {
		EntityManager em = EmUtils.getEntityManager();
		em.getTransaction().begin();
		em.persist(lawyer);
		em.getTransaction().commit();
		em.close();
		return "Lawer Added Sucessfully";
	}

	@Override
	public String deleteLawyerById(int id) {
	    EntityManager em = EmUtils.getEntityManager();
	   Lawyer lawyer = em.find(Lawyer.class, id);
		if(lawyer!=null) {
			em.getTransaction().begin();
			em.remove(lawyer);
			em.getTransaction().commit();
			em.close();
			return "Lawyer Sucessfully deleted";
		}else{
			return "Lawyer not found in Database";
		}
	}

	@Override
	public String updateLawyerExperience(int id, int experience) {
	    EntityManager em = EmUtils.getEntityManager();
		   Lawyer lawyer = em.find(Lawyer.class, id);
			if(lawyer!=null) {
				em.getTransaction().begin();
				lawyer.setExperience(experience);
				em.merge(lawyer);
				em.getTransaction().commit();
				em.close();
				return "Lawyer Sucessfully Updated";
			}else{
				return "Lawyer not found in Database";
			}
	}

}
