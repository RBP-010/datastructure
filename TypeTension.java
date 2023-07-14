package ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TypeTension {
    public void checkarraytypesafe(){
        String[]  strarr = new String[12];
        strarr[9] = "java";
//        String[8] = 'd';
    }
    public void entryofgenerics(){
        List<String> amanlist = new ArrayList<>();
        amanlist.add("Aman");
//        amanlist.add(32);
//        amanlist.add(false);
        amanlist.add("ranchi");
    }
    public void notypecasting(){
        List seemalist = new ArrayList();
        seemalist.add(32);
        seemalist.add("seema");
        seemalist.add(false);
        Integer num = (Integer) seemalist.get(0);
        String str = (String) seemalist.get(1);
        boolean br = (boolean) seemalist.get(2);
        List<Integer> seemalist1 = new ArrayList<>();
        seemalist1.add(45);
//        seemalist1.add("Seema"); //compile time error
        Integer num1 = (Integer) seemalist1.get(0);
    }
    public void notension(){
        List amanlist = new ArrayList<>();
        amanlist.add("Aman");
        amanlist.add(32);
        amanlist.add(true);
        Object obj1 =  (Object) true;
        Object obj2 = (Object) 32;
//        System.out.println(amanlist instanceof Integer);
        System.out.println(obj1.getClass());
        System.out.println(amanlist.get(2));
        System.out.println(amanlist instanceof ArrayList<?>);
    }
    public int getsquareofnum(int num) {
        return num * num;
    }
    public int getsquare(){
        Math.sqrt(88);
        return 88 * 88;
    }
    public int getsqu(){
        Math.sqrt(34);
        return  34 * 34;
    }
    public <E> void displayarrayelement(E[] arr){
        for (E element: arr){
            System.out.println(element);
        }
    }
    public void displayintarrayelement(int[] intarr){
        for (int i: intarr){
            System.out.println(i);
        }
    }
    public void displayStringarrayelement(String[] Stringarr){
        for (String str: Stringarr){
            System.out.println(str); // same with boolean also
        }
    }


    public static void main(String[] args) {
        TypeTension obj = new TypeTension();
        obj.checkarraytypesafe();
        obj.entryofgenerics();
        obj.notypecasting();
        obj.notension();
        obj.getsquareofnum(88);
        Integer[] arrint = new Integer[]{1,2,3,4,5};
        obj.displayarrayelement(arrint);
        String[] arrstr = new String[]{"A","b","c","d"};
        obj.displayStringarrayelement(arrstr);

    }
}
