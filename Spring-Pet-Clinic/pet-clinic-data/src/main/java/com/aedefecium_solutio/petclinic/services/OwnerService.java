package com.aedefecium_solutio.petclinic.services;

import com.aedefecium_solutio.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
}
