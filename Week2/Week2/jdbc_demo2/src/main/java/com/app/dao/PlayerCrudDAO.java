package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerCrudDAO {
	
	public int createPlayer(Player player) throws BusinessException;
	public void deletePlayer(int playerid) throws BusinessException;
	public int updatePlayerPosition(int playerid, String position) throws BusinessException;
	public Player getPlayerbyId(int playerid) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;

}