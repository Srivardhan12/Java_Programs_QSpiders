import java.util.Scanner;

// STRONG NUMBER
// class Day_5{
//     static int calcFact(int num){
//         if(num == 0){
//             return 1;
//         }
//         else if(num == 1){
//             return 1;
//         }
//         return num * calcFact(num - 1);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a Number: ");
//         int num = sc.nextInt();
//         int comp = num;
//         int result = 0;
//         while(num > 0){
//             int ld = num % 10;
//             result = result + calcFact(ld);
//             num /=10;
//         }
//         if(comp == result){
//             System.out.println(comp + " is a Strong Number");
//         }
//         else{
//             System.out.println(comp + " is not a Strong Number");
//         }
//     }
// }

// BALANCED NUMBER
// class Day_5{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a Number: ");
//         int num = sc.nextInt();
//         int compNum = num;
//         int agCompNum = num;
//         int count = 0;
//         int result = 0;
//         int lastNum = 0;
//         int restOfAllSum = 0;
//         boolean makeTheLoopRun = true;
//         while(num > 0){
//             int ld = num % 10;
//             num /= 10;
//             count++;
//         }
//         while(compNum >0){
//             int l = compNum % 10;
//             lastNum = l;
//             compNum /= 10;
//             break;
//         }
//         if(count == 2){
//             restOfAllSum = lastNum;
//             result = compNum;
//             makeTheLoopRun = false;
//         }
//         while(makeTheLoopRun){
//             for(int i = 0; i < count - 2; i++){
//                 int lld = compNum % 10;
//                 restOfAllSum += lld;
//                 compNum /= 10;
//             }
//         result = lastNum + compNum;
//         break;
//         }
//         if(result == restOfAllSum){
//             System.out.println("It is an Blanced Number ");
//         }
//         else{
//             System.out.println("It is not an Blanced Number ");
//         }
//     }
// }