class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int [2];
        int i = 0;
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int num : nums){
            if(!hmap.containsKey(num)) hmap.put(num,i);
            else hmap.put(num,i);
            i++;
        }
        i = 0;
        for(int num : nums){
            if(hmap.containsKey(target - num) && hmap.get(target - num) != i){
                ans[0] = i;
                ans[1] = hmap.get(target - num);
                break;
            }
            i++;
        }    
        return ans;
    }
}