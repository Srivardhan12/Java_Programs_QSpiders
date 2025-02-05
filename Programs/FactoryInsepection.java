class FactoryInsepection{
    public static void main(String[] args){
        int a = -12;
        int product = 1;
        int sum = 0;
        while(a > 0){
            int f = a % 10;
            product = product * f;
            sum = sum + f;
            a = a / 10;
        }
        if(sum == product ){
            System.out.println("PASSE INSPECTION");
        }
        else if(a < 0){
           System.out.println("INVALID NUMBER");
        }
        else{
            System.out.println("REJECTED");
        }
    }
}