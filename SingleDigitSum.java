public class SingleDigitSum {
    public static void main(String[] args) {
     int num=9875;
     int res = singleDigitSum(num);
     int sum1=0;
     while (res>=10) 
      res=singleDigitSum(res);
      System.out.println("Single digit sum of value: "+num+" is: "+ res);
    
}
    public static int singleDigitSum(int n){
      int sum = 0;
      while (n>0) {
        int l=n%10;
        sum=sum+l;
        n=n/10;
      }
      return sum;
    }
    }

    /////////////////// output ///////////////////////
    /// input num = 9875 
    ///output ans = 2