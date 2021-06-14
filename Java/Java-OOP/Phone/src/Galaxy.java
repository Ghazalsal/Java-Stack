public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String x = this.getRingTone();
		return x;
        // your code here
    }
    @Override
    public String unlock() {
    	System.out.println("Unlock Galaxy");
		return null;
        // your code here
    }
    @Override
    public void displayInfo() {
    	System.out.println(this.getVersionNumber() + " "+ this.getRingTone());           
    }
}
