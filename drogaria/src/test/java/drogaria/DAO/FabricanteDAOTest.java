package drogaria.DAO;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import drogaria.dao.FabricanteDAO;
import drogaria.domain.Fabricante;

public class FabricanteDAOTest {
		
		@Test
		public void salvar() {
			Fabricante fabricante = new Fabricante();
			fabricante.setDescricao("xx1");
			

			FabricanteDAO fabricanteDAO = new FabricanteDAO();
			fabricanteDAO.salvar(fabricante);
			System.out.println("Fabricante cadastrado com sucesso");
		}
		@Ignore
		@Test
		public void listar() {
			FabricanteDAO fabricanteDAO = new FabricanteDAO();
			List<Fabricante> resultado = fabricanteDAO.listar();

			System.out.println("Total de Registros Encontrados: " + resultado.size());

			for (Fabricante fabricante : resultado) {
				System.out.println(fabricante.getDescricao());
			}
		}
		
		@Ignore
		@Test
		public void buscar() {
			Integer codigo = 1;

			FabricanteDAO fabricanteDAO = new FabricanteDAO();
			Fabricante fabricante = fabricanteDAO.buscar(codigo);

			if (fabricante == null) {
				System.out.println("Nenhum registro encontrado");
			} else {
				System.out.println("Registro encontrado:");
				System.out.println(fabricante.getDescricao());
			}
		}
		
		@Ignore
		@Test
		public void excluir() {
			Integer codigo = 1;

			FabricanteDAO fabricanteDAO = new FabricanteDAO();
			Fabricante fabricante = fabricanteDAO.buscar(codigo);

			if (fabricante == null) {
				System.out.println("Nenhum registro encontrado");
			} else {
				fabricanteDAO.excluir(fabricante);
				System.out.println("Registro removido");
				System.out.println(fabricante.getDescricao());
			}

		}
		
		@Ignore
		@Test
		public void editar(){
			Integer codigo = 2;
			FabricanteDAO fabricanteDAO = new FabricanteDAO();
			Fabricante fabricante= fabricanteDAO.buscar(codigo);
			
			if(fabricante == null){
				System.out.println("Nenhum registro encontrado");
			}else{
				System.out.println("Registro editado - Antes:");
				System.out.println(fabricante.getDescricao());
				
				fabricante.setDescricao("Neo Quimica");
				fabricanteDAO.update(fabricante);
				
				System.out.println("Registro editado - Depois:");
				System.out.println(fabricante.getDescricao());
			}
		}
}
