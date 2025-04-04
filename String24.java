import java.util.*;

public class String24{
    public static void main(String[] args) {

        System.out.print("Enter n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        sc.nextLine();
        System.out.print("Enter string:- ");
        String s=sc.nextLine();

        Set<Character> Computers=new HashSet<>();

        int empty=n;
        int walkedout=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(!Computers.contains(c)){
                if(empty>0){
                    Computers.add(c);
                    empty--;
                }else{
                    walkedout++;
                }
            }else{
                Computers.remove(c);
                empty++;
            }
        }
        System.out.print(walkedout);
    }
}
