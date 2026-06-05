class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded=new StringBuilder();
        for(int i=0;i<strs.size();i++)
        {
            encoded.append(strs.get(i));
            encoded.append("vall");
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> ls=new ArrayList<>();
        StringBuilder st=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='v' && 
               str.charAt(i+1)=='a' &&
               str.charAt(i+2)=='l' &&
               str.charAt(i+3)=='l')
               {
                  ls.add(st.toString());
                  st.setLength(0); 
                  i+=3;
               }
            else
            st.append(str.charAt(i));
        }
        return ls;
    }
}
