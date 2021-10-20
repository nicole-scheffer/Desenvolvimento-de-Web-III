package br.com.nutribem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.nutribem.model.Mensagens;

@Repository
public interface MensagensRepository extends CrudRepository<Mensagens,Integer> {

}
