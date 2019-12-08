package br.com.exemplo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	public String get() {
		return "Get Spring Boot";
	}
	
	@GetMapping("/login/{login}/senha/{senha}")
	public String login(@PathVariable("login") String login, @PathVariable("senha") String senha) {
		return "Login " + login +", senha:" + senha;
	}
	
	@GetMapping("/carros/{id}")
	public String getCarroById(@PathVariable("id") Long id) {
		return "Carro by id " + id;
	}
	
	@GetMapping("/carros/tipo/{tipo}")
	public String getCarroByTipo(@PathVariable("tipo") String tipo) {
		return "Carro by id " + tipo;
	}


}
