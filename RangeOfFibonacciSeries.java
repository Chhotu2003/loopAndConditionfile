public class RangeOfFibonacciSeries {
    public static void main(String[] args) {
        int max= 10;
        int f1=0;
        int f2=1;
        System.out.print("Fibonacci Series: ");
        while (f1<=max) {
            System.out.print(f1+" ");
           int temp=f1+f2;
               f1 = f2;
               f2 = temp;
        }
    }
}
