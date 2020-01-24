package drogaria.DAO;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import drogaria.dao.CidadeDAO;
import drogaria.dao.EstadoDAO;
import drogaria.domain.Cidade;
import drogaria.domain.Estado;

public class CidadeDAOTest {
	
	@Ignore
	@Test
	public void salvar() {
		EstadoDAO estadoDAO = new EstadoDAO();
				
		Estado estado = estadoDAO.buscar(1);
		Cidade cidade = new Cidade(); 	
		cidade.setCodigo(1L);
		cidade.setNome("Ourinhos");
		cidade.setEstado(estado);
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		cidadeDAO.salvar(cidade);
		}
	
	@Ignore
	@Test
	public void listar() {
		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> resultado = cidadeDAO.listar();
		
		for (Cidade cidade : resultado) {
			System.out.println("Código da Cidade:" + cidade.getCodigo());
			System.out.println("Nome da Cidade:" + cidade.getNome());
			System.out.println("Código do Estado :" + cidade.getEstado().getCodigo());
			System.out.println("Sigla do Estado :" + cidade.getEstado().getSigla());
			System.out.println("Nome do Estado :" + cidade.getEstado().getNome());
			System.out.println();
		}
	}
	
	@Ignore
	@Test
	public void buscar	(){
		Integer codigo = 1;
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);
		if (cidade == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro encontrado:");
			System.out.println(cidade.getCodigo() + " - " + cidade.getNome());
		}
		
		System.out.println("Código da Cidade:" + cidade.getCodigo());
		System.out.println("Nome da Cidade:" + cidade.getNome());
		System.out.println("Código do Estado :" + cidade.getEstado().getCodigo());
		System.out.println("Sigla do Estado :" + cidade.getEstado().getSigla());
		System.out.println("Nome do Estado :" + cidade.getEstado().getNome());
		System.out.println();

	}
	@Ignore
	@Test
	public void excluir() {
		Integer codigo = 3;
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);
		
		cidadeDAO.excluir(cidade);
		if (cidade == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro encontrado:");
			System.out.println(cidade.getCodigo() + " - " + cidade.getNome());
		}
		
		
		System.out.println("Cidade removida :");
		System.out.println("Código da Cidade:" + cidade.getCodigo());
		System.out.println("Nome da Cidade:" + cidade.getNome());
		System.out.println("Código do Estado :" + cidade.getEstado().getCodigo());
		System.out.println("Sigla do Estado :" + cidade.getEstado().getSigla());
		System.out.println("Nome do Estado :" + cidade.getEstado().getNome());
		System.out.println();
		
	}
	
	@Test
	public void update() {
		Integer codigoCidade = 6;
		Integer codigoEstado = 1;
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigoEstado);
		
		/**System.out.println("Código do Estado :" + estado.getCodigo());
		System.out.println("Sigla do Estado :" + estado.getSigla());
		System.out.println("Nome do Estado :" + estado.getNome()); **/
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigoCidade);
		
		System.out.println("Cidade a ser editada:");
		System.out.println("Código da Cidade:" + cidade.getCodigo());
		System.out.println("Nome da Cidade:" + cidade.getNome());
		System.out.println("Código do Estado :" + cidade.getEstado().getCodigo());
		System.out.println("Sigla do Estado :" + cidade.getEstado().getSigla());
		System.out.println("Nome do Estado :" + cidade.getEstado().getNome());
		System.out.println();
		
		cidade.setNome("Londrina");
		cidade.setEstado(estado);
		
		cidadeDAO.update(cidade);
		
		System.out.println("Cidade editada :");
		System.out.println("Código da Cidade:" + cidade.getCodigo());
		System.out.println("Nome da Cidade:" + cidade.getNome());
		System.out.println("Código do Estado :" + cidade.getEstado().getCodigo());
		System.out.println("Sigla do Estado :" + cidade.getEstado().getSigla());
		System.out.println("Nome do Estado :" + cidade.getEstado().getNome());
		System.out.println();
		
	}
	
	
}

	
