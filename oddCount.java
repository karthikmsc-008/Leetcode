class Solution {
    public int countOdds(int low, int high) {
        int i=low,j=high;
        if(low%2==0)
            i=low+1;
        if(high%2==0)
            j=high-1;
        int count=0;
        while(i<=j)
        {
            count++;   
            i+=2;
        }
        return count;
    }
}
