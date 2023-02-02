package com.xml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.entity.Engineer;
import com.xml.repository.EngineerRepo;

@Service
public class EngineerService {
	
	@Autowired
	private EngineerRepo repo;

	public void saveEngineer(Engineer engineer) {
		repo.save(engineer);
	}

	public List<Engineer> getEngineer() {
		return repo.findAll();
	}

}
