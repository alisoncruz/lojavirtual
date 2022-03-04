package br.com.jdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.jdev.service.AcessoService;

@Controller
public class AcessoController {

	@Autowired
	private AcessoService acessoService;

}
