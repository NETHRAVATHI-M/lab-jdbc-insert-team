package model;

public class Player {

	private int id;
	private String name;
	private String country;
	private int skill;
	private String team;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getSkill() {
		return skill;
	}
	public void setSkill(int skill) {
		this.skill = skill;
	}
	
	
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Player(int id, String name, String country, int sid, String nameIfPresent) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.skill = sid;
		this.team = nameIfPresent;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
