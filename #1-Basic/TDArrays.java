public class TDArrays {
    public static void main(String[] args){
        int[][] grades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}            
        };
        
        System.out.println("\tHarry: " + grades[0][0] + " " + grades[0][1] + " " + grades[0][2] + " " + grades[0][3]);
        System.out.println("\tRon: " + grades[1][0] + " " + grades[1][1] + " " + grades[1][2] + " " + grades[1][3]);
        System.out.println("\tHermione: " + grades[2][0] + " " + grades[2][1] + " " + grades[2][2] + " " + grades[2][3]);

        for(int i = 0; i < grades.length; i++){
            switch (i) {
                case 0: System.out.println("\tHarry: ");break;
                case 1: System.out.println("\tRon: ");break;
                case 2: System.out.println("\tHermione: ");break;
            }

            for(int j = 0; j < grades[i].length; j++){
                System.out.println(grades[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
