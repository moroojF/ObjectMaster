
public class Samurai extends Human {
    private static int defHealth = 200;
    private static int countSamurais = 0;

	public Samurai() {
		this.health = defHealth;
        Samurai.countSamurais++;
	}
	
	public void deathBlow(Human human) {
		human.health = 0;
		this.health/= 2;
	}
	
	public void meditate() {
		this.health = defHealth;
	}
	
	public static int howMany() {
		return countSamurais;
	}
}
