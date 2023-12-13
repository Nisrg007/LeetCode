class Solution {
     public static int romanToInt(String s) {
        HashMap <Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5 );
        hm.put('X',10 );
        hm.put('L',50 );
        hm.put('C',100 );
        hm.put('D',500 );
        hm.put('M',1000 );

        int result=0;
        for (int i = 0; i < s.length(); i++) {
            
            int first=hm.get(s.charAt(i)); //ith element
            int second; //when ith element is last need to check i+1 is nor morethan index s.length 

            if (i+1 <s.length()) {
                second=hm.get(s.charAt(i+1));
                if (first<second) {
                    result+=second-first;  //when second number is larger than first
                    i++;
                }
                else{
                    result+=first;
                }

            }else{ //for last element of i
                result+=first;
            }
        }
        return result;

    }
}