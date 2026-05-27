class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int[] ret=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(hs.containsKey(nums[i]) && i!=hs.get(nums[i]) )
            {
                ret[0]=hs.get(nums[i]);
                ret[1]=i;
                return ret;
            }
            hs.put(target-nums[i],i);
        }
        return ret;
    }
}
