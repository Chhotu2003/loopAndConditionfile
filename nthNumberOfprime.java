import java.util.*;
public class nthNumberOfprime {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count = 0;
    int num=1;
    while (count != n) {
        int fact = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                fact++;
            }
        }
        if(fact==2){
            System.out.println(num);
            count++;
        }
        num++;
    }
 }   
}

//////////////////// output ///////////
/// input = 7
/// ans = 2 3 5 7 11 13  17