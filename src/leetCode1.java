import java.util.Arrays;

class solution{
    public int[] twoSum(int[] nums, int target) {

        for(int i =0;i<nums.length;i++){
            
            for(int j = i+1; j<nums.length;j++){
                int sum =  nums[i] + nums[j];

                if(sum == target){

                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
      
    }
}

public class leetCode1 {

    public static void main(String[] args){

       solution obj =  new solution();
       int[] numbers = {2,7,11,15};


        int[] data =  obj.twoSum(numbers,9);
        System.out.println(Arrays.toString(data));

          

   
    
    }


}
