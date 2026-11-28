class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> hm = new HashMap<>();
       int[] result = new int[2];
       for (int i=0; i<nums.length; i++){
        int difference = target-nums[i];
        if (hm.containsKey(difference)){
            result[0]=hm.get(difference);
            result[1]=i;
            break;
        }
        hm.put(nums[i], i);
     }
     return result;

        
    }
}
