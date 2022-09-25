public class last_occurrence {
    public static void main(String[] args) {
        int []arr={2,4,10,10,10,10,15,20};
        int ele=10;
        int start =0;
        int end =arr.length-1;
        int res=occurrence(arr,start,end,ele);

        System.out.println(res);



    }
    static int occurrence(int []arr,int start,int end,int ele)
    {
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>ele)
            {
                end=mid-1;
            }
            else if(arr[mid]<ele)
            {
                start=mid+1;
            }
            else{
                res=mid;
                start=mid+1;
            }

        }
        return res;
  }
}
