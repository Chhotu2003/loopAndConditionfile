public class PerfectSqrt {
    public static void main(String[] args) {
       int a=25;
       sqrtPerfect(a); 
    }
    public static void sqrtPerfect(int num){
        int sqrt=(int)Math.sqrt(num);
        if((sqrt*sqrt)==num){
            System.out.println("Perfect Square in Number: "+num);
        }
        else{
            System.out.println("Not Perfect Square in Number: "+num);
        }
    }
}

////////////// output /////////////
/// ans- Perfect Square in Number: 25;