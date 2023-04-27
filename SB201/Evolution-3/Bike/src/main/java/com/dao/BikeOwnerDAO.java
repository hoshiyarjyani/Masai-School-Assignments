package com.dao;

import java.util.List;
import java.util.Map;

import com.model.Bike;
import com.model.BikeOwner;

public interface BikeOwnerDAO {

	public void insertBikeOwner(BikeOwner bikeowner);

	public List<BikeOwner> getBikeOwners();

	public List<BikeOwner> findBikeOwnersByBikeColor(String bikeColor);

	public Map<BikeOwner, Bike> topBikesByModelName(int n);

}
