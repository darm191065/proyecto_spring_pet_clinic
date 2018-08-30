package com.aedefecium_solutio.petclinic.services.map;

import java.util.Set;

import com.aedefecium_solutio.petclinic.model.Owner;
import com.aedefecium_solutio.petclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Set<Owner> findAll(){
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Owner save(Owner object){
		return super.save(object.getId() ,object);
	}
	
	@Override
	public void delete(Owner Object){
		super.delete(Object);
	}
	
	@Override
	public void deleteById(Long id){
		super.deleteById(id);
	}
}
