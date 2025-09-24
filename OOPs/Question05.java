package OOPs;
//A constructor in Java is a special method that is automatically called when an object is created.
//Its main job is to initialize (or set up) the object.

/*Default Constructor:-	No parameters; Java provides one if you don’t
Parameterized Constructor:-	Takes arguments to initialize fields*/

public class Question05 {

    public static class Car {
        String brand;

        // Default constructor
        public Car() {
            brand = "Toyota";
        }

        public void display() {
            System.out.println("Brand: " + brand);
        }
    }

    public static void main(String[] args) {
        Car c = new Car();  // Constructor is called here
        c.display();
    }
}