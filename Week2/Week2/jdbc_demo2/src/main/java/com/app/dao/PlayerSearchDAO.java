package com.app.dao;

import java.util.Date;
import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchDAO {
	
	public Player getPlayerByDob(Date dob) throws BusinessException;
	
	public List<Player> getPlayersByPosition(String position) throws BusinessException;

}
