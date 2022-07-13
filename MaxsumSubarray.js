class Solution {
    public int maxSubArray(int[] nums) {
            int sum=nums[0];
        int sign=0;
        for(int i=0;i<nums.length;i++)
        {
            sign=sign+nums[i]; //sum the values if the sum is less than 0 it will go to the sign=0
            
            if(sign>sum)
            {
                
                sum=sign;
            }
            if(sign<0)
            {
                sign=0;
            }
        }
            
     return sum;   
    }
}
