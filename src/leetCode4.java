
class solution {
    public int removeDuplicates(int[] nums) {

        int index = 1;
        for(int i =0;i<=nums.length-1;i++){
            if(nums[i]<nums[i+1]){

                index = nums[i];
                index++;
            }
        }
        return index;
        
    }
}

public class leetCode4{
    public static void main(String[] args){

        solution obj = new solution();
        int[] list = {1,1,2};
        obj.removeDuplicates(list);

    }
}