public class FizzBuzz {
    public static String fizzBuzz(int number) {
        String res="";
        if (number% 3 ==0 && number%5 == 0){
            res="FizzBuzz";
        
        }
        else if (number% 3 == 0){
            res="Fizz";
            
        }
        else if(number % 5 ==0){
            res="Buzz";
            
        }
        return res;
        
    }
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
