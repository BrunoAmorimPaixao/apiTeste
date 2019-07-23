package br.com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.Servicos;
import br.com.domain.Hotel;

@RestController
@RequestMapping("hotel")
public class HotelController {

	
	  @Autowired 
	  Servicos servicos;
	  
	@RequestMapping(value="/{hotel}/{dataCheckin}/{dataCheckout}/{qtdAdultos}/{qtdCriancas}", method=RequestMethod.GET)
	public List<Hotel> listHoteis(@PathVariable("hotel") Integer hotel
			                    , @PathVariable("dataCheckin") String dataCheckin
			                    , @PathVariable("dataCheckout") String dataCheckout
			                    , @PathVariable("qtdAdultos") Integer qtdAdultos
			                    , @PathVariable("qtdCriancas") Integer qtdCriancas) {
		
		System.out.println("--> hotel: " + hotel);
		System.out.println("--> dataCheckin: " + dataCheckin);
		System.out.println("--> dataCheckout: " + dataCheckout);
		System.out.println("--> qtdAdultos: " + qtdAdultos);
		System.out.println("--> qtdCriancas: " + qtdCriancas);
		
		
		
		
		// pegar os parâmetros acima e faz as regras dentro do retornoJson
		List<Hotel> hoteis = Arrays.asList(servicos.retornoJson(hotel, dataCheckin, dataCheckout, qtdAdultos, qtdCriancas));
		
		return hoteis;
		
		
	}	
	

}
