class Solution {
    public boolean isValid(String s) {
       
            HashMap <Character,Character> hm=new HashMap<>();
            hm.put(')','(');
            hm.put('}','{');
            hm.put(']','[');
        
        Stack <Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hm.containsValue(c)){   //take value from hashmap 
                st.push(c);
            }else 
            {if(st.isEmpty()||hm.get(c)!=st.pop()){ //take key(get) from hashmap
                return false;    
            }}
        }

        
         return st.isEmpty();
    }
}