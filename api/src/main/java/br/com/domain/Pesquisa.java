package br.com.domain;

public class Pesquisa {

	
	private Integer hotel;
	private String dataCheckin;
	private String dataCheckout;
	private Integer qtdAdultos;
	private Integer qtdCriancas;
	
	public Integer getHotel() {
		return hotel;
	}
	public void setHotel(Integer hotel) {
		this.hotel = hotel;
	}
	
	public String getDataCheckin() {
		return dataCheckin;
	}
	public void setDataCheckin(String dataCheckin) {
		this.dataCheckin = dataCheckin;
	}
	public String getDataCheckout() {
		return dataCheckout;
	}
	public void setDataCheckout(String dataCheckout) {
		this.dataCheckout = dataCheckout;
	}
	public Integer getQtdAdultos() {
		return qtdAdultos;
	}
	public void setQtdAdultos(Integer qtdAdultos) {
		this.qtdAdultos = qtdAdultos;
	}
	public Integer getQtdCriancas() {
		return qtdCriancas;
	}
	public void setQtdCriancas(Integer qtdCriancas) {
		this.qtdCriancas = qtdCriancas;
	}
	
}
