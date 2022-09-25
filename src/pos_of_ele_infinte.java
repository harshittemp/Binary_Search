public class pos_of_ele_infinte {
    public static void main(String[] args) {
        int []arr={3,5,7,9,10,98,100,130,140,160,170};

        int ele=10;
        System.out.println(ans(arr,ele));


    }
    static int ans(int arr[],int ele)
    {
        int start=0;
        int end=1;
        while(ele>arr[end])
        {
            int temp=end+1; //temp will be  our new start
            //double the box value
            //end=previous end + sizeof box*2
            end=end+(end-start+1 );
            start=temp;
        }
        return pos(arr,start,end,ele);
    }

    static int pos(int []arr,int start,int end,int ele){
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(ele==arr[mid])
            {
                return mid;
            }
            else if(ele<arr[mid])
            {
                end=mid-1;
            }
            else {
                start=mid-1;
            }
        }
        return -1;
    }

}
