package VetPet.Animals;

import VetPet.IDNum;

/*==========================================================================*/
/** \file Cat.java
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
 * \class Cat \brief holds information on a single cat
 * 
 */

public class Cat extends Animal {

	public Cat(String name, IDNum ID, String fav_cat_toy, String type) {
		super(name, ID, type);
		this.fav_cat_toy = fav_cat_toy;
	}

	public void setTrait(String toy) {
		fav_cat_toy = toy;
	}

	public String getTrait() {
		return fav_cat_toy;
	}

	private String fav_cat_toy;
}
