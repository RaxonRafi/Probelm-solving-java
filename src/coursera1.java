
 class mainClass{
    
    int k (int a, int b) {
        if (a < b) {
          if (b > 4) {
            return 0 ;
          }
          else {
            return 1;
          }
        }
        else {
          if (a > 4) {
            return 2;
          }
          else {
            return 3;
          }
        }
      }
      

}

public class coursera1 {

    public static void main(String[]args){
             
        mainClass obj =   new mainClass();
        int ans = obj.k(6,8);

        System.out.println(ans);
    }

    
}
