package br.com.api;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.client.HotelClient;
import br.com.domain.Hotel;
import br.com.domain.Rooms;

@Service
public class Servicos {
	
	@Autowired
	HotelClient hotelClient;
	
	Hotel[] hotel;
	
	public Hotel[] getHotel() {
		return hotel;
	}

	public void executar(){
		System.out.println("--> executar... ");
	
	}
	
	/**
	 * Metodo para retornar os dados passados pelo idCidade 
	 * os dados do ws 
	 * @param id
	 */
	public Hotel[] retornoJson(Integer id, String dataCheckin, String dataCheckout, Integer qtAdulto, Integer qtCrianca){
		hotel = hotelClient.buscaHotelPorId(id);
		 
		Integer dias= calcularDias(dataCheckin, dataCheckout); 
		
		for(Hotel h : hotel){
			//System.out.println("--> " +h.getId());
			 for(Rooms r: h.getRooms()){
				 	
				 	Double total = calcularTotalViagem(r,dias, qtAdulto, qtCrianca);
				 	String valorTotal = formatarTotal(total);
				 	r.setTotalViagem(valorTotal);
			}
		}
		
		return hotel;
	}
	
	/**
	 * teste2
	 * @param id
	 * @param dataCheckin
	 * @param dataCheckout
	 * @param qtAdulto
	 * @param qtCrianca
	 * @return
	 */
	public Hotel[] retornoJsonAPI(Integer id, String dataCheckin, String dataCheckout, Integer qtAdulto, Integer qtCrianca){
		hotel = hotelClient.buscaHotelPorCidade(id, dataCheckin, dataCheckout, qtAdulto, qtCrianca);
		 
		//Integer dias= calcularDias(dataCheckin, dataCheckout); 
		
		/*for(Hotel h : hotel){
			//System.out.println("--> " +h.getId());
			 for(Rooms r: h.getRooms()){
				 	
				 	Double total = calcularTotalViagem(r,dias, qtAdulto, qtCrianca);
				 	String valorTotal = formatarTotal(total);
				 	r.setTotalViagem(valorTotal);
			}
		}*/
		
		return hotel;
	}	
	
	
	/** formatar o valorTotal 
	 * 
	 * @param t
	 * @return
	 */
	
	 public String formatarTotal(Double t){
		 DecimalFormat df = new DecimalFormat("0.##");
		String x = df.format(t);
		return x;
	 }	
	 
	/**
	 * ira calcaular o valor total da viagem 
	 * @param r
	 * @return
	 */
	public Double calcularTotalViagem(Rooms r, Integer dias, Integer qtAdulto, Integer qtCrianca) {
		
		Double total, tPai, tCrianca = null;
		
		tPai = ((r.getPrice().getAdult()*qtAdulto)*dias)/0.7;
		tCrianca = ((r.getPrice().getChild()*qtCrianca)*dias)/0.7;
		total = tPai + tCrianca;
		return total;
	}
	
	/**
	 * calcular diferenca da datas
	 * @param dataIda
	 * @param dataVolta
	 * @return
	 */
	public Integer calcularDias(String dataIda,String dataVolta){

		String[] aux = dataIda.split("-");
		int diaIda =Integer.parseInt(aux[0]); // igual ao dia
		int mesIda =Integer.parseInt(aux[1]) - 1 ;// mes
		int anoIda =Integer.parseInt(aux[2]); //ano
		
		String[] aux2 = dataVolta.split("-");
		int diaVolta =Integer.parseInt(aux2[0]); // igual ao dia
		int mesVolta =Integer.parseInt(aux2[1]) - 1 ;// mes
		int anoVolta =Integer.parseInt(aux2[2]); //ano
		
		//define datas
		LocalDateTime dtIda = LocalDateTime.of(anoIda, mesIda, diaIda, 0, 0, 0);
		LocalDateTime dtVolta = LocalDateTime.of(anoVolta, mesVolta, diaVolta, 0, 0, 0);

		//calcula diferença
		Long valor = dtIda.until(dtVolta, ChronoUnit.DAYS);
		//dte.set(ano, mes, dia);// data locação  - menor  

		Integer d= Integer.valueOf(valor.toString());
		
		return d;
	}
	
	
}
