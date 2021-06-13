
public class Ninja extends Human{
	int stealth=10;
	public int steal(Human steals) {
		steals.health-= this.stealth;
		return this.health += this.stealth;
	}
	public void runAway() {
		int x = health;
		x -= 10;
		System.out.println("health is:" + x);
	}
}
