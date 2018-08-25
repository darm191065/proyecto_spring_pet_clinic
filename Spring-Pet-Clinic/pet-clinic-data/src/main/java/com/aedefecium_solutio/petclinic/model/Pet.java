package com.aedefecium_solutio.petclinic.model;

import java.time.LocalDate;

public class Pet {

	private PetType petType;
	private Owner owner;
	private LocalDate bityhDate;
	
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBityhDate() {
		return bityhDate;
	}
	public void setBityhDate(LocalDate bityhDate) {
		this.bityhDate = bityhDate;
	}
	
}
