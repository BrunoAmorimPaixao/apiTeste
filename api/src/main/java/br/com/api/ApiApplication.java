package br.com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com" )
public class ApiApplication  {
	
	//@Autowired
	//Servicos servicos;

	public static void main(String[] args) {
		
		SpringApplication.run(ApiApplication.class, args);
	}
	
	/*
	 * @Bean CommandLineRunner runner(){ return args -> { servicos.executar();;
	 * 
	 * }; }
	 */
	
	
}
