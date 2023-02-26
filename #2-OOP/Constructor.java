public class Constructor {
    
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
    }
    
    public static void main(String[] args){
        Car nissan = new Car("Nissan", 10000, 2020, "Green");
        Car dodge = new Car("Dodge", 11000, 2019, "Blue");

        System.out.println("This " + nissan.make + " is worth $ " + nissan.price + ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n" );
        System.out.println("This " + dodge.make + " is worth $ " + dodge.price + ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n" );
    }
}
