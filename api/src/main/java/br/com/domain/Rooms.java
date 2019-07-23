package br.com.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rooms  {
	

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private Integer roomID;
	private String categoryName;
	private String totalViagem;
	private Price price;
	
	public Integer getRoomID() {
		return roomID;
	}
	public void setRoomID(Integer roomID) {
		this.roomID = roomID;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getTotalViagem() {
		return totalViagem;
	}
	public void setTotalViagem(String totalViagem) {
		this.totalViagem = totalViagem;
	}
	
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Rooms [roomID=" + roomID + ", categoryName=" + categoryName + ", totalViagem=" + totalViagem
				+ ", price=" + price + "]";
	}
	

}