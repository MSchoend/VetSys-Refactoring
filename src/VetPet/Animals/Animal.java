package VetPet.Animals;

public class Animal {

	public String ID;
	public String type;
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

}