package ds;

public class ArrayException {
    public void showException() {
        int[] arrint = new int[]{1, 4, 8};
        try {
//            System.out.println(arrint[4]);
//            int num = 1 / 0; //arithmetic exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }
        arrint[1] = 5;
        arrint[0] = 2;
        System.out.println(arrint[1]);
    }
//    public void Checkedexception(){
//        System.out.println(null);
//    }
    public void Uncheckedexception(){
        try {
            int num =1/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("it will print definitely");
        }
        System.out.println(1/0);
    }
    public void classCastException(){
        String str = "Keder";
//        int num = (Integer) str;
    }


    public static void main(String[] args) {
        ArrayException obj = new ArrayException();
//        obj.showException();
//        obj.Checkedexception();
        obj.classCastException();
        obj.Uncheckedexception();

    }
}