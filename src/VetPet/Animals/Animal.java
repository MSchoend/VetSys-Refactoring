package VetPet.Animals;

import VetPet.IDNum;

public abstract class Animal {

	private IDNum ID;
	private String type;
	private String name;

	public Animal(String name, IDNum ID, String type) {
		this.name = name;
		this.ID = ID;
		this.type = type;
	}

	public void setAnimalName(String newName) {
		name = newName;
	}

	public String getAnimalName() {
		return name;
	}
	
	public IDNum getID() {
		return ID;
	}
	
	public String getType() {
		return type;
	}
	
	public abstract void setTrait(String trait);
	
	public abstract String getTrait();

}