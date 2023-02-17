public class LogicalOperators {
    
    public static void main(String[] args){

        int chemistryGrade = 67;
        int englishGrade = 65;
        String language = "Java";

        if(chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")){
            System.out.println("Congratulations, you got the scolarship!");    
        } else {
            System.out.println("We're sorry, you didn't get the scolarship.");
        }

        int credits = 56;
        double GPA = 3.2;

        if(credits >= 40 && GPA >= 2.0) {
            System.out.println("You earned your diploma!");
        } else {
            System.out.println("Sorry, you need at least 40 credits and a minimum GPA of 2.0");
        }

    }

}
