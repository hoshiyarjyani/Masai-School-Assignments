package com.dao;

import java.util.List;

import com.model.Player;

public interface PlayerDAO {
	
	public String AddPlayer(Player player);

	public Player FindPlayer(int id);

	public String UpdatePlayer(int id, String SportName);

	public String DeletePlayer(int id);

	public List<String> GetNamesFromDataBase();

	public int GetMinimumAge();

	public List<Player> getPlayersBetweenAges();

	public List<String> getPlayerNamesStartingWithLetter(char letter);

}
