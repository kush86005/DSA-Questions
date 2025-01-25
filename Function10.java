import java.util.*;

public class Function10 {
    public static double CircumferenceCircle(double r){
        double result=0;

        result=2*3.14*r;

        return result;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle:- ");
        int r=sc.nextInt();

        System.out.print("The circumference is:- "+CircumferenceCircle(r));
    }
}
