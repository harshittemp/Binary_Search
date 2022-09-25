
class Solution {
    static int check(int[] nums) {
        int start=0;
        int n= nums.length;
        int end=nums.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            int prev=(mid-n+1)/n;
            int next=(mid+1)/n;
            if(nums[mid]<=nums[prev] && nums[mid]<=nums[next] )
            {
                return mid;
            }
            else if(nums[start]<=nums[mid])
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int [] nums={2,1,3,4};
        int res=check(nums);
        if(res==-1)
        {
            System.out.println("no");
        }
        else {
            System.out.println("yes");
        }
    }
}
