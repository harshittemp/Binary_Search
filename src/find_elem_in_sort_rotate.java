public class find_elem_in_sort_rotate {
    public static void main(String[] args) {
        int[] arr = {11, 12, 15, 18, 2, 5, 6, 7};

        int start = 0;
        int ele = 7;
        int n = arr.length;
        int end = n - 1;
        int index = rotate(arr, start, end, n, ele);

        System.out.println(index);


    }

    static int rotate(int[] arr, int start, int end, int n, int ele) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==ele){
                return mid;
            }
            if(arr[start]<arr[mid])
            {
                if(ele>=arr[start] && ele<=arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else {
                if(ele<=arr[end] && ele >=arr[mid])
                {
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
            }
        return -1;
        }

    }









