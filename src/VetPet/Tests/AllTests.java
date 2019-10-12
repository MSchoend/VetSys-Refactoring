package VetPet.Tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CatTest.class, DogTest.class, IDNumTest.class, VetClinicTest.class })
public class AllTests {
}
