package com.edifilar;

import com.edifilar.model.Pessoa;
import com.edifilar.model.Enderecos;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PessoaApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void contextLoads() {
		assertNotNull(applicationContext, "O contexto do Spring deve carregar corretamente");
	}

	@Test
	void testPessoaCreation() {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1l);
		pessoa.setNome("João Silva");

		assertNotNull(pessoa, "Pessoa não deve ser nula");
		assertEquals(1, pessoa.getId(), "ID deve ser 1");
		assertEquals("João Silva", pessoa.getNome(), "Nome deve ser João Silva");
	}

	@Test
	void testEnderecosCreationWithConstructor() {
		Enderecos endereco = new Enderecos(
				"Rua das Flores",
				"123",
				"Apto 101",
				"Centro",
				"São Paulo",
				"SP",
				"01234-567",
				"RESIDENCIAL"
		);

		assertNotNull(endereco, "Endereço não deve ser nulo");
		assertEquals("Rua das Flores", endereco.getLogradouro(), "Logradouro incorreto");
		assertEquals("123", endereco.getNumero(), "Número incorreto");
		assertEquals("RESIDENCIAL", endereco.getTipo(), "Tipo incorreto");
	}

	@Test
	void testEnderecosCreationWithSetters() {
		Enderecos endereco = new Enderecos();
		endereco.setLogradouro("Avenida Paulista");
		endereco.setNumero("1000");
		endereco.setComplemento("15º andar");
		endereco.setBairro("Bela Vista");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setCep("01310-100");
		endereco.setTipo("COMERCIAL");

		assertEquals("Avenida Paulista", endereco.getLogradouro(), "Logradouro incorreto");
		assertEquals("1000", endereco.getNumero(), "Número incorreto");
		assertEquals("São Paulo", endereco.getCidade(), "Cidade incorreta");
		assertEquals("COMERCIAL", endereco.getTipo(), "Tipo incorreto");
	}

}