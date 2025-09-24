package OOPs;
/*The final keyword in Java is used to declare constants or to prevent changes to:
1.Variables
2.Methods
3.Classes

In simple words:
final means "can't be changed".*/
public class Question07 {
    public class Test {
        final int x = 10;

        public void show() {
            // x = 20;  // ❌ Error: cannot assign a value to final variable
            System.out.println("x = " + x);
        }
    }
}
