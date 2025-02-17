import java.util.Scanner;

// class Valentine_Day{
//     public static void main(String[] args){
//         String strOne = "Valentine";
//         String strTwo = "Day";

//         System.out.println("Str One: " + strOne);
//         System.out.println("Str Two: " + strTwo);

//         strOne = strOne + strTwo;
//         strTwo = strOne.substring(0, strOne.length() - strTwo.length());
//         strOne = strOne.substring(strTwo.length());

//         System.out.println("Str One: " + strOne);
//         System.out.println("Str Two: " + strTwo);
//     }
// }

class Valentine_Day{
    public static int getValue(char ch){
        int res = 0;
        switch(ch){
                case 'I':
                    res += 1; 
                    break;
                case 'V':
                    res += 5;
                    break;
                case 'X':
                    res += 10;
                    break;
                case 'L':
                    res += 50;
                    break;
                case 'C':
                    res += 100;
                    break;
                case 'D':
                    res += 500;
                    break;
                case 'M':
                    res += 1000;
                    break;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        String str = sc.nextLine();
        int result = 0;
        int firstVal = 0;
        for(int i = 0; i < str.length(); i++){
            try{
                char ch = str.charAt(i);
                firstVal = getValue(ch);
                if(str.charAt(i + 1) == '\0') break;
                char sec = str.charAt(i + 1);
                int secVal = getValue(sec);
                if(firstVal < secVal){
                    firstVal -= firstVal * 2;
                }
                result += firstVal;
            } catch (Exception e){
                result += firstVal;
            }
        }
        System.out.println("The result: " + result);
    }
}
