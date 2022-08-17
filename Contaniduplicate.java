class Solution {
    public boolean containsDuplicate(int[] nums) {
         boolean answer=false;
        Arrays.sort(nums); //Sort the array because of finding duplicate elements
        for(int i=0;i<nums.length-1;i++)
        {
           
                if(nums[i]==nums[i+1]) // condition both values or same ot not
                    answer=true;
        
        }
        return answer;
    }
}
//Another solution
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }
}
