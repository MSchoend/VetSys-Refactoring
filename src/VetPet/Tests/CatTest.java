package VetPet.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import VetPet.Animals.Cat;

public class CatTest {

	private Cat kitty;
	
	@Before
	public void setUp() throws Exception {
		kitty = new Cat("Oliver", "123456", "mouse", "active");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("Oliver", kitty.getAnimalName());
		kitty.setAnimalName("Shadow");
		assertEquals("Shadow", kitty.getAnimalName());
		assertEquals("mouse", kitty.getTrait());
		kitty.setTrait("ball");
		assertEquals("ball", kitty.getTrait());
	}

}
