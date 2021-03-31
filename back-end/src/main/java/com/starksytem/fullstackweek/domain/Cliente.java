package com.starksytem.fullstackweek.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Boolean ativo;
	private Long codigo;	
	private String nome;
	private String razaoSocial;
	private String pfPj;
	private String tipoCliente;
	private String tipoTributacao;
	private String contato;
	private String cpf;
	private String rg;
	private String cnpj;
	private String ie;
	private Boolean ieBaixado;
	private String ieSubstituto;
	private String iMunicipal;
	private String email;
	private String cep;
	private String endereco;
	private String complemento;
	private String numero;
	private String uf;
	private Integer ddd1;
	private Integer telefone1;
	private Integer dddcel;
	private Integer celular;
	private Boolean bloqueado;
	private Date cadastrado;
	private Date inativo;
	private String obs;

	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getPfPj() {
		return pfPj;
	}
	public void setPfPj(String pfPj) {
		this.pfPj = pfPj;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	public String getTipoTributacao() {
		return tipoTributacao;
	}
	public void setTipoTributacao(String tipoTributacao) {
		this.tipoTributacao = tipoTributacao;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public Boolean getIeBaixado() {
		return ieBaixado;
	}
	public void setIeBaixado(Boolean ieBaixado) {
		this.ieBaixado = ieBaixado;
	}
	public String getIeSubstituto() {
		return ieSubstituto;
	}
	public void setIeSubstituto(String ieSubstituto) {
		this.ieSubstituto = ieSubstituto;
	}
	public String getiMunicipal() {
		return iMunicipal;
	}
	public void setiMunicipal(String iMunicipal) {
		this.iMunicipal = iMunicipal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public Integer getDdd1() {
		return ddd1;
	}
	public void setDdd1(Integer ddd1) {
		this.ddd1 = ddd1;
	}
	public Integer getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(Integer telefone1) {
		this.telefone1 = telefone1;
	}
	public Integer getDddcel() {
		return dddcel;
	}
	public void setDddcel(Integer dddcel) {
		this.dddcel = dddcel;
	}
	public Integer getCelular() {
		return celular;
	}
	public void setCelular(Integer celular) {
		this.celular = celular;
	}
	public Boolean getBloqueado() {
		return bloqueado;
	}
	public void setBloqueado(Boolean bloqueado) {
		this.bloqueado = bloqueado;
	}
	public Date getCadastrado() {
		return cadastrado;
	}
	public void setCadastrado(Date cadastrado) {
		this.cadastrado = cadastrado;
	}
	public Date getInativo() {
		return inativo;
	}
	public void setInativo(Date inativo) {
		this.inativo = inativo;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ativo == null) ? 0 : ativo.hashCode());
		result = prime * result + ((bloqueado == null) ? 0 : bloqueado.hashCode());
		result = prime * result + ((cadastrado == null) ? 0 : cadastrado.hashCode());
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((contato == null) ? 0 : contato.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((ddd1 == null) ? 0 : ddd1.hashCode());
		result = prime * result + ((dddcel == null) ? 0 : dddcel.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((iMunicipal == null) ? 0 : iMunicipal.hashCode());
		result = prime * result + ((ie == null) ? 0 : ie.hashCode());
		result = prime * result + ((ieBaixado == null) ? 0 : ieBaixado.hashCode());
		result = prime * result + ((ieSubstituto == null) ? 0 : ieSubstituto.hashCode());
		result = prime * result + ((inativo == null) ? 0 : inativo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((obs == null) ? 0 : obs.hashCode());
		result = prime * result + ((pfPj == null) ? 0 : pfPj.hashCode());
		result = prime * result + ((razaoSocial == null) ? 0 : razaoSocial.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		result = prime * result + ((telefone1 == null) ? 0 : telefone1.hashCode());
		result = prime * result + ((tipoCliente == null) ? 0 : tipoCliente.hashCode());
		result = prime * result + ((tipoTributacao == null) ? 0 : tipoTributacao.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
			Cliente other = (Cliente) obj;
		if (ativo == null) {
			if (other.ativo != null)
				return false;
		} else if (!ativo.equals(other.ativo))
			return false;
		if (bloqueado == null) {
			if (other.bloqueado != null)
				return false;
		} else if (!bloqueado.equals(other.bloqueado))
			return false;
		if (cadastrado == null) {
			if (other.cadastrado != null)
				return false;
		} else if (!cadastrado.equals(other.cadastrado))
			return false;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (contato == null) {
			if (other.contato != null)
				return false;
		} else if (!contato.equals(other.contato))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (ddd1 == null) {
			if (other.ddd1 != null)
				return false;
		} else if (!ddd1.equals(other.ddd1))
			return false;
		if (dddcel == null) {
			if (other.dddcel != null)
				return false;
		} else if (!dddcel.equals(other.dddcel))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (iMunicipal == null) {
			if (other.iMunicipal != null)
				return false;
		} else if (!iMunicipal.equals(other.iMunicipal))
			return false;
		if (ie == null) {
			if (other.ie != null)
				return false;
		} else if (!ie.equals(other.ie))
			return false;
		if (ieBaixado == null) {
			if (other.ieBaixado != null)
				return false;
		} else if (!ieBaixado.equals(other.ieBaixado))
			return false;
		if (ieSubstituto == null) {
			if (other.ieSubstituto != null)
				return false;
		} else if (!ieSubstituto.equals(other.ieSubstituto))
			return false;
		if (inativo == null) {
			if (other.inativo != null)
				return false;
		} else if (!inativo.equals(other.inativo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (obs == null) {
			if (other.obs != null)
				return false;
		} else if (!obs.equals(other.obs))
			return false;
		if (pfPj == null) {
			if (other.pfPj != null)
				return false;
		} else if (!pfPj.equals(other.pfPj))
			return false;
		if (razaoSocial == null) {
			if (other.razaoSocial != null)
				return false;
		} else if (!razaoSocial.equals(other.razaoSocial))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (telefone1 == null) {
			if (other.telefone1 != null)
				return false;
		} else if (!telefone1.equals(other.telefone1))
			return false;
		if (tipoCliente == null) {
			if (other.tipoCliente != null)
				return false;
		} else if (!tipoCliente.equals(other.tipoCliente))
			return false;
		if (tipoTributacao == null) {
			if (other.tipoTributacao != null)
				return false;
		} else if (!tipoTributacao.equals(other.tipoTributacao))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}

}
