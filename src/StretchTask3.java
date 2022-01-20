import java.util.ArrayList;
import java.util.Arrays;

public class StretchTask3 {
    String[] persons;
    double groups;
    String[][] newGroup;
    String[]tmp;

    // MaxnumberofMembers måste ändras!

    public StretchTask3(String[] persons, int groups) {
        this.persons = persons;
        this.groups = (double) groups;
        int minNumberOfMembers = (int)Math.floor(persons.length/this.groups);
        int maxNumberOfMembers = (int)Math.ceil(persons.length/this.groups);
        System.out.println("minNumberOfMembers: "+minNumberOfMembers);
        System.out.println("maxNumberOfMembers: "+maxNumberOfMembers);
        int rest = persons.length%groups;
        System.out.println("rest: "+rest);
        System.out.println("groups "+groups);
        newGroup = new String[groups][maxNumberOfMembers];

        for(int i=0;i<persons.length;i++){
            int random = (int)(Math.random()*(persons.length-1));
            String tmp = persons[random];
            persons[random] = persons[i];
            persons[i] = tmp;
        }
        int j = 0;
        int k = 0;
        System.out.println(Arrays.toString(persons));
        String[] test = new String[maxNumberOfMembers];
        for (int i=0;i<persons.length;i++){
            test[k] = persons[i];
            k++;
                if(k>=maxNumberOfMembers){
                    newGroup[j] = test;
                    j++;
                    test = new String[maxNumberOfMembers];
                    k = 0;
                }
        }

            System.out.println(Arrays.deepToString(newGroup));
        }
    }

