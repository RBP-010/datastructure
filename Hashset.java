package ds;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashset {
    public void counttotalstudent(){
        String[] footballplayers = new String[] {"a","b","c","d","e","f","g","h","i","j","k"};
        String[] hockeyplayers = new String[] {"c","e","i","j","g","l","m","n","o","p"};
        String[] hockeyfootball = new String[] {"c","e","i","g","j"};
        List<String> footballplayerslist = Arrays.asList(footballplayers);
        List<String> hockeyplayerslist = Arrays.asList(hockeyplayers);
        Set<String> setstud = new HashSet<>(); //empty set
        setstud.addAll(footballplayerslist); // all footballplayerslist elements added
        setstud.addAll(hockeyplayerslist); // all hockeyplayerlist elements added
        System.out.println(setstud.size());
    }

    public static void main(String[] args) {
        Hashset obj = new Hashset();
        obj.counttotalstudent();
    }
}
