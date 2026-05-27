class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr={0,0};
        for(int num=0;num<nums.length;num++)
        {
            for(int numss=num+1;numss<nums.length;numss++)
            {
                if(nums[num]+nums[numss]==target)
                {
                    arr[0]=num;
                    arr[1]=numss;
                }
            }
        }
        return arr;
    }
}
