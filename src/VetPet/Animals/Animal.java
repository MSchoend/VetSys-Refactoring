package VetPet.Animals;

public class Animal {

	private String ID;
	private String type;
	private String name;

	public Animal(String name, String ID, String type) {
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
	
	public String getID() {
		return ID;
	}
	
	public String getType() {
		return type;
	}

}