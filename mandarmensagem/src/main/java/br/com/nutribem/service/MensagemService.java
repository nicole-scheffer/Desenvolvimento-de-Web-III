package br.com.nutribem.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.nutribem.model.Mensagens;

@Service
public class MensagemService {
	private ArrayList<Mensagens> listOfMensagens = new ArrayList<Mensagens>();
	
	public List<Mensagens> findAll(){
		return this.listOfMensagens;
	}
	public Mensagens findOne(String email) {
		for(Mensagens mensagem : this.listOfMensagens) {
			if(mensagem.getEmail().equals(email)) {
				return mensagem;
			}
		}
		return null;
	}
	public Map<String, String> insert(Mensagens mensagem){
		boolean isSucess = this.listOfMensagens.add(mensagem);
		Map<String, String> result = new HashMap<String,String>();
		if(isSucess) {
			result.put("result","Mensagem cadastrada com sucesso!!");
		}else {
			result.put("result","Mensagem não foi cadastrada");
		}
		return result;
	}
}
