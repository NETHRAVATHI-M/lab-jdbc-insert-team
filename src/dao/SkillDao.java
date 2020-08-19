package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import model.Skill;
import utility.ConnectionManager;

public class SkillDao {
	
		public Skill getSkillByName(int skillID1) throws SQLException {
			Statement st = ConnectionManager.getConnection().createStatement();
			String sql = "select * from FROM WHERE NAME="+skillID1;
			ResultSet res = st.executeQuery(sql);
			while(res.next()) {
				int id =res.getInt("ID");
				String name1 = res.getString("NAME");
				Skill s = new Skill(id, name1);
				return s;
			}
			
			return null;
			
			
			
		}
		public void createSkill(Skill s) throws SQLException {
			
			int ID =	s.getId();
			String Name = s.getName();
			
			ConnectionManager cm =  new ConnectionManager();
			//INSERT DATA INTO DATABASE
			String sql ="insert into CITY(ID,NAME)VALUES(?,?)";
			//CREATE STATEMENT
			PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
			st.setLong(1, ID);
			st.setString(2, Name);
			
			st.executeUpdate();
			ConnectionManager.getConnection().close();
				
			
		}

}
