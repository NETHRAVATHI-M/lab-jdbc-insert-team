package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

import model.City;
import model.Skill;
import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
	
	public void createTeam(Team team) throws SQLException , ClassNotFoundException,SQLSyntaxErrorException{
		Statement stmt = ConnectionManager.getConnection().createStatement();

		Integer id = team.getId();
		String  name  = team.getName();
		String couch = team.getCoach();
		
		long city=team.getCity().getCityId();
			ConnectionManager cm =  new ConnectionManager();
			//INSERT DATA INTO DATABASE
			
			
			//String sql1 ="insert into City VALUES("+team.getCity().getCityId()+"'"+"'"+team.getCity().getCityName()+"'"+")";
			String sql1 = "INSERT INTO CITY VALUES(" + team.getCity().getCityId() + "," + "'" + team.getCity().getCityName() + "'" + ")";
			stmt.executeUpdate(sql1);
			String sql ="insert into TEAM1(ID, NAME,COACH,HOME_CITY)VALUES(?,?,?,?)"; // 
			//CREATE STATEMENT
			PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
			st.setInt(1, id);
			st.setString(2, name);
			st.setString(3, couch);
			st.setLong(4, city);
		
			st.executeUpdate();
			ConnectionManager.getConnection().close();
				
			
		}
	
	public  void getTeamById(String name1) throws SQLException {//it shold be id but to convert into into increament
		Statement st = ConnectionManager.getConnection().createStatement();
		String sql = "select * from TEAM WHERE NAME="+name1;
		ResultSet res = st.executeQuery(sql);
	
		while(res.next()) {
			Integer id = res.getInt("ID");
			String name = res.getString("NAME");
			String couch = res.getString("COUCH");
			int captain =res.getInt("CAPTAIN");
			int cityID = res.getInt("CITYID");
			 System.out.println(id+""+name+" "+couch+" "+captain+" "+cityID);
			
		}
		
		
		
		
		
	}
	
	
	}

