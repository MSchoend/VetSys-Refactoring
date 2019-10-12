package VetPet.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import VetPet.VetClinic;

public class VetClinicTest {

	VetClinic vc;
	
	@Before
	public void setUp() throws Exception {
		vc = new VetClinic("TheVet");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		vc.addCat("Oliver", "000001", "Mouse", "Active");
		assertEquals(1, vc.numAnimals());
		vc.addDog("Spot", "100000", "Collie", "Active");
		assertEquals(2, vc.numAnimals());
		
	}

}
