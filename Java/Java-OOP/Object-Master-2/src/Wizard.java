
public class Wizard extends Human {
	int health=50;
	int intelligence=8;
	public int heals(Human heal) {
		heal.health+= this.intelligence;
		
		return heal.health;
	}
	public int fireball (Human damage) {
		damage.health -= 3* this.intelligence;
		return damage.health;
		
		
	}
}
