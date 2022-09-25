public class bsearch {
    public static void main(String[] args) {
        int[] arr = {12, 15, 18, 21, 23};
        int ele = 1;
        int end = arr.length - 1;
        int start = 0;
        boolean res = binarysearch(arr, start, end, ele);
        if(res==true) {
            System.out.println("YOUR ELEMENT IS FOUNDED");

        }
        else{
            System.out.println("not founded");
        }
    }

    static boolean binarysearch(int[] arr, int start, int end, int ele) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (ele < arr[mid]) {
                end=mid-1;
            } else if (ele > arr[mid]) {
                start = mid + 1;
            } else {
                return true;

            }

        }
        return false;
    }
}