public class orderagonostic2 {
    public static void main(String[] args){
   int arr[]={-18,12,-4,0,2,15};
   int target=-4;
   int ans=order(arr,target);
        System.out.println(ans);

    }
    static int order(int []arr,int ele){
        int start=0;
        int end=arr.length-1;
        boolean isAss;
        if(arr[start]<arr[end])
        {
            isAss= true;
        }
        else {
            isAss=false;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(ele==arr[mid])
            {
                return mid;
            }
            if(isAss){
                if (ele < arr[mid]) {
                    end=mid-1;
                }
                else  {
                    start = mid + 1;
                }
            }
             else {
                if (ele > arr[mid]) {
                    end=mid-1;
                }
                else   {
                    start = mid + 1;
                }

            }

        }
        return -1;
    }


        }



