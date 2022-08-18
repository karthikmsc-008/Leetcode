class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        boolean result=false;
        s= s.replaceAll("[^a-zA-Z0-9]", " "); 
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            str+=arr[i];
        }
       str=str.toLowerCase();
        String temp="";
        for(int i=str.length()-1;i>=0;i--)
        {
            temp+=str.charAt(i);
        }
        
        if(temp.equals(str))
        {
            result=true;
           
        }
        else{
            result=false;
        }
        return result;
        
    }
}
