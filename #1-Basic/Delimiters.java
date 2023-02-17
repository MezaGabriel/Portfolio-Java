import java.util.Scanner;

public class Delimiters {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = scan.nextInt();
        System.out.println("Your number is: " + num);

        scan.nextLine();
        System.out.println("Please write a sentence");
        String sentence = scan.nextLine();
        System.out.println("Your sentence is: " + sentence);

        scan.close();
        
    }

}
