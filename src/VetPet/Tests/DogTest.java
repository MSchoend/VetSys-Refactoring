package VetPet.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import VetPet.Animals.Dog;

public class DogTest {
	
	private Dog doggy;
	
	@Before
	public void setUp() throws Exception {
		doggy = new Dog("Spot", "123456", "Collie", "active");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("Spot", doggy.getAnimalName());
		doggy.setAnimalName("Lightning");
		assertEquals("Lightning", doggy.getAnimalName());
		assertEquals("Collie", doggy.getK9_family());
	}
	
}
