package ds;

public class Staticdemo {
    static {
        displayName();
    }
    static String name ="Seema";
    public static void displayName(){
        System.out.println(name);

    }

    public static void main(String[] args) {
        System.out.println("amol");
        Staticdemo obj = new Staticdemo();
        obj.displayName();
    }
    static {
        System.out.println("poonam");
    }
}
