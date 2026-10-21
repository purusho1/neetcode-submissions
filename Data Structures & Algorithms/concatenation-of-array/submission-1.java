class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]= new int[2*nums.length];
        for(int i=0;i<ans.length;){
            for(int j=0;j<nums.length;j++){
                ans[i]=nums[j];
                i++;
            }
        }
        return ans;
    }
}