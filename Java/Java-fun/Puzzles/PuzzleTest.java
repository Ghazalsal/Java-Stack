import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleTest {
    public static void main(String[] args){
        Puzzle pz= new Puzzle();
        // int[] arr={3,5,1,2,7,9,8,13,25,32};
        // ArrayList<Integer> al = pz.arrayHandler(arr);
        // System.out.println(al);
        /////////////////////////////////////
        // ArrayList<String> al = new ArrayList<String>();
        // String[] array={"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        // for(String i : array){
        //     al.add(i);
        // }
        // System.out.println(pz.women(al));
        ////////////////////////////////////////
        // ArrayList<Character> alphabet= new ArrayList<Character>();
        // for(Character i = 'a'; i<= 'z'; i++){
        //     alphabet.add(i);
        // }
        // pz.shuffling(alphabet);
        ////////////////////////////
        // System.out.println(Arrays.toString(pz.numb()));
        //or:
        // for(int i: pz.numb()){
        //     System.out.print(i+ " ");
        // }
        ////////////////////////////
        // pz.numbs();
        ////////////////////////////
        // pz.createRandoms();
        ////////////////////////////
        pz.generateArray();
    }
    
}
