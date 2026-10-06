class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    boolean even(int nums){
        int numberofdigit=digit(nums);
        if(numberofdigit % 2==0){
            return true;
        }
        return false;
    }
    int digit(int nums){
        int count=0;
        while(nums>0){
            count++;
            nums=nums/10;
        }
        return count;
    }
}