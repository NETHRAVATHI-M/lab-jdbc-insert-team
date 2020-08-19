package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.CityDAO;
import dao.PlayerDAO;
import dao.SkillDao;
import dao.TeamDAO;
import model.City;
import model.Player;
import model.Skill;
import model.Team;

public class Main {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Team t = new Team();
		City city = new City();
		CityDAO cd = new CityDAO();
		TeamDAO td = new TeamDAO();
		Skill skill = new Skill();
		SkillDao skilldoa = new SkillDao();
		Player p = new Player();
		PlayerDAO  pdao = new PlayerDAO();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter City id");
		long cityId = s.nextInt();
		System.out.println("Enter City Name");
		String cityName = s.next();
		city.setCityId(cityId);
		city.setCityName(cityName);
		// what is this 
		
	    System.out.println("Enter team Id");
		int teamId = s.nextInt();
		System.out.println("Enter team NAME");
		String name = s.next();
		System.out.println("Enter team coach");
		String coach = s.next();
		
		Team team = new Team(teamId,name, coach, city);
		td.createTeam(team);
		
		
//		System.out.println("Enter skill id");
//		int skillID = s.nextInt();
//		System.out.println("ENter skill name");
//		String skillName = s.next();
//		skill.setId(skillID);
//		skill.setName(skillName);
//		Skill sk = new Skill(skillID, skillName);
//		skilldoa.createSkill(sk);
		
		
		
//		System.out.println("Enter id of person");
//		int pid = s.nextInt();
//		System.out.println("Enter the name of a person");
//		String pname = s.next();
//		System.out.println("enter counter");
//		String country = s.next();
//		System.out.println("Enter the skill id you want");
//		int skillID1 = s.nextInt();
//		Skill sobj = skilldoa.getSkillByName(skillID1);
//		int sid = sobj.getId();
//		System.out.println("Enter team name you want to select");
//		String name1  = s.next();
//		Team obj = TeamDAO.getTeamById(name1);
//		String nameIfPresent = obj.getName();
//		Player p1 = new Player(pid, pname, country, sid,nameIfPresent);
//		
//		pdao.createPlayer(p1);
//		
		
		
		
	}

}
