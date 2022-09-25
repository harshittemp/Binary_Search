public class ceil_no {
    public static void main(String[] args) {
        int[] arr = {1,5,8,9,15,21};

        int start = 0;
        int ele =11;
        int n = arr.length;
        int end = n - 1;
        int index = ceil_no1(arr, start, end,  ele);

        System.out.println(index);



    }
    static int ceil_no1(int []arr,int start,int end,int ele)
    {

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==ele){
                return arr[mid];
            }
            else if (arr[mid]<ele)// we don't have to store value as the mid one will be the floor
            {
                start=mid+1;
            }

            else
            {

                end=mid-1;
            }





        }
        return arr[start]; //reason is to return start is that as the condition is violated of while loop and end will cross the
                       //as we have to return th ceil of no which means greater or equal to target so if target exist return target
                       // if the target don't exist return next great value so as the the condition violate end  target start
                       // so return start
    }
}
