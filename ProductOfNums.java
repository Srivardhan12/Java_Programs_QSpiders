class ProductOfNums{
    public static void main(String[] args){
        int a = 123;
        int p = 1;
        while(a > 0){
            int f = a % 10;
            p = p * f;
            a = a / 10;
        }
        System.out.println(p);
    }
}

// class ProductOfNums{
//     public static void main(String[] args){
//         int a = 123;
//         int r = 0;
//         while(a > 0){
//             int f = a % 10;
//             r = r * 10;
//             r = r + f;
//             a = a / 10;
//         }
//         System.out.println(r);
//     }
// }