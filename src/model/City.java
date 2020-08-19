package model;

public class City{
	private long cityId;
	private String cityName;
	public City(){
		
	}
	public long getCityId() {
		return cityId;
	}
	public void setCityId(long cityId2) {
		this.cityId = cityId2;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public City(long cityId2, String cityName) {
		super();
		this.cityId = cityId2;
		this.cityName = cityName;
	}
	
}
