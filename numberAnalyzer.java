import java.util.Scanner;
public class numberAnalyzer {
    public static boolean isPrime(int num){
        if(num<=1) return false;
        if(num<=3) return true;
        if(num%2==0 || num%3==0) return false;
        for(int i=5;i*i<=num;i+=6){
            if(num%i==0 || num%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPerfectSquare(int num){
        if(num<0) return false;
        int root =  (int) Math.sqrt(num);
        return root * root == num;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number\n");
        int number = sc.nextInt();
        boolean isPrime = isPrime(number);
        boolean isSquare = isPerfectSquare(number);
        boolean result = !isPrime && !isSquare;
        System.out.println(result);
    }
}
