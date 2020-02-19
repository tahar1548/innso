package com.test.insso.model;

import com.test.insso.utils.Canal;

public class Message {
	
	private String date; 
	private String nomAuteur;
	private String contenuMessage;
	private Canal canal;
	

	public Message() {
		super();
	}
	public Message(String date, String nomAuteur, String contenuMessage, Canal canal) {
		super();
		this.date = date;
		this.nomAuteur = nomAuteur;
		this.contenuMessage = contenuMessage;
		this.canal = canal;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNomAuteur() {
		return nomAuteur;
	}
	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}
	public String getContenuMessage() {
		return contenuMessage;
	}
	public void setContenuMessage(String contenuMessage) {
		this.contenuMessage = contenuMessage;
	}
	public Canal getCanal() {
		return canal;
	}
	public void setCanal(Canal canal) {
		this.canal = canal;
	}
	
	
	@Override
	public String toString() {
		return "Message [date=" + date + ", nomAuteur=" + nomAuteur + ", contenuMessage=" + contenuMessage + ", canal="
				+ canal + "]";
	}
	
	
}
