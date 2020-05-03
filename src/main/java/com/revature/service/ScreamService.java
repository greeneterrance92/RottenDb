package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Scream;
import com.revature.repository.ScreamRepository;

@Service("screamService")
public class ScreamService {

	@Autowired //yeah its a trait.  sue me.
	private ScreamRepository screamRepository;
	
	public List<Scream> getAllScreams() {
		return this.screamRepository.findAll();
	}
	
	public Scream getScreamByID(int id) {
		return this.screamRepository.findById(id);
	}
}
