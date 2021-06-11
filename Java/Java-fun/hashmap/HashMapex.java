import java.util.HashMap;
import java.util.Set;
public class HashMapex{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("first","lyrics1");
        trackList.put("second","lyrics2");
        trackList.put("third","lyrics3");
        trackList.put("last","lyrics4");
        String lyric = trackList.get("first");
        System.out.println("the lyric is: " + lyric);

        Set<String> keys= trackList.keySet();
        for(String key: keys){
            System.out.println(key + ":" + trackList.get(key));
        }   
    }
}