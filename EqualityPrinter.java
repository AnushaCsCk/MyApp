public class EqualityPrinter{

  public static void main(String[] args) {
         printEqual( 0, 1, 2);
         printEqual( 1, 2, 1);
         printEqual( 1, 1, 2);
         printEqual( -1, 2 , -3);

     }

     public static void printEqual(int a, int b, int c) {
         if (a >= 0 && b >= 0 && c >= 0) {
             if (a == b && b == c && c == a) {
                 System.out.println("All numbers are equal");
             }
             if (a != b && b != c && c != a) {
                 System.out.println("All numbers are different");
             }
             if (a == b && a != c) {
                 System.out.println("Neither all are equal or differnt");
             }
             if (a != c && b == c) {
                 System.out.println("Neither all are equal or different");
             }
             if (a == c && b!=c){
                 System.out.println("Neither all are equal or different");
             }
         } else
             System.out.println("Invalid Value");
     }

}
