
class Pair
{
int a,b;
Pair(int a,int b)
{
    this.a=a;
    this.b=b;
}
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hs =new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.containsKey(nums[i]))
            {
                hs.put(nums[i],hs.get(nums[i])+1);    
            }
            else
            {
                hs.put(nums[i],1);
            }
        }
        Pair[] p=new Pair[hs.size()];
        int j=0;
        for(Map.Entry<Integer,Integer> mp:hs.entrySet())
        {
            Pair pr= new Pair(mp.getKey(),mp.getValue());
            p[j]=pr;
            j++;
        }
        Arrays.sort(p, (x, y) -> y.b - x.b);
        int ret[]=new int[k];
        for(int i=0;i<k;i++)
        {
            ret[i]=p[i].a;
        }
        return ret;
    }
}
