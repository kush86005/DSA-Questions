package PriorityQueue;
import java.util.*;
public class Question03 {
    static class student implements Comparable<student>{
        String name;
        int marks;

        student(String name,int marks){
            this.name=name;
            this.marks=marks;
        }
        @Override
        public int compareTo(student that){
            if(that.marks==this.marks){
                return this.name.compareTo(that.name); //If students marks match, return them by comparing name
            }
            return Integer.compare(that.marks,this.marks);
        }
        @Override
        public String toString(){
            return name+" ("+marks+")";
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter number of students:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        PriorityQueue<student> pq=new PriorityQueue<>();

        for(int i=0;i<n;i++){
            System.out.print("Enter name:- ");
            String name=sc.nextLine();

            System.out.print("Enter marks:- ");
            int mark=sc.nextInt();
            sc.nextLine();

            pq.offer(new student(name,mark));
        }
        student topstudent=pq.peek();

        System.out.print("Student with highest marks is:- "+topstudent);
    }
}
