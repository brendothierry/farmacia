package drogaria.DAO;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import drogaria.dao.ClienteDAO;
import drogaria.dao.PessoaDAO;
import drogaria.domain.Cliente;
import drogaria.domain.Pessoa;

public class ClienteDAOTest {
	@Ignore
	@Test
	public void salvar() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(4);
		
		
		Cliente cliente = new Cliente();
		cliente.setDataCadastro(new Date());
		cliente.setLiberado(true);
		cliente.setPessoa(pessoa);
		
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);
		
		System.out.println("Cliente salvo com sucesso.");
		
	}
	
	@Ignore
	@Test
	public void listar() {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> resultado = clienteDAO.listar();
		
		for(Cliente cliente : resultado) {
			System.out.println();
			System.out.println("Data de cadastro: " + cliente.getDataCadastro());
			System.out.println("Status de liberação: " + cliente.getLiberado());
			System.out.println("Nome do cliente: " + cliente.getPessoa().getNome());
		}
			}
	@Ignore	
	@Test
	public void buscar() {
		Integer codigo = 2;
		
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);
		
		if(cliente == null) {
			System.out.println("Nenhum registro encontrado");
		}else {
			System.out.println("Registro encontrado: ");
		}
		System.out.println();
		System.out.println("Data de cadastro: " + cliente.getDataCadastro());
		System.out.println("Status de liberação: " + cliente.getLiberado());
		System.out.println("Nome do cliente: " + cliente.getPessoa().getNome());
			}
	@Ignore
	@Test
	public void excluir() {
		Integer codigo = 4;
		
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);
		if(cliente != null) {
			System.out.println("Registro encontrado");
			clienteDAO.excluir(cliente);
			System.out.println("Registro removido");
		}else {
			System.out.println("Nenhum registro encontrado.");
		}
		System.out.println();
		System.out.println("Data de cadastro: " + cliente.getDataCadastro());
		System.out.println("Nome do cliente: " + cliente.getPessoa().getNome());
	}
	@Ignore	
	@Test
	public void update() {
		Integer codigo = 2;
		
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);
				
		System.out.println("Pessoa a ser editada: ");
		System.out.println("Data de cadastro: " + cliente.getDataCadastro());
		System.out.println("Status de liberação: " + cliente.getLiberado());
		System.out.println("Nome do cliente: " + cliente.getPessoa().getNome());
		System.out.println();
		
		cliente.setDataCadastro(new Date());
		cliente.setLiberado(false);
		
		clienteDAO.update(cliente);
		System.out.println();
		System.out.println("Pessoa editada: ");
		System.out.println("Data de cadastro: " + cliente.getDataCadastro());
		System.out.println("Status de liberação: " + cliente.getLiberado());
		System.out.println("Nome do cliente: " + cliente.getPessoa().getNome());
		System.out.println();
	
	}
}
