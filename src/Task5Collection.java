import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class Task5Collection {
    Set<Character> set = new HashSet<>();

    public Task5Collection(String uniqueString){

        for(int i =0; i< uniqueString.length();i++){
            set.add(uniqueString.toLowerCase().charAt(i));
        }

        for(char c : set){
            System.out.print(c+",");
        }
        System.out.println("Number of chars in string: "+uniqueString.length() + " and "+set.size()+"is unique");
    }
}
