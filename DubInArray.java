// class DubInArray{
//     public static void main(String[] args){
//         int[] nums = {1, 1, 2, 2, 2, 3, 3, 3, 4, 5};
//         int[] hash = new int[10];

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


// class DubInArray{
//     public static void main(String[] args){
//         int[] arr = {1, 1, 2, 2, 2, 3, 3, 3};
//         int i = 0;
//         for(int j = 0; j < arr.length; j++){
//             if(arr[i] != arr[j]){
//                 i++;
//                 arr[i] = arr[j];
//             }
//         }
//         System.out.println(i + 1 + " Unique elements are there");
//     }
// }

class DubInArray{
    public static void main(String[] args){
        int[] arr = {0, 1, 1, 1, 0, 1, 1, 0};
        int max = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            max = count > max ? count : max;
        }
        System.out.println(max);
    }
}
