class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1, h=0;
        for(int x : nums) h=Math.max(h,x);

        while(l<h){
            int mid = l+(h-l)/2;
            long opr=0;
            for(int x : nums) opr+=(x-1)/mid;

            if(opr<=maxOperations) h=mid;
            else l=mid+1;
        }
        return l;

    }
}
