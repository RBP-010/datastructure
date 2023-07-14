package ds;

import java.util.ArrayList;

public class Arraylist {
    public void basicops() {
        ArrayList<Integer> arrListInt = new ArrayList<>();
        System.out.println(arrListInt.isEmpty()); //true
        arrListInt.add(12);
        arrListInt.add(13);
        System.out.println(arrListInt.size());
        arrListInt.add(21);
        arrListInt.remove(2);
        System.out.println(arrListInt.size());
        System.out.println(arrListInt.get(0));
        arrListInt.set(1,33);
        System.out.println(arrListInt.get(1));
        System.out.println(arrListInt.isEmpty());
    }
    public void learnconcept(){
        int num = 5;
        ArrayList<Integer> arrlistinteger = new ArrayList<>();
        arrlistinteger.add(num);
        System.out.println(arrlistinteger.get(0));
    }}

    class Array{
        public void arrayops(){
            int[] intArr= new int[]
                    {1,2,3,4,5,6,7,8,9,0,23};

           intArr[2] = 78;
        }
        public static void main(String[] args) {
//        Arraylist obj = new Arraylist();
//        obj.basicops();
//        obj.learnconcept()

            Array obj1 = new Array();
            obj1.arrayops();
        }

    }




