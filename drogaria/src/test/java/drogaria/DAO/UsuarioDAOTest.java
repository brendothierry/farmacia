package drogaria.DAO;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import drogaria.dao.PessoaDAO;
import drogaria.dao.UsuarioDAO;
import drogaria.domain.Pessoa;
import drogaria.domain.Usuario;

public class UsuarioDAOTest {
	@Ignore
	@Test
	public void salvar() {
		Integer codigo = 1;

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);

		Usuario usuario = new Usuario();
		usuario.setAtivo(true);
		usuario.setPessoa(pessoa);
		usuario.setSenha("788789");
		usuario.setTipo('D');

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);

		System.out.println("Usuário salvo com sucesso");
	}
	@Ignore
	@Test
	public void listar() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		List<Usuario> resultado = usuarioDAO.listar();

		for (Usuario usuario : resultado) {
			System.out.println();
			System.out.println("Usuário ativo: " + usuario.getAtivo());
			System.out.println("Senha do usuário: " + usuario.getSenha());
			System.out.println("Nome do usuário: " + usuario.getPessoa().getNome());
			System.out.println();

		}
	}
	@Ignore
	@Test
	public void buscar() {
		Integer codigo = 3;
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);
		
		if (usuario == null) {
			System.out.println("Nenhum registro encontrado");
		}else {
			System.out.println("Registro encontrado: ");
			System.out.println(usuario.getPessoa().getNome());
		}
		
		System.out.println();
		System.out.println("Usuário ativo: " + usuario.getAtivo());
		System.out.println("Senha do usuário: " + usuario.getSenha());
		System.out.println("Nome do usuário: " + usuario.getPessoa().getCpf());
		System.out.println();

	}
	@Ignore
	@Test
	public void excluir() {
		Integer codigo = 3;
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);
		
		if (usuario == null) {
			System.out.println("Nenhum registro encontrado");
		}else {
			System.out.println("Registro encontrado: ");
		}
		
		usuarioDAO.excluir(usuario);
		System.out.println();
		System.out.println("Usuário removido: ");
		System.out.println("Usuário ativo: " + usuario.getAtivo());
		System.out.println("Senha do usuário: " + usuario.getSenha());
		System.out.println("Nome do usuário: " + usuario.getPessoa().getNome());
		System.out.println();
		
	}
	@Ignore
	@Test
	public void update() {
		
		Integer codigo = 4;
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);
		
		System.out.println("Usuário à ser editado: ");
		System.out.println("Usuário ativo: " + usuario.getAtivo());
		System.out.println("Senha do usuário: " + usuario.getSenha());
		System.out.println("Nome do usuário: " + usuario.getPessoa().getNome());
		System.out.println();
		
		usuario.setSenha("141014");
		
		usuarioDAO.update(usuario);
		
		System.out.println("Usuário editado: ");
		System.out.println("Usuário ativo: " + usuario.getAtivo());
		System.out.println("Senha do usuário: " + usuario.getSenha());
		System.out.println("Nome do usuário: " + usuario.getPessoa().getNome());
		System.out.println();
		
	}
	
}
