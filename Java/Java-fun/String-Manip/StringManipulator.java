import java.util.Random;
public class StringManipulator {
    public static String TrimAndConcat(String string1,String string2){
        return string1.trim().concat(string2.trim());
    }
    public static Integer Indexofs(String str, char c){
        if (str.indexOf(c)>0){
            return str.indexOf(c);
        }
        else{
            return null;
        }
    }
    public static Integer Indexs(String s, String g){
        if(s.indexOf(g)>0){
            return s.indexOf(g);
        }
        else{
            return null;
        }
    }
    public static String last(String a, int b, int d, String e){
        return a.substring(b,d).concat(e);
    }


    
}
