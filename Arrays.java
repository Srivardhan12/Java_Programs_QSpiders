// import java.util.Scanner;

// class Arrays{
//     public static void main(String[] args){
//         // Scanner sc = new Scanner(System.in);
//         // int size = sc.nextInt();
//         // int[] arr = new int[size];
//         // for(int j = 0; j < size; j++){
//         //     arr[j] = sc.nextInt();
//         // }
//         int[] arr = {20, 5, 30, 80, 10};
//         int max = arr[0];
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }


// class Arrays{
//     public static void main(String[] args){
//         int[] arr = {20, 5, 30, 80, 10};
//         int max = arr[0];
//         int secondMax = Integer.MIN_VALUE;
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] > max){
//                 secondMax = max;
//                 max = arr[i];
//             }
//             else if(arr[i] > secondMax && arr[i] != max){
//                 secondMax = arr[i];
//             }
//         }
//         System.out.println(max);
//         System.out.println(secondMax);
//     }
// }

// Linear Search
// class Arrays{
//     public static void main(String[] args){
//         int[] arr = {20, 5, 30, 80, 10};
//         int target = 30;
//         for(int i = 0; i < arr.length; i++){
//             if(target == arr[i]){
//                 System.out.println("FOUND");
//                 return;
//             }
//         }
//         System.out.println("NOT FOUND");
//     }
// }

// Binary Search
// Note: Array must be sorted
// class Arrays{
//     public static void main(String[] args){
//         int[] arr = {7, 18, 29, 31, 42};
//         int low = 0;
//         int high = arr.length - 1;
//         int mid;
//         int target = 12;
//         while(low <= high){
//             mid = low + high / 2;
//             if(target == arr[mid]){
//                 System.out.println("FOUND");
//                 return;
//             }
//             else if(target < arr[mid]){
//                 high = mid - 1;
//             }
//             else if(target > arr[mid]){
//                 low = mid + 1;
//             }
//         }
//         System.out.println("NOT FOUND");
//     }
// }

// Reverse an array
class Arrays{
    public static void main(String[] args){
        int[] arr = {2, 5, 7, 6, 3};
        int first = 0;
        int last = arr.length - 1;
        int temp = 0;
        for(int i: arr){
            System.out.print(i + " ");
        }
        while(first != last){
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        System.out.println();
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}