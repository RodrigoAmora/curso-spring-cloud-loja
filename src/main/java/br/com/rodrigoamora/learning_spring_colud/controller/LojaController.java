package br.com.rodrigoamora.learning_spring_colud.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodrigoamora.learning_spring_colud.dto.CompraDTO;

@RestController
@RequestMapping("/compra")
public class LojaController {

	@RequestMapping(method = RequestMethod.POST)
	public void realizarCompra(@RequestBody CompraDTO compra) {
		
	}
	
}
