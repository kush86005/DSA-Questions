import java.util.*;
public class Array49 {
    public static void main(String[] args) {

        System.out.print("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int num[]=new int[n];

        System.out.print("Enter values:- ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        ArrayList<Integer> Previous=new ArrayList<>();
        ArrayList<Integer> Next=new ArrayList<>();

        for(int i=0;i<n;i++) {
            int pre = i - 1;
            int next = i + 1;
            if (i == 0) {
                pre = -1;
                Previous.add(pre);
            } else {
                while (pre >= 0 && num[pre] >= num[i]) {
                    pre--;
                }
                Previous.add(pre);
            }

            if (i == n - 1) {
                next = -1;
                Next.add(next);
            } else {
                while (next < n && num[next] >= num[i]) {
                    next++;
                }
                Next.add(next);
            }
        }

        int area=0;
        int ans=0;

        for(int i=0;i<n;i++){
            ans= (Next.get(i)- Previous.get(i)-1)*num[i];
            area=Math.max(area,ans);
        }
        System.out.print(area);
    }
}
