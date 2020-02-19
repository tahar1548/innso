package com.test.insso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.insso.model.DossierClient;
import com.test.insso.model.Message;
import com.test.insso.reposotory.MessageReposotory;

@RestController
public class MessageController {
	
	@Autowired
	private MessageReposotory messageReposotory;
	
	@PostMapping(value = "/messages")
	public void save(@RequestBody Message message) {
		
		messageReposotory.saveMessage(message);
		
	 }
	
	@GetMapping(value = "/dossiers")
	public List<DossierClient> getAllFolder() {
		
		return messageReposotory.GetAllFolders();
		
	 }
	
	
	
}
