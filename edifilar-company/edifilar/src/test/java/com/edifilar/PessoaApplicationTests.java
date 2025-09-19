package com.edifilar;

import com.edifilar.model.Pessoa;
import com.edifilar.model.Enderecos;
import com.edifilar.model.TipoSanguineo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PessoaApplicationTests {

	@Test
	void testPessoaCreation() {

		Pessoa pessoa = new Pessoa();
		pessoa.setId(1L);
		pessoa.setNome("João Silva");

		assertNotNull(pessoa);
		assertEquals(1L, pessoa.getId());
		assertEquals("João Silva", pessoa.getNome());

		// Testando retorno dos dados gravados
		// System.out.println("Nome......: " + pessoa);
	}

	@Test
	void TesteEnderecos() {

		Enderecos endereco = new Enderecos();
		endereco.setLogradouro("Avenida Paulista");
		endereco.setNumero("1000");
		endereco.setComplemento("15º andar");
		endereco.setBairro("Bela Vista");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setCep("01310-100");
		endereco.setTipo("COMERCIAL");

		assertEquals("Avenida Paulista", endereco.getLogradouro());
		assertEquals("1000", endereco.getNumero());
		assertEquals("São Paulo", endereco.getCidade());
		assertEquals("COMERCIAL", endereco.getTipo());

		// Testando retorno dos dados gravados
		// System.out.println("Endereco 2 ......: " + endereco);
	}

	@Test
	void TesteTipoSanguineo() {
        // Declara uma variável do tipo TipoSanguineo
		TipoSanguineo meuTipoSanguineo;

        // Atribui a constante A_POSITIVO à variável
		meuTipoSanguineo = TipoSanguineo.A_POSITIVO;
		
		// Testando retorno dos dados gravados
		// System.out.println("Tipo Sanguineo......: " + meuTipoSanguineo);
	}

}
