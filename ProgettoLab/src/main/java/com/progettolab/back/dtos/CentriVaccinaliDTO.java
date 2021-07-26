package com.progettolab.back.dtos;

import java.io.Serializable;

import com.progettolab.back.domain.CentriVaccinali;

public class CentriVaccinaliDTO implements Serializable{

	
	/**
	 * @author Eric Marins
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nomeCentro;
	private String qualificatore;
	private String nome;
	private String numeroCivico;
	private String comune;
	private String siglaProvincia;
	private String cap;
	private String Tipologia;
	
	public CentriVaccinaliDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CentriVaccinaliDTO(CentriVaccinali obj) {
		super();
		this.id = obj.getId();
		this.nomeCentro = obj.getNomeCentro();
		this.qualificatore = obj.getQualificatore();
		this.nome = obj.getNome();
		this.numeroCivico = obj.getNumeroCivico();
		this.comune = obj.getComune();
		this.siglaProvincia = obj.getSiglaProvincia();
		this.cap = obj.getCap();
		Tipologia = obj.getTipologia();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCentro() {
		return nomeCentro;
	}

	public void setNomeCentro(String nomeCentro) {
		this.nomeCentro = nomeCentro;
	}

	public String getQualificatore() {
		return qualificatore;
	}

	public void setQualificatore(String qualificatore) {
		this.qualificatore = qualificatore;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroCivico() {
		return numeroCivico;
	}

	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public String getSiglaProvincia() {
		return siglaProvincia;
	}

	public void setSiglaProvincia(String siglaProvincia) {
		this.siglaProvincia = siglaProvincia;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getTipologia() {
		return Tipologia;
	}

	public void setTipologia(String tipologia) {
		Tipologia = tipologia;
	}
	
	
	
	
}
