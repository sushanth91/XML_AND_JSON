package com.xml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xml.entity.Engineer;
import com.xml.service.EngineerService;

@RestController
@RequestMapping("/api")
public class EngineerController {
	@Autowired
	private EngineerService serv;
	
	@PostMapping(consumes ={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} )
	public void save(@RequestBody Engineer engineer) {
		serv.saveEngineer(engineer);
		
	}
	  @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} )
	public List<Engineer> getEngineerDetails(){
		return serv.getEngineer();
	}

}
