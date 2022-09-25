public class spliteArray {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int m) {
        int start =0;
        int end=0;
        for(int i=0;i<nums.length;i++)
        {
            start=Math.max(start,nums[i]);/*just like linear search in the end of the loop this
                                          start will contain max item largest number*/
            end+=nums[i]; // the maximum value we can have
        }
        while(start<end) {
            int mid = start + (end - start) / 2;
//       decide how many pieces we can divide the max sum in to
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
//                you can not add in the subarray,make new one
                    sum = num;
                    pieces++;
                } else {
                    // otherwise keep adding in this array
                    sum += num;
                }

            }
            if (pieces > m) {
                start = mid + 1;

            } else {
                end = mid;
            }
        }
        return end;

    }
}
