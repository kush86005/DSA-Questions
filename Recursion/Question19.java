package Recursion;
import java.util.*;
//Read justification for time complexity for interview
public class Question19 {
    public static int tower(int n,int from,int to,int aux){
        return helper(n,from,to,aux);
    }
    public static int helper(int n,int from,int to,int aux){
        if(n==0){
            return 0;
        }
        int count=0;
        count+=helper(n-1,from,aux,to);
        count++;
        count+=helper(n-1,aux,to,from);
        return count;
    }
    public static void main(String[] args){
        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int moves=tower(n,1,3,2);
        //1: The source peg (where the disks start).
        //3: The destination peg (where the disks need to end up).
        //2: The auxiliary peg (used temporarily to move disks).
        System.out.print("Total number of moves:- "+moves);
    }
}
/*The time complexity is exponential, specifically O(2^n).
 We can see this in the recursive hanoi function.
 To move a stack of 'n' disks, we first recursively move 'n-1' disks to the auxiliary peg.
 Only after that entire operation is complete do we move the largest disk.
 Then, we perform another recursive call to move the 'n-1'
 disks from the auxiliary peg to the destination.
 Since each call to solve for 'n' disks results in roughly two calls for 'n-1' disks,
 this leads to a classic exponential growth pattern, resulting in a time complexity of O(2^n)
 */