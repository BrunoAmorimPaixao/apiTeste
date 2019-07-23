package br.com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.api.Servicos;
import br.com.domain.Hotel;
import br.com.domain.Pesquisa;

@Controller
@RequestMapping("dados")
public class DadosFormController {
	
	@Autowired 
	Servicos servicos;
	  
	/**
	 * passar os dados do form para o url 
	 * @param pesquisa
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/pesquisar" ,method = RequestMethod.POST )
	public ModelAndView processForm(@ModelAttribute("pesquisa") Pesquisa pesquisa, ModelMap model) {
		
	    Hotel[] hoteis  = servicos.retornoJsonAPI(pesquisa.getHotel(), pesquisa.getDataCheckin(), pesquisa.getDataCheckout(), 
	    		 pesquisa.getQtdAdultos(), pesquisa.getQtdCriancas());
	    model.addAttribute("hoteis",hoteis);
	    return  new ModelAndView("/user/lista", model);
	    
	}
	
	@RequestMapping(value = "/todos", method = RequestMethod.GET)
	public String listarTodos(ModelMap model){
		
		return "redirect:/app/todos";
	}
}
