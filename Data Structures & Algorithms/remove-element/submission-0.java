class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<nums.length){
        while(j<nums.length && (j<=i || nums[j]==val)) j++;
          if(nums[i]==val && j<nums.length){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
            } 
         i++;
        }
        for(int num : nums){
            if(num==val) k++;
        }
        return nums.length-k;
    }
}