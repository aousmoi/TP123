package td.info.model;

import td.info.enums.TypeAnimal;

public class Animal {

	private String nomAnimal;
	private TypeAnimal typeAnimal;

	public String getNomAnimal() {
		return nomAnimal;
	}

	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}

	public TypeAnimal getTypeAnimal() {
		return typeAnimal;
	}

	public void setTypeAnimal(TypeAnimal typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	public Animal(String nomAnimal, TypeAnimal typeAnimal) {
		super();
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
	}

}
