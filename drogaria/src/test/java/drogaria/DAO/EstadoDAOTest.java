package drogaria.DAO;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import drogaria.dao.EstadoDAO;
import drogaria.domain.Estado;

public class EstadoDAOTest {
	@Test
	
	public void salvar() {
		Estado estado = new Estado();
		estado.setNome("Minas Gerais");
		estado.setSigla("MG");

		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);

	}
	@Ignore
	@Test
	public void listar() {
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> resultado = estadoDAO.listar();
		
		System.out.println("Total de Registros Encontrados: " + resultado.size());
		
		for(Estado estado : resultado) {
			System.out.println(estado.getSigla() + " - " + estado.getNome());
		}
	}
	
	@Ignore
	@Test
	public void buscar() {
		Long codigo = 2L;
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);		
		
		if(estado == null) {
			System.out.println("Nenhum registro encontrado");
		}else {
			System.out.println("Registro encontrado:");
			System.out.println(estado.getSigla() + " - " + estado.getNome());
		}
	}
	
	@Ignore
	@Test
	public void excluir() {
		
	}
}
