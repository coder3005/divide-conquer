//Boyer Moore Voltw Algorithm
//without using divide and conquer
public class solution {
    public static int majorityElement(int nums[]) {
        int winner = nums[0], lead = 1;

        for (int idx = 1; idx < nums.length; idx++) {
            if (nums[idx] == winner) {
                lead++;
            } else if (lead > 0) {
                lead--;
            } else {
                winner = nums[idx];
                lead = 1;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
    }
}
