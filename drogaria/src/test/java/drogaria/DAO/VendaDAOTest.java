package drogaria.DAO;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import drogaria.dao.ClienteDAO;
import drogaria.dao.FuncionarioDAO;
import drogaria.dao.VendaDAO;
import drogaria.domain.Cliente;
import drogaria.domain.Funcionario;
import drogaria.domain.Venda;


public class VendaDAOTest {
	@Ignore
	@Test
	public void salvar() {
		Integer codigoCliente = 2;
		Integer codigoFuncionario = 5;
		
		
				
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigoCliente);
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigoFuncionario);
		
		Venda venda = new Venda();
		venda.setCliente(cliente);
		venda.setFuncionario(funcionario);
		venda.setHorario(new Date());
		venda.setPrecoTotal(new BigDecimal(10.00));
		
		VendaDAO vendaDAO = new VendaDAO();
		vendaDAO.salvar(venda);
		
		System.out.println("Venda salva com sucesso");

	}
	@Ignore
	@Test
	public void listar() {
		VendaDAO vendaDAO = new VendaDAO();
		List<Venda> resultado = vendaDAO.listar();
		
		for (Venda venda : resultado) {
			System.out.println();
			System.out.println("Cliente que comprou: " + venda.getCliente().getPessoa().getNome());
			System.out.println("Funcionário que realizou a venda: " + venda.getFuncionario().getCateiraTrabalho());
			System.out.println("Data da venda: " + venda.getHorario());
			System.out.println("Valor da venda: " + venda.getPrecoTotal());
			System.out.println();
		}
	}
	
	@Ignore
	@Test
	public void buscar() {
		Integer codigo = 2;
		
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigo);
		
		if(venda == null) {
			System.out.println("Nenhuma venda realizada neste período");
		}else {
			System.out.println("Registro encontrado: " );
			System.out.println();
			System.out.println("Cliente que comprou: " + venda.getCliente().getPessoa().getNome());
			System.out.println("Funcionário que realizou a venda: " + venda.getFuncionario().getCateiraTrabalho());
			System.out.println("Data da venda: " + venda.getHorario());
			System.out.println("Valor da venda: " + venda.getPrecoTotal());
			System.out.println();
			
		}
	}
	@Ignore
	@Test
	public void excluir () {
		Integer codigo = 3;
		
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigo);
		
		if (venda == null) {
			System.out.println("Nenhuma venda realizada neste período");
		}else {
			System.out.println("Registro encontrado: ");
			System.out.println(venda.getCliente().getPessoa().getNome());
		}
		vendaDAO.excluir(venda);
		System.out.println("Venda removida: ");
		System.out.println("Cliente que comprou: " + venda.getCliente().getPessoa().getNome());
		System.out.println("Data da venda: " + venda.getHorario());
		System.out.println("Valor da venda: " + venda.getPrecoTotal());
		System.out.println();
	}
	@Test
	public void update() {
		Integer codigo = 2;
		
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigo);
		System.out.println("Produto a ser editado: ");
		System.out.println("Horário da venda: " + venda.getHorario());
		System.out.println("Nome do vendedor: " + venda.getFuncionario().getPessoa().getNome());
		System.out.println("Valor da venda: " + venda.getPrecoTotal());
		System.out.println();
		venda.setPrecoTotal(new BigDecimal(100.00));
		
		vendaDAO.update(venda);
		
		System.out.println("Produto editado: ");
		System.out.println("Horário da venda: " + venda.getHorario());
		System.out.println("Nome do vendedor: " + venda.getFuncionario().getPessoa().getNome());
		System.out.println("Valor da venda: " + venda.getPrecoTotal());
	}
	
}
