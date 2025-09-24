package OOPs;
import java.util.*;
public class Question01 {
    //creating a student data type in which we can store multiple values of multiple data type
    public static class student{
        String name;
        int roll;
        double percent;
    }

    public static void main(String[] args) {
        student x=new student();     //here we have declared the object of student class
        x.name="Raghav";         //Intialization of values inside x object which belongs to student class
        x.roll=37;
        x.percent=90.6;

        //Object creation:- 'class name', 'object name'=new 'class name()';

        student s=new student();
        s.name="vikas";
        s.roll=29;
        s.percent=87.3;

        //Both 's' and 'x' are the objects of same class "student"

        System.out.println(x.name+" "+s.name);
        System.out.println(x.roll+" "+s.roll);
        System.out.println(x.percent+" "+s.percent);

        //Objects are real life entities
        //classes are blueprint which defines the way to categorize objects(classes can also be called "user defined datatype")
        //"Scanner sc=new Scanner(System.in)" is also a example of class and object where Scanner is a built in class in java

        /*it is valid to create a class inside main function but then we cant use/modify that class outside main function.
        for example if created a function(which is outside main function) we cant use our class variables inside that function.*/

        /*We can create a class in different file and use it but it should be in same package.
        for eg if i created a class in "Question02", i can use that class in "Question01"*/

        /*if i declared a object belonging to a class and have not intiallized anything in it, it will store null and will give
        null if printed*/
    }
}
