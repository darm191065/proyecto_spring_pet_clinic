package com.aedefecium_solutio.petclinic.services;

import java.util.Set;

import com.aedefecium_solutio.petclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
