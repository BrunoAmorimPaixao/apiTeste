package br.com.domain;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotel  {
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private Integer id;
	//private String name;
	//private Integer cityCode;
	private String cityName;
	private Rooms[] rooms;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCityCode() {
		return cityCode;
	}
	public void setCityCode(Integer cityCode) {
		this.cityCode = cityCode;
	}*/
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Rooms[] getRooms() {
		return rooms;
	}

	public void setRooms(Rooms[] rooms) {
		this.rooms = rooms;
	}

/*
	public double getValorTotal() {
		if(this.rooms == null || this.rooms.length == 0)
			return 0;
		
		double vlr = 0;
		
		for(Rooms r : this.rooms)
			vlr += r.getPrice().getAdult() +r.getPrice().getChild(); 
			
		return vlr;
	}	
	
	public int getTotalRooms() {
		if(this.rooms == null || this.rooms.length == 0)
			return 0;
		
		return this.rooms.length;
	}*/
	
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", cityName=" + cityName + ", rooms="
				+ Arrays.toString(rooms) + "]";
	}

	


	
}