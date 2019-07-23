package br.com.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
//@Order(1)
public class ServicosCompoment  implements CommandLineRunner{
	
	//@Autowired
	//Servicos servicos ;
	
	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("--> ServicosCompoment > run");
		//servicos.executar();
		
	}
	
	

}
