// class Strings{
//     public static void main(String[] args){
//         String str = "TEDDY";
//         String newStr = "";
//         for(int i = 0; i < str.length(); i++){
//             char ch = str.charAt(i);
//             char lower = (char)(ch + 32);
//             newStr += lower;
//         }
//         System.out.println(newStr);
//     }
// }

// class Strings{
//     public static void main(String[] args){
//         String str = "teddy";
//         String newStr = "";
//         for(int i = 0; i < str.length(); i++){
//             char ch = str.charAt(i);
//             char lower = (char)(ch - 32);
//             newStr += lower;
//         }
//         System.out.println(newStr);
//     }
// }

// class Strings{
//     public static void main(String[] args){
//         String str = "xyabbaxzcd";
//         int[] hash = new int[128];
//         for(int i = 0; i < str.length(); i++){
//             char ch = str.charAt(i);
//             int pos = ch;
//             hash[pos]++;
//         }
//         for(int j = 0; j < hash.length; j++){
//             if(hash[j] > 0){
//                 System.out.println((char)j + "->" + hash[j]);
//             }
//         }
//     }
// }

class Strings{
    public static void main(String[] args){
        String str = "abacDd";
        int[] hash = new int[128];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int pos = ch;
            hash[pos]++;
        }
        for(int j = 0; j < hash.length; j++){
            if(hash[j] == 1){
                System.out.println((char)j);
            }
        }
    }
}

// class Strings{
//     public static void main(String[] args){
//         String str = "abacDd";
//         int[] hash = new int[128];
//         for(int i = 0; i < str.length(); i++){
//             char ch = str.charAt(i);
//             int pos = ch;
//             hash[pos]++;
//         }
//         if(hash[j] > 1){
//             str.replace((char)j, '');
//             System.out.print(str);
//         }
//     }
// }
