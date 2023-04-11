package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.model.Player;
import com.util.EmUtils;

public class PlayerDAOimpl implements PlayerDAO {

	// 1. Add player to database
	public String AddPlayer(Player player) {
		EntityManager em = EmUtils.getEntityManager();
		em.getTransaction().begin();
		em.persist(player);
		em.getTransaction().commit();
		em.close();
		return "Sucessfully added Player " + player.getName();
	}

	// 2. Find Player by Player Id
	public Player FindPlayer(int id) {
		EntityManager em = EmUtils.getEntityManager();
		return em.find(Player.class, id);
	}

	// 3. Update player SportName by Player Id
	public String UpdatePlayer(int id, String SportName) {
		EntityManager em = EmUtils.getEntityManager();
		Player player = em.find(Player.class, id);
		if (player != null) {
			em.getTransaction().begin();
			player.setSportName(SportName);
			em.merge(player);
			em.getTransaction().commit();
			em.close();
			return "Player Updated sucessfully";
		} else {
			return "Player not found for Update";
		}
	}

	// 4. Delete the Player from database by his Id
	public String DeletePlayer(int id) {
		EntityManager em = EmUtils.getEntityManager();
		Player player = em.find(Player.class, id);
		if (player != null) {
			em.getTransaction().begin();
			em.remove(player);
			em.getTransaction().commit();
			em.close();
			return "Player Deleted sucessfully";
		} else {
			return "Player not found for Delete";
		}
	}

	// Now we are write the JPQL Query for doing some operations (Named Query, Named
	// Native Query)

	// 5. Retrieve the all names of players from database the name should be in
	// Upper case

	public List<String> GetNamesFromDataBase() {
//      1. First Way is TypedQuery, TypedQuery is the child interface of Query interface
//		(But in this you should confident about the return type)

       EntityManager em = EmUtils.getEntityManager();
       String JPQuery = "SELECT UPPER(p.Name) FROM Player p"; 		
       TypedQuery<String> query = em.createQuery(JPQuery, String.class);
       List<String> names = query.getResultList();
       return names;

//      2. Second Way (It return the Object List)

//		EntityManager em = EmUtils.getEntityManager();
//      String JPQuery = "SELECT UPPER(p.name) FROM Player p";
//		Query q = em.createQuery(JPQuery);
//		List<Object> list = q.getResultList();
//		List<String> names = new ArrayList<>();
//		for (Object x : list) {
//			names.add((String) x);
//		}
//		return names;

//     3. Third Way is we can use NamedQuery (if we require to write same query again and again in multiple Data 
//		access layer classes, it is recommended to use NamedQuery, in which we centralize the query with a unique
//		name inside the Entity class. and refer that name in all the Data access layer classes)

//		EntityManager em = EmUtils.getEntityManager();
//		Query q = em.createNamedQuery("Player.getNames");
//		List<Object> list = q.getResultList();
//		List<String> names = new ArrayList<>();
//		for (Object x : list) {
//			names.add((String) x);
//		}
//		return names;
		
//     4. Forth way is we can also use Native Query
//		EntityManager em = EmUtils.getEntityManager();
//		String nativeQuery = "Select name from Player";
//		Query q = em.createNativeQuery(nativeQuery,String.class);
//		List<String> list = q.getResultList();
//		return list;
//		
		
	}
	
	public int GetMinimumAge() {
	    EntityManager em = EmUtils.getEntityManager();
	    String JPQuery = "SELECT MIN(p.Age) FROM Player p";
	    TypedQuery<Integer> query = em.createQuery(JPQuery, Integer.class);
	    Integer minAge = query.getSingleResult();
	    return minAge;
	}

	public List<Player> getPlayersBetweenAges() {
	    EntityManager em = EmUtils.getEntityManager();
	    String JPQuery = "SELECT p FROM Player p WHERE p.Age BETWEEN 18 AND 25";
	    TypedQuery<Player> query = em.createQuery(JPQuery, Player.class);
	    List<Player> players = query.getResultList();
	    return players;
	}

	public List<String> getPlayerNamesStartingWithLetter(char letter) {
	    EntityManager em = EmUtils.getEntityManager();
	    String JPQuery = "SELECT p.Name FROM Player p WHERE p.Name LIKE :letterPattern";
	    TypedQuery<String> query = em.createQuery(JPQuery, String.class);
	    query.setParameter("letterPattern", letter + "%");
	    List<String> playerNames = query.getResultList();

	    if (playerNames.isEmpty()) {
	    	playerNames.add("No Player Found");
	    	return playerNames;
	    }
	    return playerNames;
	}

	
}
