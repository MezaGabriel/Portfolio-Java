public class Arrays {
    
    public static class Car{
        String make;
        String[] parts;
    
        public Car(String make, String[] parts){
            this.make = make;
            this.parts = parts;
        }

        public String getMake(){
            return make;
        }
        public void setMake(String make){
            this.make = make;
        }

        public String[] getParts(){
            return parts;
        }
        public void setParts(String[] parts){
            this.parts = parts;
        }

        public void drive(){
            System.out.println("This are your " + this.parts);
        }

        public String toString() {
            return "Make: " + this.make + ".\n"
                + "Parts: " + Arrays.toString(parts) + ".\n";
        }
        
    }

    public static String toString(String[] parts) {
        return null;
    }

}
