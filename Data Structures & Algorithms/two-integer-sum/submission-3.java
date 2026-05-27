class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int[] ret=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            hs.put(target-nums[i],i);
        }
        for(int j=0;j<nums.length;j++)
        {
            if(hs.containsKey(nums[j]) && j!=hs.get(nums[j]) )
            {
                ret[0]=j;
                ret[1]=hs.get(nums[j]);
                break;
            }
        }
        return ret;
    }
}
