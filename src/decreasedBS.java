import java.util.Scanner;

public class decreasedBS {
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the array");
        int []arr=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("INPUT THE NUMBER");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++) {
            System.out.println("your array" + " " + arr[i]);
        }
        System.out.println("enter the element");
        int ele=sc.nextInt();
        int start=0;
        int end=arr.length-1;
        int res=binarysearch(arr,ele,start,end);
        if(res==-1)
        {
            System.out.println("your element is not founded");
        }
        else
        {
         System.out.println("your element is founded");
        }
    }
    static int binarysearch(int []arr,int ele,int start,int end)
    {
     while(start<=end) {
         int mid = start + (end - start) / 2;
         if (ele > arr[mid]) {
             end = mid - 1;
         }
         else if (ele<arr[mid])
         {
             start=mid+1;
         }
         else {
             return mid;
         }
     }
                return -1;

    }

}
