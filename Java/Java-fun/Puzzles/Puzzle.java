import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Puzzle{
    public ArrayList<Integer> arrayHandler(int[] arr){
        int sum=0;
        ArrayList<Integer> numbersGreaterThanTen = new ArrayList<Integer>();
        for(int i=0 ; i<arr.length ; i++){
            sum+=arr[i];
            if(arr[i]> 10){
                numbersGreaterThanTen.add(arr[i]);
            }
        }
        System.out.println(sum);
        return numbersGreaterThanTen;
    }
    public ArrayList<String> women(ArrayList<String> myArray){
        Collections.shuffle(myArray);
        System.out.println(myArray);
        ArrayList<String> newAl = new ArrayList<String>();
        for(String x : myArray){
            if (x.length() > 5){
                newAl.add(x);
            }
        }
        return newAl;
    }
    public void shuffling(ArrayList<Character> jadArray){
        Collections.shuffle(jadArray);
        System.out.println(jadArray);
        System.out.println(jadArray.get(0));
        System.out.println(jadArray.get(jadArray.size()-1));
        char[] aeiou={'a','e','i','o','u'};
        for(char i : aeiou){
            if(i == jadArray.get(0)){
                System.out.println("the first letter is vowel");
            }
        }
    }
    public int[] numb() {
        int[] myArray = new int[10];
        Random r = new Random();
        for(int i=0; i< 10 ; i++){
            myArray[i]= r.nextInt(100-55)+55;
        }
        return myArray;
    }
    public void numbs() {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        Random r = new Random();
        for(int i=0; i< 10 ; i++){
            myArray.add(r.nextInt(100-55)+55);
        }
        Collections.sort(myArray);
        System.out.println(myArray);
        System.out.println(myArray.get(0));
        System.out.println(myArray.get(myArray.size()-1));
    }
    public String createRandoms(){
        ArrayList<Character> alphabet= new ArrayList<Character>();
        String random= new String();
        for(Character i = 'a'; i<= 'z'; i++){
            alphabet.add(i);
        }
        Random r = new Random();
        for(int i=0; i< 5 ; i++){
            random+=alphabet.get(r.nextInt(25));
        }
        System.out.println(random);
        return random;
    }
    public void generateArray(){
        ArrayList<String> generate= new ArrayList<String>();
        for(int i=0; i<=10; i++){
            generate.add(createRandoms());
        }
        System.err.println(generate);
    }
}