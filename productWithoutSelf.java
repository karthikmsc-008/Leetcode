class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
       int [] output=new int[n];
        output[0]=1;
        for(int i=1;i<n;i++)
        {
            output[i]=output[i-1]*nums[i-1]; // Left array  traverse and multiplication
        }
        int product=1;
        for(int j=n-1;j>=0;j--)
        {
            output[j]=output[j]*product; //From right side multiplication 
            product=product*nums[j];
        }
        return output;
    }
}
