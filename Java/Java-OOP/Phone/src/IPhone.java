public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String x = this.getRingTone();
    	System.out.println(x);
		return x;
		
        // your code here
    }
    @Override
    public String unlock() {
        System.out.println("Unlock iphone");
    	return null;
    }
    @Override
    public void displayInfo() {
    	System.out.println(this.getVersionNumber() + " "+ this.getRingTone());           
    }
}
