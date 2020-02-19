package com.test.insso.model;

import java.util.ArrayList;
import java.util.List;

public class ListeDossiers {
	
	 private List<DossierClient> DossierClientList;

	public List<DossierClient> getDossierClientList() {
		if(DossierClientList==null)
			DossierClientList = new ArrayList<>();
		return DossierClientList;
	}

	public void setDossierClientList(List<DossierClient> dossierClientList) {
		DossierClientList = dossierClientList;
	}
	 
	 
}
