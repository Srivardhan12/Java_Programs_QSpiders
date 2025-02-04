class Array{
    public static void main(String[] args){
        int[] arr = {2, 5, 7, 6, 3};
        int first = 0;
        int last = arr.length - 1;
        int temp = 0;
        System.out.println(arr);
        while(first != last){
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }
        System.out.println(arr);
    }
}