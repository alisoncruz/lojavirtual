package br.com.jdev;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.jdev.model.Acesso;
import br.com.jdev.repository.AcessoRepository;
import br.com.jdev.service.AcessoService;

@SpringBootTest(classes = LojavirtualApplication.class)
class LojavirtualApplicationTests {

	@Autowired
	private AcessoService acessoService;
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	@Test
	void salvarAcesso() {
		Acesso acesso = new Acesso();
		acesso.setDescricao("ADMIN");
		acessoService.save(acesso);
	}

}
