package br.com.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Price  {
	
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private Double adult;
	private Double child;
	
	Price(){
		
	}
	
	

	public Double getAdult() {
		return adult;
	}
	public void setAdult(Double adult) {
		this.adult = adult;
	}
	public Double getChild() {
		return child;
	}
	public void setChild(Double child) {
		this.child = child;
	}
	
	@Override
	public String toString() {
		return "Preco [adult=" + adult + ", child=" + child + "]";
	}
	
	
}
