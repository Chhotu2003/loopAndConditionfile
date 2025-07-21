public class BinaryToDecimal {
    public static void main(String[] args) {
        int bin=1010;
        int dec=0;
        int power=0;
        while (bin > 0) {
            int rem=bin%10;
            dec +=rem*Math.pow(2,power);
            bin=bin/10;
            power++;
        }
        System.out.println("Decimal Number: "+dec);
    }
}

////////// output //////////////
/// input - 1010
/// output - 10
