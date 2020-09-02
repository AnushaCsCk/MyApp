public class Test{

  public static void main(String args[])
 {
     starPattern(5);
     starPattern(10);
     starPattern(8);
     
 }


 public static void starPattern(int n)
 {
     for (int i=0; i<n; i++) {
         for (int j=n-i; j>1; j--){
             System.out.print(" ");
         }
         for (int j=0; j<=i; j++ ){
             System.out.print("* ");
         }
         System.out.println();
     }
 }
}
