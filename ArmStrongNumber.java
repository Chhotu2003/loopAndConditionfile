import java.util.*;
public class ArmStrongNumber {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the total values: ");
    int m=sc.nextInt();
    int n=m;
    int count = 0;
    while (n != 0) {
        n=n/10;
        count++;
    }
    int arm=0;
    n=m;
    while (n != 0) {
        int l=n%10;
        arm=arm+(int)Math.pow(l, count);
        n=n/10;
    }
    if(m==arm)
    System.out.println("ArmStrong Number: "+ m);
    else
    System.out.println("NOT ArmStong Number: "+m);
   } 
}
