package com.senai.pedro.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_cliente")
	public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idcCliente;
	
	
	@Column(name = "Cliente")
	private String nCliente;
	
	@Column(name = "Fone")
	private String fone;
	
	
	//get
	
	//setters
	
	public Long getidcCliente() {
		return idcCliente;
	}
	
	public void setidcCliente(Long idcCliente) {
		this.idcCliente = idcCliente;
	}
	
	public String getnCliente() {
		return nCliente;
	}
	
	public void setnCliente(String nCliente) {
		this.nCliente = nCliente;
	}
	
	public void setfone(String fone) {
		 this.fone = fone;
	}
	public String getfone() {
		return fone;
	}

}

