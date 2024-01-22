package medium;

public class HouseRobber {

    public static void main(String[] args) {
        System.out.println(rob( new int []{1,2,3,1}));
        System.out.println(rob( new int []{2,7,9,3,1}));
        System.out.println(rob( new int []{0,1}));
        System.out.println(rob( new int []{2,1,1,2}));
    }

    public static int rob(int[] nums) {
/*        int rob1=0; // Neetcode solution
        int rob2=0;

        for(int n:nums){
            int temp = Integer.max(n  + rob1,rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;*/

        if (nums.length < 2 ) return nums[0];
        int [] output = new int[nums.length];
        output[0]=nums[0];
        output[1]=Integer.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++)
            output[i]=Integer.max(nums[i]+output[i-2],output[i-1] );
        return output[nums.length-1];
    }
}
