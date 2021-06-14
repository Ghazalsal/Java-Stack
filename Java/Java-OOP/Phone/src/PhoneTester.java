
public class PhoneTester {

	public static void main(String[] args) {
		IPhone iphone6 = new IPhone("6", 50, "apple", "opener");
		iphone6.displayInfo();
		iphone6.ring();
		iphone6.displayInfo();
		
		Galaxy galaxy6 = new Galaxy("6galaxyss", 44, "galaxys", "default");
		galaxy6.displayInfo();
		galaxy6.ring();
		galaxy6.unlock();

	}

}
