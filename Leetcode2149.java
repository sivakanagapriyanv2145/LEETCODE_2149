class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i,j,n=nums.length;
        int pos[]=new int[n/2];
        int neg[]=new int[n/2];
        int res[]=new int[n];
        int k=0;
        j=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[j++]=nums[i];
            }
            else{
                neg[k++]=nums[i];
            }
        }
        j=0;
        k=0;
        for(i=0;i<n;i++){
            if(i%2==0){
                res[i]=pos[j++];
            }
            else{
                res[i]=neg[k++];
            }
        }
        return res;

        
    }
}
