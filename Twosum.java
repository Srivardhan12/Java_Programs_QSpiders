// Two Sum
// class Twosum{
//     public static void main(String[] args){
//         int[] arr = {2, 5, 6, 8, 12};
//         int target = 11;
//         for(int i = 0; i < arr.length; i++){
//             for(int j = 0; j < arr.length; j++){
//                 if((arr[i] + arr[j]) == target){
//                     System.out.println(arr[i] + " " + arr[j]);
//                     return;
//                 }
//             }
//         }
//     }
// }

// Two Sum Optimal Approch - It is working because iys is sorted array
// class Twosum{
//     public static void main(String[] args){
//         int[] arr = {2, 5, 6, 8, 12};
//         int target = 17;
//         int i = 0;
//         int j = arr.length - 1;
//         int sum = 0;
//         for(int k = 0; k < arr.length; k++){
//             sum = arr[i] + arr[j];
//             if(target == sum){
//                 System.out.println(arr[i] + " " + arr[j]);
//                 return;
//             }
//             else if(sum > target){
//                 j--;
//             }
//             else if(sum < target){
//                 i++;
//             }
//         }
//     }
// }

// Moving all zeros to the end without changing relative poistion of non-zero elements.
// class Twosum{
//     public static void main(String[] args){
//         int[] arr = {0, 0, 9, 0, 2, 0, 43, 0};
//         int i = 0;
//         int temp = 0;
//         for(int j = 0; j < arr.length; j++){
//             if(arr[j] != 0){
//                 temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 i++;
//             }
//         }
//         for(int elem: arr){
//             System.out.print(elem + " ");
//         }
//     }
// }

// Count of elements
// class Twosum{
//     public static void main(String[] args){
//         int[] nums = {10, 70, 31, 10, 10, 12, 31, 70};
//         int[] hash = new int[71];

//         for(int i = 0; i < nums.length; i++){
//             hash[nums[i]]++;
//         }

//         for(int j = 0; j < hash.length; j++){
//             if(hash[j] > 0){
//                 System.out.println(j + " -> " + hash[j]);
//             }
//         }
//     }
// }
