package VetPet.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import VetPet.IDNum;

public class IDNumTest {

	IDNum good;
	IDNum badLength;
	IDNum badChars;
	
	@Before
	public void setUp() throws Exception {
		good = new IDNum("123456");
		badLength = new IDNum("1");
		badChars = new IDNum("abcdef");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(good.isValid());
		assertFalse(badLength.isValid());
		assertFalse(badChars.isValid());
	}

}
