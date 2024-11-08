class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {

        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        int[] result = new int[nums.length];
        int biggestNum = (int) Math.pow(2, maximumBit) - 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = xor ^ biggestNum;
            xor ^= nums[nums.length - i - 1];
        }

        return result;

    }
}
