package OOPs;
/*The static keyword means “belongs to the class, not to any specific object”.

🔹 What does this mean?

1.A static variable or method is shared by all instances (objects) of that class.
2.You don’t need to create an object to use a static method or variable.
3.Static members exist even if no objects of the class are created.*/
public class Question08 {
    public static class Counter {
        static int count = 0;

        public Counter() {
            count++;  // increments shared count
        }

        public static void displayCount() {
            System.out.println("Count: " + count);
        }
    }
        public static void main(String[] args) {
            new Counter();
            new Counter();
            Counter.displayCount();  // Output: Count: 2
        }
    }
