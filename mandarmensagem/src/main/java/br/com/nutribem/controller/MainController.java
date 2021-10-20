package br.com.nutribem.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nutribem.model.Mensagens;
import br.com.nutribem.service.MensagemService;

@RestController
@RequestMapping("/")
public class MainController {
	@Autowired
	private MensagemService mensagemService;
	
	@GetMapping
	public List<Mensagens> findAll(){
		return mensagemService.findAll();
	}
	
	@GetMapping("/{email}")
	public Mensagens findOne(@PathVariable String email) {
		return mensagemService.findOne(email);
	}
	
	@PostMapping
	public Map<String, String> insert(@RequestBody Mensagens mensagem){
		return mensagemService.insert(mensagem);
	}
	
	@GetMapping("/")
	public String main() {
		return "/";
	}
}
