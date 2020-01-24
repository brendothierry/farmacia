package drogaria.DAO;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import drogaria.dao.FuncionarioDAO;
import drogaria.dao.PessoaDAO;
import drogaria.domain.Funcionario;
import drogaria.domain.Pessoa;

public class FuncionarioDAOTest {
	
	@Test
	public void salvar() {
		Integer codigo = 1;

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);

		Funcionario funcionario = new Funcionario();
		funcionario.setCateiraTrabalho("Kamila");
		funcionario.setDataAdmissao(new Date());
		funcionario.setPessoa(pessoa);

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.salvar(funcionario);

		System.out.println("Funcionario cadastrado com sucesso.");
	}

	@Ignore
	@Test
	public void listar() {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		List<Funcionario> resultado = funcionarioDAO.listar();

		for (Funcionario funcionario : resultado) {
			System.out.println();
			System.out.println("Carteira de trabalho: " + funcionario.getCateiraTrabalho());
			System.out.println("Data de Admissão do funcionário: " + funcionario.getDataAdmissao());
			System.out.println("Nome da funcionário: " + funcionario.getPessoa().getNome());
		}
	}

	@Ignore
	@Test
	public void buscar() {
		Integer codigo = 5;

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);

		if (funcionario == null) {
			System.out.println("Nenhum registro encontrado.");
		} else {
			System.out.println("Registro encontrado");
		}

		System.out.println();
		System.out.println("Carteira de trabalho: " + funcionario.getCateiraTrabalho());
		System.out.println("Data de Admissão do funcionário: " + funcionario.getDataAdmissao());
		System.out.println("Nome da funcionário: " + funcionario.getPessoa().getNome());
	}
	@Ignore
	@Test
	public void excluir() {
		Integer codigo = 2;
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);
		
		if(funcionario != null) {
			System.out.println("Registro encontrado");
			funcionarioDAO.excluir(funcionario);
			System.out.println("Registro removido");
		}else {
			System.out.println("Nenhum registro encontrado");
		}
		System.out.println();
		System.out.println("Carteira de trabalho: " + funcionario.getCateiraTrabalho());
		System.out.println("Data de Admissão do funcionário: " + funcionario.getDataAdmissao());
		System.out.println("Nome do funcionário: " + funcionario.getPessoa().getNome());
	
	}
	@Ignore
	@Test
	public void update() {
		Integer codigo = 3;
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);
		
		System.out.println("Pessoa a ser editada: ");
		System.out.println("Carteira de trabalho: " + funcionario.getCateiraTrabalho());
		System.out.println("Data de Admissão do funcionário: " + funcionario.getDataAdmissao());
		System.out.println("Nome do funcionário: " + funcionario.getPessoa().getNome());
		System.out.println();
		
		funcionario.setCateiraTrabalho("Brendo update");
		funcionario.setDataAdmissao(new Date());
		
		funcionarioDAO.update(funcionario);
		
		System.out.println("Pessoa editada: ");
		System.out.println("Carteira de trabalho: " + funcionario.getCateiraTrabalho());
		System.out.println("Data de Admissão do funcionário: " + funcionario.getDataAdmissao());
		System.out.println("Nome do funcionário: " + funcionario.getPessoa().getNome());
		System.out.println();
		
		
	}

}
