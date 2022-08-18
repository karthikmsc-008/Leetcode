class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m+n-1;i>-1;i--){
            if(m==0){
                nums1[i] = nums2[n-1];
                n -= 1;
                continue;
            }
            else if(n==0){
                break;
            }
            if(nums2[n-1] >= nums1[m-1]){
                nums1[i] = nums2[n-1];
                n -= 1;
            }
            else{
                nums1[i] = nums1[m-1];
                m -= 1;
            }
        }
    }
}
//==============================Another Solution===============================================
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            list.add(nums1[i]);
        }
       
        
         for(int i=0;i<n;i++){
            list.add(nums2[i]);
        }
      
        Collections.sort(list);
        
        for(int i=0;i<list.size();i++)
        {
            nums1[i]=list.get(i);
        }
      
      
    }
}
