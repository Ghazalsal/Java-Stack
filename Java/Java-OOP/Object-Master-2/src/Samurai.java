
public class Samurai extends Human{
	int health=200;
	static int numberOf=0;
	public Samurai() {
		numberOf++;
	}
	
	public int deathBlow(Human death) {
		this.health=0;
		System.out.println("Human is dead");
		health-= 0.5 * health;
		return health;
		
	}
	public void meditate() {
		System.out.println("samurai health is:" + health);
		health +=0.5*(health);
		System.out.println(health);
	}
	public int howMany() {
		return numberOf;
	}
}
