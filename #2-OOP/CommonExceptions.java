import java.util.Scanner;

public class CommonExceptions {
    public static void main(String[] args) {
        
        //***************ArrayIndexOutOfBounds****************//
        int[] grades = new int[] {96, 65, 56, 86};
        System.out.println(grades[4]);

        //***************NullPointException*******************//
        String[] names = new String[7];
        names[0] = "Jhon";
        names[1] = "Jim";
        names[2] = "Joe";

        for(String name: names) {
            System.out.println(name.toUpperCase());
        }

        //***************InputMissmatchException**************//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a random integer");
        scanner.nextInt();
        scanner.close();
        

    }
}
