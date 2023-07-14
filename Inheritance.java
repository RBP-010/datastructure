package ds;

public class Inheritance {

}
    class A {
        public void action(){
            System.out.println("dancing");
        }}
        class B extends A {
            public void action(){
                System.out.println("sleeping");
            }

            public static void main(String[] args) {
                B obj = new B();
                obj.action();
                A obj1 = new A();
                obj1.action();
                A obj2 = new B();
                obj2.action();

            }}


