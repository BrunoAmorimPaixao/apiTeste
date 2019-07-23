package br.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.api.Servicos;
import br.com.domain.Hotel;

@Controller
@RequestMapping("app")
public class AppController {
	
	@Autowired
	Servicos servicos ;
	
	Hotel[] hotel;
	
	public AppController() {
			
	}

	@RequestMapping(value = "/todos", method = RequestMethod.GET) 
	public ModelAndView listarTodos(ModelMap model) { 
	Hotel[] hotel = servicos.getHotel(); model.addAttribute("hotel", hotel); 
	return new ModelAndView("user/pesquisa"); }
	
		 
	//@RequestMapping(value = "/lista", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public ResponseEntity<Hotel[]> lista(){
		System.out.println("--> AppController > lista"); 
		hotel = servicos.getHotel();
		return new ResponseEntity<Hotel[]>(hotel, HttpStatus.OK);
	}
	
	
}
