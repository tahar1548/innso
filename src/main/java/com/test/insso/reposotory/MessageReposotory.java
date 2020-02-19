package com.test.insso.reposotory;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.insso.model.DossierClient;
import com.test.insso.model.ListeDossiers;
import com.test.insso.model.Message;
import com.test.insso.utils.Canal;

@Repository
public class MessageReposotory {
	
	public Message saveMessage(Message m ) {
		 
		m.setDate((new Date()).toString());
		m.setCanal(Canal.FACEBOOK);
		
		
		DossierClient ds = new DossierClient();
		ds.setDateOuverture((new Date()).toString());
		ds.setNomClient(m.getNomAuteur());
		ds.setReference("KA-18B6");
		Message messageSonia = new Message();
		messageSonia.setCanal(Canal.FACEBOOK);
		messageSonia.setContenuMessage("Je suis " + 
				"Sonia, et je vais mettre tout en œuvre pour vous aider. Quel est le modèle de votre " + 
				"téléphone ? ");
		messageSonia.setDate((new Date()).toString());
		messageSonia.setNomAuteur("Sonia Valentin");
		
		ds.getMessagesList().add(m);
		ds.getMessagesList().add(messageSonia);
		
		
		
		
		ListeDossiers ls = new ListeDossiers();
		ls.getDossierClientList().add(ds);
		
		
		return m;
	}
	
	public List<DossierClient> GetAllFolders() {
		
		return ListeDossiers.DossierClientList; 
				
	}

}
