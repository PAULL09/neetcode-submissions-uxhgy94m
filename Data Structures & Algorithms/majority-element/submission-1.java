class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int can=0;
        for (int i=0; i<nums.length; i++){
            if(count==0){
                can=nums[i];
            }
            if(nums[i]== can){
                count++;
            }else{
                count--;
            }
        }
        return can;
    }
}