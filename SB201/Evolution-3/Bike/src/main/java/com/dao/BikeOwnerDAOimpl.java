package com.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.model.Bike;
import com.model.BikeOwner;
import com.util.EmUtils;

public class BikeOwnerDAOimpl implements BikeOwnerDAO {

	// Insert 4 BikeOwners each having one bike. **[Points: 0.25 ]**
	@Override
	public void insertBikeOwner(BikeOwner bikeowner) {
		EntityManager em = EmUtils.getEntityManager();
		em.getTransaction().begin();
		em.persist(bikeowner);
		em.getTransaction().commit();
		System.out.println("Inserted sucessfully");
		em.close();
	}

//	3. Get all the BikeOwners with their Bike. **[Points: 0.25 ]**
	@Override
	public List<BikeOwner> getBikeOwners() {
		EntityManager em = EmUtils.getEntityManager();
		TypedQuery<BikeOwner> query = em.createQuery("SELECT b FROM BikeOwner b", BikeOwner.class);
		return query.getResultList();
	}

//	4. find the BikeOwner(s) with a specific bike color. **[Points: 0.50 ]**
	@Override
	public List<BikeOwner> findBikeOwnersByBikeColor(String bikeColor) {
	    EntityManager em = EmUtils.getEntityManager();
	    TypedQuery<BikeOwner> query = em.createQuery("SELECT b FROM BikeOwner b WHERE b.bike.bikeColor = :bikeColor",
	            BikeOwner.class);
	    query.setParameter("bikeColor", bikeColor);

	    return query.getResultList();
	}


	@Override
	public Map<BikeOwner, Bike> topBikesByModelName(int n) {
		// Find the top 'n' bikes based on the model name, and return the respective
		// BikeOwner and Bike information as a Map
		EntityManager em = EmUtils.getEntityManager();
		TypedQuery<Object[]> query = em
				.createQuery("SELECT b ,o from Bike b JOIN b.bikeOwner o ORDER BY b.modelName ASC", Object[].class);
		query.setMaxResults(n);
		List<Object[]> res = query.getResultList();

		Map<BikeOwner, Bike> map = new LinkedHashMap<>();
		for (Object[] arr : res) {
			Bike bike = (Bike) arr[0];
			BikeOwner own = (BikeOwner) arr[1];
			map.put(own, bike);
		}
		return map;
	}

}
