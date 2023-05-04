

class Sum{

    int totalSum =0;
    int NumsSum =0;
    public int differenceOfSum(int[] nums) {

        int Digitsum =0;
       
        for(int i=0;i<nums.length;i++){

              NumsSum += nums[i];
            
            while(nums[i]>0){

                Digitsum += nums[i]%10;
                nums[i]/=10;
                
            }

            totalSum+=Digitsum;
        }

        int diff = NumsSum - Digitsum ;

        return diff;

        
    }

}


class leetCode5{
    public static void main(String[] args) {

        Sum obSolution = new Sum();
       int[] List = {1,15,6,3};
      int result =  obSolution.differenceOfSum(List);
      System.out.print(result);
        
    }
}