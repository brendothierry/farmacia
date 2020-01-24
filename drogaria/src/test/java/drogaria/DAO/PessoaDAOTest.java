package drogaria.DAO;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import drogaria.dao.PessoaDAO;
import drogaria.domain.Pessoa;

public class PessoaDAOTest {

	@Test
	public void salvar() {

		Pessoa pessoa = new Pessoa();
		pessoa.setBairro("aaaa");
		pessoa.setCelular("9999999");
		pessoa.setCep("19999999");
		pessoa.setComplemento("99999999");
		pessoa.setCpf("99999999");
		pessoa.setEmail("99999999");
		pessoa.setNome("Brenda Ribeiro");
		pessoa.setNumero(new Short("999"));
		pessoa.setRg("99999999");
		pessoa.setRua("99999999");
		pessoa.setTelefone("99999999");

		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);

		System.out.println("Produto salvo com sucesso.");
	}

	@Ignore
	@Test
	public void listar() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> resultado = pessoaDAO.listar();

		for (Pessoa pessoa : resultado) {
			System.out.println("Bairro da pessoa: " + pessoa.getBairro());
			System.out.println("Celular da pessoa: " + pessoa.getCelular());
			System.out.println("Cep da pessoa: " + pessoa.getCep());
			System.out.println("Complemento da pessoa: " + pessoa.getComplemento());
			System.out.println();
		}
	}

	@Ignore
	@Test
	public void buscar() {
		Integer codigo = 2;

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);

		if (pessoa == null) {
			System.out.println("Nenhum registro encontrado.");
		} else {
			System.out.println("Registro encontrado");

			System.out.println(pessoa.getCodigo() + " - " + pessoa.getNome());
			System.out.println("Bairro da pessoa: " + pessoa.getBairro());
			System.out.println("Celular da pessoa: " + pessoa.getCelular());
			System.out.println("Cep da pessoa: " + pessoa.getCep());
			System.out.println("Complemento da pessoa: " + pessoa.getComplemento());
			System.out.println();
		}
	}

	@Ignore
	@Test
	public void excluir() {
		Integer codigo = 4;

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);

		if (pessoa != null) {
			System.out.println("Registro encontrado");
			pessoaDAO.excluir(pessoa);
			System.out.println("Registro removido");
		} else {
			System.out.println("Nenhum registro encontrado");
		}
		System.out.println("Bairro da pessoa: " + pessoa.getBairro());
		System.out.println("Celular da pessoa: " + pessoa.getCelular());
		System.out.println("Cep da pessoa: " + pessoa.getCep());
		System.out.println("Complemento da pessoa: " + pessoa.getComplemento());
		System.out.println();
	}

	@Ignore
	@Test
	public void update() {
		Integer codigo = 5;

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);

		System.out.println("Pessoa a ser editada: ");
		System.out.println("Bairro da pessoa: " + pessoa.getBairro());
		System.out.println("Celular da pessoa: " + pessoa.getCelular());
		System.out.println("Cep da pessoa: " + pessoa.getCep());
		System.out.println("Complemento da pessoa: " + pessoa.getComplemento());
		System.out.println("Nome da pessoa: " + pessoa.getNome());
		System.out.println();

		pessoa.setNome("Brendo editado");

		pessoaDAO.update(pessoa);

		System.out.println("Pessoa editada: ");
		System.out.println("Bairro da pessoa: " + pessoa.getBairro());
		System.out.println("Celular da pessoa: " + pessoa.getCelular());
		System.out.println("Cep da pessoa: " + pessoa.getCep());
		System.out.println("Complemento da pessoa: " + pessoa.getComplemento());
		System.out.println("Nome da pessoa: " + pessoa.getNome());
		System.out.println();
	}
}
