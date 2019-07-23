package br.com.client;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.domain.Hotel;

@RestController
public class HotelClient {
	
	Hotel[] hotel;
	
	public Hotel[] buscaHotelPorId(Integer id){
        RestTemplate template = new RestTemplate();
         hotel = template.getForObject("https://cvcbackendhotel.herokuapp.com/hotels/avail/".concat(id.toString()), Hotel[].class);
         return hotel ;
	}
	
	public Hotel[]  buscaHotelPorCidade(Integer idCidade, String dataCheckin, String dataCheckout, Integer qtdAdultos, Integer qtdCriancas){
        RestTemplate template = new RestTemplate();
         hotel = template.getForObject("http://localhost:8080/hotel/" + idCidade + "/" + dataCheckin + "/" + dataCheckout + "/"+ qtdAdultos + "/" + qtdCriancas, Hotel[].class);
         return hotel ;
	}

	public Hotel[] getHotel() {
		return hotel;
	}
}
