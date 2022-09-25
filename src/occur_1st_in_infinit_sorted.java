public class occur_1st_in_infinit_sorted {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};

        int ele = 1;
        System.out.println(ans(arr, ele));
    }
    static int ans(int[]arr,int ele)
    {
        int start=0;
        int end=1;
        while(ele>arr[end])
        {
            int new_start=end+1;
            end=end+(end-start+1);
            start=new_start;
        }
        return binary_search(arr,start,end,ele);



    }
    static int binary_search(int []arr,int start,int end,int ele)
    {
        int res=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(ele<arr[mid])
            {
                end=mid-1;
            }

            else if(ele>arr[mid])
            {
                start=mid+1;
            }
        else
        {
            res=mid;
            end=mid-1;
        }

        }
        return res;
    }
}
