class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       char str[];
       List<List<String>> lls=new ArrayList<List<String>>();
       HashMap<String,List<String>> hs=new HashMap<>();
       for(int i=0;i<strs.length;i++)
       {
            List<String> ls=new ArrayList<>();
            str = strs[i].toCharArray();
            Arrays.sort(str);
            String sorted=new String(str);
            if(hs.containsKey(sorted))
            {
                ls = hs.get(sorted);
                ls.add(strs[i]);
            }
            else
            {
              ls.add(strs[i]);
              hs.put(sorted,ls);
            }
       } 

       for(Map.Entry<String,List<String>> mp:hs.entrySet())
       {
            lls.add(mp.getValue());
       }
       return lls;
    }
}
