
public class Wizard extends Human{

	public Wizard() {
		this.health=50;
		this.intelligence=8;
	}
	
	public void heal(Human human) {
		human.health += human.intelligence;
	}
	
	public void fireball(Human human) {
		human.health -=(human.intelligence*3);
	}
	
}