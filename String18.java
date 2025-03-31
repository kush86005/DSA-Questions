import java.util.*;

public class String18 {
    public static void main(String[] args) {

        System.out.print("Enter number of strings:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<String> Final=new ArrayList<>();

        sc.nextLine();
        System.out.print("Enter strings:- ");
        for(int i=0;i<n;i++){
            Final.add(sc.nextLine());
        }
        int secmostfreq=0;
        int firstmostfreq=0;
        String strmost="";
        String strsecmost="";
        for(int i=0;i< Final.size();i++){
            int frequency=0;
           String str1= Final.get(i);
           for(int j=0;j<Final.size();j++){
               String str2= Final.get(j);
               if(str1.equals(str2)){
                   frequency++;
               }
           }
           if(frequency>firstmostfreq){
               secmostfreq=firstmostfreq;
               strsecmost=strmost;
               firstmostfreq=frequency;
               strmost=str1;
           }else if(frequency>secmostfreq&&frequency<firstmostfreq){
               secmostfreq=frequency;
               strsecmost=str1;
           }
        }
        System.out.print(strsecmost);
    }
}
