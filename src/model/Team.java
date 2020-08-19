package model;

public class Team{
	private Integer id;
	private String  name;
	private String coach;
	private int captain;
	private City cityId;
	public Team(){
		
	}
	public Team( Integer id, String name, String coach, City city) {
		super();
		this.id = id;
		this.name = name;
		this.coach = coach;
		this.cityId = city;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public int getCaptain() {
		return captain;
	}
	public City getCity() {
		return cityId;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	
	public void setCaptain(int captain) {
		this.captain = captain;
	}
	
	public void setCity(City cd1) {
		this.cityId = cd1;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
