public class floor_no {
    public static void main(String[] args) {
        int[] arr = {1,5,8,9,15,21};

        int start = 0;
        int ele = 14;
        int n = arr.length;
        int end = n - 1;
        int index = floor_no1(arr, start, end,  ele);

        System.out.println(index);



    }
    static int floor_no1(int []arr,int start,int end,int ele)
    {
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==ele){
                return arr[mid];
            }
            else if (arr[mid]>ele)// we don't have to store value as the mid one will be the floor
            {
                end=mid-1;
            }

            else
            {

                start=mid+1;
            }





        }
        return arr[end];
    }
}


