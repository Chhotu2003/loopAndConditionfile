public class decimalToBinaryConvert {
    public static void main(String[] args) {
        int n=12;
        String bString="";
        while (n !=0) {
             int l=n%2;
             bString=l+bString;
             n=n/2;
        }
        System.out.println("Decimal convert the binary value: "+bString);
    }
}
