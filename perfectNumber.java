import java.util.Scanner;
public class perfectNumber {
  public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = sc.nextInt();
    int sum = 0;
    for(int i = 1; i < num; i++){
        if(num % i == 0){
            sum += i;
        }
    }
    if(sum == num){
        System.out.println(num+ " is a perfect Number");
    }
    else{
        System.out.println(num+ " is not a perfect number");
    }
  }  
}
