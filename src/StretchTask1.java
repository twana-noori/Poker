import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class StretchTask1 {
    HashMap<Character, Integer> map = new HashMap<>();
    int amount = 1;

    public StretchTask1(String s){
        String st = s.toLowerCase();
        for(int i = 0; i<st.length(); i++){
            if(map.containsKey(st.charAt(i))) {
                amount = map.get(st.charAt(i))+1;
                map.put(st.charAt(i), amount);
                //System.out.println(st.charAt(i));
            }
            else{
                //amount = 1;
                map.put(st.charAt(i), 1);
            }
        }
        printHashMap();
    }
    private void printHashMap() {
        for (Map.Entry<Character, Integer> es : map.entrySet()) {
            System.out.print(es.getKey() + ": ");

            for(int i=0;i<es.getValue();i++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
