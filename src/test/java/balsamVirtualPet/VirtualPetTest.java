package balsamVirtualPet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

//	VirtualPet underTest = new VirtualPet("", "", 25);

	@Test
	public void nameTest() {
		VirtualPet underTest = new VirtualPet("Balsam", "", 25);
		assertEquals("Balsam", underTest.getPetName());
	}

	@Test
	public void typeTest() {
		VirtualPet underTest = new VirtualPet("", "Koala", 25);
		assertEquals("Koala", underTest.getPetType());
	}

	@Test
	public void shouldHaveHungerLevelof25() {
		VirtualPet underTest = new VirtualPet("", "", 25);
		int hunger = underTest.getHunger();
		assertEquals(25, hunger);

	}

	@Test
	public void shouldHaveHungerLevelof45afterplaying20() {
		VirtualPet underTest = new VirtualPet("", "", 25);
		underTest.play(20);
		int hunger = underTest.getHunger();
		assertEquals(45, hunger);
	}

	@Test
	public void isSleeping() {
		VirtualPet underTest = new VirtualPet("", "", 25);
		boolean sleeping = true;
		assertEquals(sleeping, underTest.sleep);
	}

	@Test
	public void isEating() {
		VirtualPet underTest = new VirtualPet("", "", 25);
		boolean eating = true;
		assertEquals(eating, underTest.eat);
	}
}
