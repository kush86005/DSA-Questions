package OOPs;
/*In Object-Oriented Programming (OOP) in Java, getters and setters are special methods used
to access and update private variables of a class.*/

//Getter → A method that returns the value of a private variable.

//Setter → A method that sets/updates the value of a private variable.
public class Question03 {
    // Person.java
    public static class Person {
        // Private variables
        private String name;
        private int age;

        // Setter for name
        public void setName(String newName) {
            name = newName;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for age
        public void setAge(int newAge) {
            // Optional: you can add validation here
            if (newAge >= 0) {
                age = newAge;
            }
        }

        // Getter for age
        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        // Create an object of Person
        Person person1 = new Person();

        // Set values using setters
        person1.setName("Alice");
        person1.setAge(25);

        // Get values using getters
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
    }
}
