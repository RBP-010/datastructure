package ds;

import java.util.*;

public class Hashmap {
    public void basicoperation(){
        Map<String,String> mapstud = new LinkedHashMap<>();
        Map<String,String> Mapstud = new TreeMap<>();
        mapstud.put("Aman","Ranchi");
        mapstud.put("yuvraj","Punjab");
        mapstud.put("Seema","Navi mumbai");
        Mapstud.put("Aman","Ranchi");
        Mapstud.put("Yuvraj","Punjab");
        Mapstud.put("Seema","Navi mumbai");
        System.out.println(mapstud);
        System.out.println(Mapstud);
    }
    public void basicoperations(){
        Map<String,Integer> mapdata = new HashMap<>();
        mapdata.put("alpha",1);
        mapdata.put("beta",2);
        mapdata.putIfAbsent("beta",5); //inserts value only if given key is not present
        mapdata.put("gamma",3);
        System.out.println(mapdata);
        mapdata.put("beta",7);
        System.out.println(mapdata);
    }
    public void basicops(){
        Map<String,Integer> mapcoll = new HashMap<>();
        Map<String,Integer> mapsch = new TreeMap<>();
        mapsch.put("Class1",1);
        mapsch.put("Class2",2);
        mapcoll.put("Cs",3);
        mapcoll.put("Bca",4);
        System.out.println(mapcoll.hashCode());
        System.out.println(mapsch.hashCode());
        mapsch.putAll(mapcoll);
        System.out.println(mapsch);

    }
    public void basictraversal(){
        Map<String,Integer> mapcoll = new HashMap<>();
        mapcoll.put("Cs",3);
        mapcoll.put("Bca",4);
        mapcoll.put("Class1",1);
        mapcoll.put("Class2",2);
        Iterator itr = mapcoll.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    } // how to traverse/loop over the elements of a Hashmap
    public void Entryset(){
        String [] strArr = new String[] {"a","sv","sd","bca"};
        for (String str :strArr){ //for each loop
            System.out.println(str);
        }
        Map<String,Integer> mapcoll = new HashMap<>();
        mapcoll.put("Cs",3);
        mapcoll.put("Bca",4);
        mapcoll.put("Class1",1);
        mapcoll.put("Class2",2); //mapcoll.entryset -- gives us set of all the entries
        for (Map.Entry mapEntry: mapcoll.entrySet()){
            System.out.println(mapEntry);
        }
    }

    public static void main(String[] args) {
        Hashmap obj = new Hashmap();
        obj.basicoperation();
        obj.basicoperations();
        obj.basicops();
        obj.basictraversal();
        obj.Entryset();

    }
}
