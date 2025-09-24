package OOPs;
//In Java, the this keyword is a reference to the current object — the object whose method or constructor is being called.
public class Question04 {

    // Static inner class so it can be used in static main method
    public static class Person {
        private String name;

        public Person(String name) {
            this.name = name;  // 'this.name' refers to the instance variable
        }

        public void printName() {
            System.out.println("Name: " + this.name);
        }
    }

    public static void main(String[] args) {
        // Create Person object and call printName
        Person p1 = new Person("Alice");
        p1.printName();  // Output: Name: Alice
    }
}

