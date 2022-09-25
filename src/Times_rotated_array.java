public class Times_rotated_array {
    public static void main(String[] args) {
        int[] arr = {11,12,15,8,2,5,6,8 };

        int start = 0;
        int end = arr.length - 1;
        int res = rotate(arr, start, end);

        System.out.println(res);
    }
    static int rotate(int[]arr,int start,int end){
        int n= arr.length;
        while(start<=end)
        {
         int mid=start+(end-start)/2;
          //check that the neighbour element of the mid are greater then mid
            //first to find the (mid-1)=previous and (mid+1)=next
            int prev=(mid-1+n)/n; //+n to avoid negative value
            int next=(mid+1)/n; ///n is so that if there is last value then it goes to the starting
            if(arr[mid]<=arr[prev]&& arr[mid] <=arr[next])
            {
                return mid;
            }
            else if(arr[mid]<=arr[start])
            {
                end=mid-1;
            }
            else if(arr[mid]>=arr[end]) {
                start=mid+1;
            }
        }
        return 0;
    }
}
