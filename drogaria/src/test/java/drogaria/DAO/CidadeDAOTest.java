package drogaria.DAO;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import drogaria.dao.CidadeDAO;
import drogaria.dao.EstadoDAO;
import drogaria.domain.Cidade;
import drogaria.domain.Estado;

public class CidadeDAOTest {
	
	
	@Test
	public void salvar() {
		EstadoDAO estadoDAO = new EstadoDAO();
				
		Estado estado = estadoDAO.buscar(1);
		
		
		Cidade cidade = new Cidade();
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
			System.out.println("Código :" + cidade.getCodigo());
			System.out.println("Nome :" + cidade.getNome());
			System.out.println("Estado :" + cidade.getEstado().getCodigo());
			System.out.println("Sigla do Estado :" + cidade.getEstado().getSigla());
			System.out.println("Nome do Estado :" + cidade.getEstado().getNome());
			
			
		}
		
	}

}
//teste para commit novo
