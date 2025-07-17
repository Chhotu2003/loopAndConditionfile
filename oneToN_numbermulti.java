import java.util.*;
public class oneToN_numbermulti {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number value range: ");
    int n=sc.nextInt();
    System.out.println("Multiplication of values: ");
    for(int i=1;i<=n;i++){
        int res=i*2;
        System.out.println(res);
    }
   } 
}
