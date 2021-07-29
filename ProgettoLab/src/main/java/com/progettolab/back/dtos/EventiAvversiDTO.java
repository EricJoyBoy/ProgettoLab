package com.progettolab.back.dtos;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import com.progettolab.back.domain.*;

@Entity
public class EventiAvversiDTO implements Serializable {

	/**
	 * @author Eric Marins
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String evento;
	private String Severita;
	private String noteOpzionali;
	
	
	public EventiAvversiDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EventiAvversiDTO(EventiAvversi obj) {
		super();
		this.id = obj.getId();
		this.evento = obj.getEvento();
		this.Severita = obj.getSeverita();
		this.noteOpzionali = obj.getNoteOpzionali();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEvento() {
		return evento;
	}


	public void setEvento(String evento) {
		this.evento = evento;
	}


	public String getSeverita() {
		return Severita;
	}


	public void setSeverita(String severita) {
		Severita = severita;
	}


	public String getNoteOpzionali() {
		return noteOpzionali;
	}


	public void setNoteOpzionali(String noteOpzionali) {
		this.noteOpzionali = noteOpzionali;
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
		EventiAvversiDTO other = (EventiAvversiDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}
