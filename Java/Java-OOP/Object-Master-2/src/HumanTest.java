
public class HumanTest {

	public static void main(String[] args) {
		Human newHuman = new Human();
		Human ghazal = new Human();
		
		int x= ghazal.attack(newHuman);
		System.out.println(x);
		
		Wizard wiz = new Wizard();
		int y = wiz.heals(ghazal);
		System.out.println(y);
		
		Wizard newWiz = new Wizard();
		int z = newWiz.fireball(newWiz);
		System.out.println(z);
		
		Human lana = new Human();
		Ninja jad = new Ninja();
		int a = jad.steal(lana);
		System.out.println(a);
		
		jad.runAway();
		
		Human alaa = new Human();
		Samurai sam = new Samurai();
		int b = sam.deathBlow(alaa);
		System.out.println(b);
		
		Samurai sammy = new Samurai();
		sammy.meditate();
		
		
		System.out.println(sammy.howMany());
	}

}
