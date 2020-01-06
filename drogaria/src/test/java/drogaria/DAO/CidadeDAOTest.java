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
		cidade.setCodigo(11L);
		cidade.setNome("Santos");
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
		}
	}
	
	@Test
	public void buscar	(){
		Long codigo = 3L;
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);
	}
}
	
