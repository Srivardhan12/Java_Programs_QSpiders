import java.util.Scanner;

// Factorial of a number using functions
// class Day_4{
//     static int factorial(int a){
//         int fact = 1;
//         for(int i = 1; i <= a; i++){
//             fact = fact * 1;
//         }
//         return fact;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a Number: ");
//         int a = sc.nextInt();
//         int res = factorial(a);
//         System.out.print("The factorial of this number: " + res);
//     }
// }

// class Day_4{

//     // static int getFact(int a){
//     //     int fact = 1;
//     //     for(int i = a; a > 0; i--){
//     //         fact *= a;
//     //         a -= 1;
//     //     }
//     //     return fact;
//     // }

//     // public static void main(String[] args){
//     //     Scanner sc = new Scanner(System.in);
//     //     System.out.print("Enter a Number: ");
//     //     int num = sc.nextInt();
//     //     int comp = num;
//     //     int result = 0;
//     //     while(num > 0){
//     //         int lastNum = num % 10;
//     //         result += getFact(lastNum);
//     //         num /= 10;
//     //     }
//     //     if(comp == result){
//     //         System.out.println("Number " +  comp + " Strong Password");
//     //     }else{
//     //         System.out.println("Number " +  comp + " Weak Password");
//     //     }
//     // }
// }


// class Day_4{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a Number: ");
//         int num = sc.nextInt();
//         int result = 0;
//         while(num > 0){
//             num /= 10;
//             result++;
//         }
//         System.out.println(result);
//     }
// }


// class Day_4{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number: ");
//         int num = sc.nextInt();
//         System.out.print("Enter the Power: ");
//         int pow = sc.nextInt();
//         int result = 1;
//         for(int i = 0; i < pow; i++){
//             result *= num;
//         }
//         System.out.println(result);
//     }
// }


// class Day_4{
//     static int calcPow(int num, int pow){
//         int result = 1;
//         for(int i = 0; i < pow; i++){
//             result *= num;
//         }
//         return result;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number: ");
//         int num = sc.nextInt();
//         System.out.print("Enter the Power: ");
//         int pow = sc.nextInt();
//         int result = calcPow(num, pow);
//         System.out.println("The Power is: " + result);
//     }
// }

class Day_4{
    static int calcPow(int num, int pow){
        int result = 1;
        for(int i = 1; i <= pow; i++){
            result *= num;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int comp = num;
        int agComp = num;
        int count = 0;
        int result = 0;
        while(num > 0){
            int ld = num % 10;
            num /= 10;
            count++;
        }
        while(comp > 0){
            int l = comp % 10;
            result = result + calcPow(l, count);
            comp /= 10;
        }
        if(agComp == result){
            System.out.println(agComp + " Is an Amstrong Number ");
        }else{
            System.out.println(agComp + " Is not an Amstrong Number ");
        }
    }
}