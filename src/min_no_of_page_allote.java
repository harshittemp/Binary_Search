

public class min_no_of_page_allote {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};

        int key = 2;


        int res=bsearch(arr,key);
        System.out.println(res);
    }
    static boolean isvalid(int [] arr,int key,int n,int max)
    {
        int student=1;
        int sum=0;
        for(int i=0;i<n;i++) {
            sum = sum + arr[i];

            if (sum > max) {
                student++;
                sum = arr[i];
            }
            if (student > key)
                return false;
        }


        return true;
    }
   static int bsearch(int []arr,int key)
   {
       int res=-1;
       int n=arr.length;
       int sum=0;
       if(n<key)
       {
           return -1;
       }

       for(int i=0;i<n;i++)
       {
           sum=sum+arr[i];
       }
       int end=0;
       end=end+sum;
       int max=0;
       for(int i=0;i<n;i++)
       {
           max=arr[0] ;
           if(max<arr[i])
           {
               max=arr[i];
           }

       }
       int start=max;
      while (start<=end)
      {
          int mid=start+(end-start)/2;
          if(isvalid(arr,key,n,max)==true)
          {
              res=mid;
              end=mid-1;
         }
          else{
             start=mid+1;
          }
      }
 return res;
      }

}
