package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.City;
import model.Player;
import utility.ConnectionManager;

public class PlayerDAO {

	public void createPlayer(Player p1) throws SQLException {
		// TODO Auto-generated method 
		
		int ID =	p1.getId();
		String Name = p1.getName();
		String country = p1.getCountry();
		int skill = p1.getSkill();
		String name = p1.getTeam();
		
		ConnectionManager cm =  new ConnectionManager();
		//INSERT DATA INTO DATABASE
		String sql ="insert into PLAYER(ID,NAME,COUNTRY,SKILL_ID,TEAM_NAME)VALUES(?,?,?,?,?)";
		//CREATE STATEMENT
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		st.setInt(1, ID);
		st.setString(2, Name);
		st.setString(3, country);
		st.setInt(4, skill);
		st.setString(5, name);
		
		
		st.executeUpdate();
		
		String sql1 = "select * from PLAYER";
		ResultSet res = st.executeQuery(sql1);
		while(res.next()) {
			int id =res.getInt("ID");
			String name1 = res.getString("NAME");
			String country1 = res.getString("COUNTRY");
			int cityid = res.getInt("CITY_ID");
			String teamName = res.getString("TEAM_ID");
			System.out.println(id+" "+name1+" "+country1+" "+cityid+"" +teamName);
		ConnectionManager.getConnection().close();
			
		
	}
		
		
	}}
	


