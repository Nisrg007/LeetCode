class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int n=x;
        while(n>0){
        int lastdigit=n%10;
        rev=(rev*10)+lastdigit;
        n=n/10;
        }

if(rev==x){
    return true;
}    else {return false;}
    }
}