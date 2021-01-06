package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerSearchDAOImpl implements PlayerSearchDAO {

	@Override
	public Player getPlayerByDob(Date dob) throws BusinessException {
		// TODO Auto-generated method stub
		Player player = new Player();
		try {
			Connection connection = PostgresqlConnection.getConnection();
			String sql = "select playerid, playername, teamid, age, position, dob from \"Test\".player where dob = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDate(1, new java.sql.Date(dob.getTime()));
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				player.setPlayerid(resultSet.getInt("playerid"));
				player.setPlayername(resultSet.getString("playername"));
				player.setTeamid(resultSet.getInt("teamid"));
				player.setAge(resultSet.getInt("age"));
				player.setPosition(resultSet.getString(5));
				player.setDob(dob);
			} else {
				System.out.println("Player not found...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("An Internal Error has Ocurred");
		}
		return player;
	}

	@Override
	public List<Player> getPlayersByPosition(String position) throws BusinessException {
		// TODO Auto-generated method stub
		List<Player> playersByPosition = new ArrayList<>();
		try {
			Connection connection = PostgresqlConnection.getConnection();
			String sql = "select playerid, playername, teamid, age, position, dob from \"Test\".player where position = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, position);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Player player = new Player();
				player.setPlayerid(resultSet.getInt("playerid"));
				player.setPlayername(resultSet.getString("playername"));
				player.setTeamid(resultSet.getInt("teamid"));
				player.setAge(resultSet.getInt("age"));
				player.setPosition("position");
				player.setDob(resultSet.getDate("dob"));
				
				playersByPosition.add(player);
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal Error Ocurred");
		}
		
		return playersByPosition;
	}

}