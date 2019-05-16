package balsamVirtualPet;

public class VirtualPet {

	private String name;
	private String type;
	private int hunger;
	private int play;
	public int eat;
	public int sleep;

	private boolean running = true;

	// Tick Generator
	public void tick() {
		hunger += (25 + generateRandom());
		play -= (20 + generateRandom());
		sleep -= (50 + generateRandom());
		eat -= (40 + generateRandom());
	}

	private int generateRandom() {
		// TODO Auto-generated method stub
		return 0;
	}

	public VirtualPet(String name, String type, int hunger) {
		super();
		this.name = name;
		this.type = type;
		hunger = 25;
		play = 20;
		sleep = 50;
		eat = 40;
	}

	public String getPetName() {
		return name;
	}

	public String getPetType() {
		return type;
	}

	public int getHunger() {
		return hunger;
	}

	public int getPlay() {
		return play;
	}

	public int getSleep() {
		return sleep;
	}

	public int getEat() {
		return eat;
	}

	public void play(int amount) {
		if (hunger < amount) {
			hunger += amount;
		} else {
			hunger -= amount;
		}
		System.out.println("Am bored, play with me");

	}

	public void feed(int amount) {
		if (hunger > amount) {
		} else {
			hunger = amount;
		}
		System.out.println("feed me");
	}

	public void sleep(int amount) {
		if (sleep > amount) {
		} else {
			hunger = amount;
		}
		System.out.println("I need to sleep");
	}

//Tick Reset
	public void reset() {
		hunger = 0;
		play = 0;
		sleep = 0;
	}

}
