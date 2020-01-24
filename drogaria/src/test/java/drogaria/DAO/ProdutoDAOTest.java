package drogaria.DAO;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import drogaria.dao.FabricanteDAO;
import drogaria.dao.ProdutoDAO;
import drogaria.domain.Fabricante;
import drogaria.domain.Produto;

public class ProdutoDAOTest {
	
	
	@Test
	public void salvar() {
		Integer codigo = 1;
		
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);
		
		Produto produto = new Produto();
		produto.setDescricao("Eno");
		produto.setFabricante(fabricante);
		produto.setPreco(new BigDecimal("3.00"));
		produto.setQuantidade(new Short("20"));
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);
		
		System.out.println("Produto salvo com sucesso.");
	}
	
	@Ignore
	@Test
	public void listar() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> resultado = produtoDAO.listar();
		
		for (Produto produto : resultado) {
			System.out.println("Descrição do produto: " + produto.getDescricao());
			System.out.println("Fabricante do produto: " + produto.getFabricante().getCodigo());
			System.out.println("Preço do produto: " + produto.getPreco());
			System.out.println("Quantidade do produto: " + produto.getQuantidade());
			System.out.println();
			
			}
		}
	
	@Ignore
	@Test
	public void buscar() {
		Integer codigo = 2;
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);
		
		if (produto == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro encontrado:");
			System.out.println(produto.getCodigo() + " - " + produto.getDescricao());
		}
		
		System.out.println("Descrição do produto: " + produto.getDescricao());
		System.out.println("Fabricante do produto: " + produto.getFabricante().getCodigo());
		System.out.println("Preço do produto: " + produto.getPreco());
		System.out.println("Quantidade do produto: " + produto.getQuantidade());
		System.out.println();
		
	}
	@Ignore
	@Test
	public void excluir() {
		Integer codigo = 5;
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);
		
		if (produto == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro encontrado:");
			System.out.println(produto.getCodigo() + " - " + produto.getDescricao());
		}
		produtoDAO.excluir(produto);
		System.out.println("Produto Removido: ");
		System.out.println("Descrição do produto: " + produto.getDescricao());
		System.out.println("Fabricante do produto: " + produto.getFabricante().getCodigo());
		System.out.println("Preço do produto: " + produto.getPreco());
		System.out.println("Quantidade do produto: " + produto.getQuantidade());
		System.out.println();
		
	}
	@Ignore
	@Test
	public void update() {
		Integer codigo = 6;
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);
		
		System.out.println("Produto à ser editado: ");
		System.out.println("Descrição do produto: " + produto.getDescricao());
		System.out.println("Fabricante do produto: " + produto.getFabricante().getCodigo());
		System.out.println("Preço do produto: " + produto.getPreco());
		System.out.println("Quantidade do produto: " + produto.getQuantidade());
		System.out.println();

		produto.setDescricao("Eno");
		
		produtoDAO.update(produto);
		
		System.out.println();
		System.out.println("Produto Editado: ");
		System.out.println("Descrição do produto: " + produto.getDescricao());
		System.out.println("Fabricante do produto: " + produto.getFabricante().getCodigo());
		System.out.println("Preço do produto: " + produto.getPreco());
		System.out.println("Quantidade do produto: " + produto.getQuantidade());
		System.out.println();
	}
	
	

}
