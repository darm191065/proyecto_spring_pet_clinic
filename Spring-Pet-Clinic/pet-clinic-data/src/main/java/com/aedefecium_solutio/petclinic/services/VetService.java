package com.aedefecium_solutio.petclinic.services;

import java.util.Set;

import com.aedefecium_solutio.petclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
