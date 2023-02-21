public class Scope {

    static int apples = 5;

    public static void main(String[] args){
        System.out.println(apples);
        someFunction();
    }

    public static void someFunction() {
        System.out.println(apples);
    }
    
}
