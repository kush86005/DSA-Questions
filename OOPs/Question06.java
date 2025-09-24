package OOPs;

public class Question06 {
    public static class Student {
        String name;
        int age;

        // Parameterized constructor
        public  Student(String n, int a) {
            name = n;
            age = a;
        }

        public void show() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }


        public static void main(String[] args) {
            Student s1 = new Student("Alice", 22);  // Constructor called with values
            s1.show();
        }
    }
