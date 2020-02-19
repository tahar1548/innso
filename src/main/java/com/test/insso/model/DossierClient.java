package com.test.insso.model;

import java.util.ArrayList;
import java.util.List;

public class DossierClient {

	private String nomClient;
	private String dateOuverture;
	private String reference;
	private List<Message> MessagesList;
	
	
	public DossierClient() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DossierClient(String nomClient, String dateOuverture, String reference, List<Message> messagesList) {
		super();
		this.nomClient = nomClient;
		this.dateOuverture = dateOuverture;
		this.reference = reference;
		MessagesList = messagesList;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public String getDateOuverture() {
		return dateOuverture;
	}


	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}


	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public List<Message> getMessagesList() {
		if(MessagesList ==null) MessagesList = new ArrayList<Message>();
		return MessagesList;
	}


	public void setMessagesList(List<Message> messagesList) {
		MessagesList = messagesList;
	}


	@Override
	public String toString() {
		return "DossierClient [nomClient=" + nomClient + ", dateOuverture=" + dateOuverture + ", reference=" + reference
				+ ", MessagesList=" + MessagesList + "]";
	}
	
	
	
	
	 
	 
}
