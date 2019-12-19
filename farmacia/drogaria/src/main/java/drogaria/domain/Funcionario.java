package drogaria.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SuppressWarnings("serial")
public class Funcionario extends GenericDomain {

	@Column(length = 15, nullable = false)
	private String cateiraTrabalho;

	@Temporal(TemporalType.DATE)
	private Date dataAdmissao;

	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;

	public String getCateiraTrabalho() {
		return cateiraTrabalho;
	}

	public void setCateiraTrabalho(String cateiraTrabalho) {
		this.cateiraTrabalho = cateiraTrabalho;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
