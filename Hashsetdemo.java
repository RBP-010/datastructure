package ds;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashsetdemo {
    public void basichashsetops(){
        Set<String> setstr = new HashSet<>();
        setstr.add("Seema");
        System.out.println(setstr.add("aman"));
        setstr.add("kedar");
        System.out.println(setstr);
        System.out.println(setstr.add("aman"));
        System.out.println(setstr);
    }
    public void checkstring(){
        String str1 = new String("kedar");
        String str2 = new String("Seema");
        System.out.println(str1.equals(str2));
        String str3 = new String("Kedar");
        System.out.println(str1.equals(str3));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
    }
    public void createlist(){
        Set<String> setstr = new HashSet<>();
        setstr.add("Alok");
        String[] strarr = new String[] {"Kedar","Seema","Alok"};
        List<String> lstarr = Arrays.asList(strarr); // to convert an array into list
        setstr.add("Soumya");
        setstr.addAll(lstarr); //add the element of the list to the set
        String[] arrstr = new String[] {"Dinesh","Soumya","Aman","Alok"};
        List<String> lststud = Arrays.asList(arrstr);
        setstr.addAll(lststud); //union operation related to set
        System.out.println(setstr);
        setstr.removeAll(lststud); //remove the elements present in second list from the first list,substraction operation
        System.out.println(setstr);
    }

    public static void main(String[] args) {
        Hashsetdemo obj = new Hashsetdemo();
        obj.checkstring();
        obj.basichashsetops();
        obj.createlist();
    }
}
