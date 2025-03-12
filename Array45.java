import java.util.*;

public class Array45 {
    public static void main(String[] args){

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter size2:- ");
        int m=sc.nextInt();

        int a[]=new int[n];
        int b[]=new int[m];
        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
        }
        System.out.print("Enter values:- ");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }

        Set<Integer> unionSet=new HashSet<>();

        for(int i=0;i<n;i++){
            unionSet.add(a[i]);
        }
        for(int j=0;j<m;j++){
            unionSet.add(b[j]);
        }

        Integer[] UnionArray=unionSet.toArray(new Integer[0]);

        System.out.println("Union is:- "+Arrays.toString(UnionArray));

        Set<Integer> IntersectionSet=new HashSet<>();

        int i=0;
        int j=0;

        while(i<n&&j<m){
            if(a[i]<b[j]){
                i++;
            }else if(a[i]==b[j]){
                IntersectionSet.add(a[i]);
                i++;
                j++;
            }else if(a[i]>b[j]){
                j++;
            }
        }
        Integer[] ArrayIntersection=IntersectionSet.toArray(new Integer[0]);

        System.out.print("Intersection is:- "+Arrays.toString(ArrayIntersection));
    }
}