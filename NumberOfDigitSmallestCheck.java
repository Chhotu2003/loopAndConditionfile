public class NumberOfDigitSmallestCheck {
    public static void main(String[] args) {
        int small = 9845627;
        int res=SmallestDigit(small);
        System.out.println("Total Number of Digit check Smallest Number: "+small+" is : "+res);
        
    }
    public static int SmallestDigit(int n) {
        int s =Integer.MAX_VALUE;
        while (n>0) {
            int l=n%10;
            if(l<s){
            s=l;
            }
            n=n/10;
        }
        return s;
    }
}

//////////// output //////////////////
/// ans -- 2
