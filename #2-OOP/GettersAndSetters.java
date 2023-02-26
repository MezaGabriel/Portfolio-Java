public class GettersAndSetters {

    public static class Car{
        String make;
        double price;
        int year;
        String color;
    
        public Car(String make, double price, int year, String color){
            this.make = make;
            this.price = price;
            this.year = year;
            this.color = color;
        }

        public String getMake(){
            return make;
        }
        public void setMake(String make){
            this.make = make;
        }
        public double getPrice(){
            return price;
        }
        public void setPrice(double price){
            this.price = price;
        }
        public int getYear(){
            return year;
        }
        public void setYear(int year){
            this.year = year;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
    }

    public static void main(String[] args){
        Car nissan = new Car("Nissan", 10000, 2020, "Green");
        Car dodge = new Car("Dodge", 11000, 2019, "Blue");

        nissan.setColor("Jet Black");
        dodge.setColor("Jet Black");

        nissan.setPrice(nissan.getPrice() / 2);
        dodge.setPrice(dodge.getPrice() / 2);

        System.out.println("This " + nissan.getMake() + " is worth $ " + nissan.getPrice() + ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n" );
        System.out.println("This " + dodge.getMake() + " is worth $ " + dodge.getPrice() + ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n" );
    }
    
}
