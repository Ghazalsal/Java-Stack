import java.util.ArrayList;

public class Exceptions{
    public static void main(String[] args){
        ArrayList<Object> list = new ArrayList<Object>();
        list.add("13");
        list.add("hello world");
        list.add(48);
        list.add("Goodbye World");
        // for(int i = 0; i < list.size(); i++) {
        //     Object castedValue = (Object) list.get(i);
        // }
        // System.out.println(list);
        for(int i=0; i< list.size();i++){
            try{
                Integer value = (Integer) list.get(i);
                System.out.println(value);
            }catch(Exception e){
                System.out.println("sorry invalid");
            }
        }
    }
}