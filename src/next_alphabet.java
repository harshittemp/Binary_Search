public class next_alphabet  {
    public static void main(String[] args) {


    char[] arr = {'a','d','f','j'};


        char ele ='j' ;

    char i = smallestlater(arr,ele);

        System.out.println(i);



}

    static char smallestlater(char []arr,char ele)
    {
        int start = 0;
        int n = arr.length;
        int end = n - 1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>ele){
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }







        }
        return arr[start%arr.length];
    }

}
