public class GCD {
    public static void main(String[] args) {
      int a=8;
      int b=12;
      int res = GcdTwoValue(a, b);
      System.out.println("GCD of Two values : "+a+ " and "+b+" is :"+res);  
    }
    public static int GcdTwoValue(int a,int b){
        while (a%b !=0) {
            int temp = a%b;
            a=b;
            b=temp;
        }
        return b;
    }
}

////////////////////////output ////////////////////////
/// answer = 4;
