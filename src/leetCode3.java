
class A {
    public int sumOfMultiples(int n) {
        int sum =0;

        for(int i =0;i<=n;i++){
;
            if( i%3 == 0 || i%5 ==0 || i%7 == 0 ){
                 sum += i;
            }
             
        }

        return sum;

        
    }
}



public class leetCode3 {

    public static void main(String[] args){
        
        A obj = new A();

        int result = obj.sumOfMultiples(10);

        System.out.print(result);

    }


    
}
