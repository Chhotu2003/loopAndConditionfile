public class hollowRectangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1||j==5||j==i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
          for(int j=1;j<=i;j++){
            System.out.print(" ");
          }
          for(int j=4;j>=i;j--){
            if(j==1||j==i||j==4)
            System.out.print("* ");
            else
            System.out.print("  ");
          }
          System.out.println();
        }
    
    }
}
////////////////////// output /////////////////////
 
//    * 
//   * * 
//  *   * 
// *     * 
//*       * 
// *     * 
//  *   * 
//   * * 
//    * 
