import java.util.Scanner;

public class orderagnostic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++) {
            System.out.println("ENTER THE element");
             arr[i]=sc.nextInt();
        }
        int ele = 15;
        int start = 0;
        int end = arr.length - 1;

            if (arr[start] < arr[end]) {
                int res = binarysearchass(arr, start, end, ele);
                if (res == -1) {
                    System.out.println("your array not is founded ");
                } else {
                    System.out.println("your array is founded");
                }
            }
            if(arr[start]>arr[end])

            {
                int res = binarysearchdec(arr, start, end, ele);
                if (res == -1) {
                    System.out.println("your array not is founded ");
                } else {
                    System.out.println("your array is founded");
                }
            }


        }

        static int binarysearchass ( int[] arr, int start, int end, int ele){
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (ele < arr[mid]) {
                    end = mid - 1;
                } else if (ele > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;

                }

            }
            return -1;
        }
        static int binarysearchdec ( int[] arr, int ele, int start, int end)
        {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (ele > arr[mid]) {
                    end = mid - 1;
                } else if (ele < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;

        }


    }
