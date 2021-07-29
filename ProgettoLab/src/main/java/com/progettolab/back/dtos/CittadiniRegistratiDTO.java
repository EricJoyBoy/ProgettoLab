package com.progettolab.back.dtos;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import com.progettolab.back.domain.*;


/**
 * @author Eric Marins
 */




@Entity
public class CittadiniRegistratiDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String codiceFiscale;
	private String  email;
	private String  userId;
	private String password;
	private String idUnivoco;
	
	public CittadiniRegistratiDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CittadiniRegistratiDTO(CittadiniRegistrati obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.codiceFiscale = obj.getCodiceFiscale();
		this.email = obj.getEmail();
		this.userId = obj.getUserId();
		this.password = obj.getPassword();
		this.idUnivoco = obj.getIdUnivoco();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdUnivoco() {
		return idUnivoco;
	}

	public void setIdUnivoco(String idUnivoco) {
		this.idUnivoco = idUnivoco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CittadiniRegistratiDTO other = (CittadiniRegistratiDTO) obj;
		return Objects.equals(id, other.id);
	}

	
	

}
