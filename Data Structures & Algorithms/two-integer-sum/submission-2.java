class Solution {
    public int[] twoSum(int[] nums, int target) {
        //could also do a 2 pass approach. add each value from array in HashMap-1 pass
        //then go thru the array-2nd pass and return when you find difference i.e. [target - val in array] in HashMap
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
