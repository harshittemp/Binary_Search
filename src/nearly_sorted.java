public class nearly_sorted {
    public static void main(String[] args) {
        int[] arr = {5,30,20,40 };

        int start = 0;
        int ele=30;
        int end = arr.length - 1;
        int res = nearly_sort(arr, start, end,ele);

        System.out.println(res);
    }
    static int nearly_sort(int []arr,int start,int end,int ele)
    {
        while(start<=end)
        {
            int mid =start+(end-start)/2;
            if(ele==arr[mid]){
                return  mid;
            }
            if((mid-1)>=start && arr[mid]==ele)  //to avoid -1 index value
            {
                return mid-1;

            }
            if((mid+1)<=end && arr[mid]==ele)
            {
                return mid+1;
            }
            else if (ele<arr[mid]) {
              end=mid-2;
            }
            else {
                start=mid+2;
            }

        }
        return -1;
    }
}
