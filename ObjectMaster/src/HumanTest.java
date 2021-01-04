
public class HumanTest {

	public static void main(String[] args) {
		Human human =new Human();
		System.out.println("The started Health is: "+human.getHealth());
		Human.attack(human);
		System.out.println("Health after the Attack: "+human.getHealth());
	}

}
