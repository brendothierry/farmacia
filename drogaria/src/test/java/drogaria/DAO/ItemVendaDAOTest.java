package drogaria.DAO;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import drogaria.dao.ItemVendaDAO;
import drogaria.dao.ProdutoDAO;
import drogaria.dao.VendaDAO;
import drogaria.domain.ItemVenda;
import drogaria.domain.Produto;
import drogaria.domain.Venda;

public class ItemVendaDAOTest {
	@Ignore
	@Test
	public void salvar() {
		Integer codigoProduto = 1;
		Integer codigoVenda = 2;
		
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigoProduto);	
		
		
		VendaDAO vendaDAO = new VendaDAO ();
		Venda venda = vendaDAO.buscar(codigoVenda);
		
		
		ItemVenda itemVenda = new ItemVenda();
		itemVenda.setQuantidade(new Short("100"));
		itemVenda.setPrecoParcial(new BigDecimal("90.00"));
		itemVenda.setProduto(produto);
		itemVenda.setVenda(venda);
		
		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		itemVendaDAO.salvar(itemVenda);
		
		System.out.println("Item vendido salvo com sucesso.");
		
	}
	
	@Ignore
	@Test
	public void listar() {
		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		List<ItemVenda> resultado = itemVendaDAO.listar();
		
		for (ItemVenda itemVenda : resultado) {
			System.out.println("Lista de itens vendidos: ");
			System.out.println("Quantidade de itens em estoque: " + itemVenda.getQuantidade());
			System.out.println("Preço parcial do item: " + itemVenda.getPrecoParcial());
			System.out.println("Item vendido: " + itemVenda.getProduto());
			System.out.println();
		}
	}
	@Ignore
	@Test
	public void buscar() {
		Integer codigo = 1;
		
		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		ItemVenda itemVenda = itemVendaDAO.buscar(codigo);
		
		if (itemVenda == null) {
			System.out.println("Nenhum registro encontrado");
		}else {
			System.out.println("Registro encontrado: ");
			System.out.println(itemVenda.getProduto().getDescricao());
			System.out.println(itemVenda.getQuantidade());
			System.out.println(itemVenda.getPrecoParcial());
		}
	}
	@Ignore
	@Test
	public void excluir() {
		Integer codigo = 5;
		
		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		ItemVenda itemVenda = itemVendaDAO.buscar(codigo);
		
		if (itemVenda == null) {
			System.out.println("Nenhum registro encontrado");
		}else {
			System.out.println("Registro encontrado: ");
		}
		itemVendaDAO.excluir(itemVenda);
		System.out.println("Registro removido: ");
		System.out.println(itemVenda.getProduto().getDescricao());
		System.out.println(itemVenda.getQuantidade());
		System.out.println(itemVenda.getPrecoParcial());
	}
	
	@Ignore
	@Test 
	public void update() {
		Integer codigo = 4;
		
		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		ItemVenda itemVenda = itemVendaDAO.buscar(codigo);
		
		System.out.println("Produto a ser editado: ");
		System.out.println(itemVenda.getProduto().getDescricao());
		System.out.println(itemVenda.getQuantidade());
		System.out.println(itemVenda.getPrecoParcial());
		
		itemVenda.setPrecoParcial (new BigDecimal ("45.00"));
		
		itemVendaDAO.update(itemVenda);
		
		System.out.println();
		System.out.println("Produto editado com sucesso");
		System.out.println(itemVenda.getProduto().getDescricao());
		System.out.println(itemVenda.getQuantidade());
		System.out.println(itemVenda.getPrecoParcial());
		
		
		
	}
}
	