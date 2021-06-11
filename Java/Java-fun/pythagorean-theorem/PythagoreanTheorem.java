public class PythagoreanTheorem {
    public static double calculateHypotenuse(int legA, int legB) {
    	
	double legC = Math.pow(legA,2) + Math.pow(legB,2);
	double square = Math.sqrt(legC);
	return square;
    }
    public static void main(String[] args){
	System.out.println(calculateHypotenuse(2,2));
}
}
