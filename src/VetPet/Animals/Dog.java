package VetPet.Animals;

/*==========================================================================*/
/** \file Dog.java
    \brief 
    \author Jordan James Kidney
    \date Sept 25, 2005

    
*/
/* 
   Location: University of Calgary, Alberta, Canada
   Created on:    Sept 25, 2005
   Last Updated   Sept 25, 2005
========================================================================*/

/**
 * \class Dog \brief holds information on a single dog
 * 
 */

public class Dog extends Animal {

	public Dog(String name, String ID, String K9_family, String type) {
		super(name, ID, type);
		this.K9_family = K9_family;
	}

	public void setTrait(String fam) {
		K9_family = fam;
	}

	public String getTrait() {
		return K9_family;
	}

	private String K9_family;
}
