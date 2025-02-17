// class Strings_2{
//     public static void main(String[] args){
//         String strOne = "abcb";
//         String strTwo = "bacb";

//         int[] hash = new int[128];

//         if(strOne.length() ==  strTwo.length()){
//             System.out.println("Not Anangram");
//             return;
//         }
//         for(int i = 0; i < strOne.length(); i++){
//             int posOne = strOne.charAt(i);
//             int posTwo = strTwo.charAt(i);
//             hash[posOne]++;
//             hash[posTwo]--;
//         }

//         for(int j = 0; j < hash.length; j++){
//             if(hash[j] != 0){
//                 System.out.println("Not Anangram");
//                 return;
//             }
//         }
//         System.out.println("Anagram");
//     }
// }

// class Strings_2{
//     public static void main(String[] args){
//         String str = "the quick brown fox jumps over the lazy dog";
//         str = str.toLowerCase();

//         int[] hash = new int[128];

//         for(int i = 0; i < str.length(); i++){
//             int ch = str.charAt(i);
//             hash[ch]++;
//         }

//         int count = 0;
//         for(int j = 97; j < 123; j++){
//             if(hash[j] == 0){
//                 System.out.println("Not Panagram");
//                 return;
//             }
//         }
//         System.out.println("Panagram");
//     }
// }

class Strings_2{
    public static void main(String[] args){
        String s = "add";
        String t = "egg";

        int[] arr1 = new int[128];
        int[] arr2 = new int[128];

        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if(arr1[charS] == 0 && arr2[charT] == 0){
                arr1[charS] = charT;
                arr2[charT] = charS;
            }
            else if(arr1[charS] != charT || arr2[charT] != charS){
                System.out.println("Not Isomorphic");
                return;
            }
        }
        System.out.println("Isomorphic");
    }
}