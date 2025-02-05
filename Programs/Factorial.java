import java.util.Scanner;

// class Factorial{
//     static int fact(int a){
//         if (a == 0) {
//             return 1;
//         }
//         else if (a == 1) {
//             return 1;
//         }
//         return a * fact(a - 1);
//     }
//     public static void main(String[] args){
//         int a = 6;
//         int res = fact(a);
//         System.out.println(res);
//     }
// }


class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        int fact = 1;
        for(int i = a; i > 0; i--){
            fact *= a;
            a -= 1;
        }
        System.out.println("The Factotial of this number is: " + fact);
    }
}