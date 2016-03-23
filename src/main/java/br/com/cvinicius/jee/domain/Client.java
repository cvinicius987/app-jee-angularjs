package br.com.cvinicius.jee.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tbl_client")
public class Client implements Serializable{
	
	private static final long serialVersionUID = 1L;

	static final String SQ_CLIENT = "sq_client";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Size(max=50)
	private String title;

	@NotNull
	@Size(max=20)
	private String cnpj;

	public Client(){}
	
	public Client(String title, String cnpj){
		this.title = title;
		this.cnpj	= cnpj;
	}
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public String getCnpj() {
		return cnpj;
	}
}