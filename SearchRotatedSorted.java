class Solution {
    public int search(int[] nums, int target) {
        int count=0;
        for(int key:nums)
        {
            count++;
            int len=nums.length;
            if(key==target)
            {
                --count;
                break;
            }
            else if(count==len && key!=target){
                count=-1;
             
            }
        }
        return count;
    }
}
