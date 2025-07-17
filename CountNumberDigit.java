public class CountNumberDigit {
   public static void main(String[] args) {
    int n=1234578;
    int count=0;
    while (n !=0) {
        n=n/10;
        count++;
    }
    System.out.println(" Total Number of digits : "+count);
   } 
}
