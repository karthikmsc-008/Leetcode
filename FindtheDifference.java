class Solution {
    public char findTheDifference(String s, String t) {
        char str='\0';
    for(char c:s.toCharArray()) str^=c;
        System.out.println(str);
        for(char c:t.toCharArray()) str^=c;
             System.out.println(str);
        return str;
    }
}
