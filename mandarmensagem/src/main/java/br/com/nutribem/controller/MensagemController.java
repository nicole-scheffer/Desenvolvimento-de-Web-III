package br.com.nutribem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.nutribem.service.MensagemService;

@Controller
@RequestMapping("/")
public class MensagemController {
	@Autowired
	private MensagemService mensagemService;
	
	@GetMapping("/formInsert")
	public String formInsert(){
		return "/insert";
	}
}
