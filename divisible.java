import java.util.Scanner;
public class divisible {
        public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        a=sc.nextInt();
        if(a%4==0 && a%6==0){
            System.out.println("Number is divisible by 4 and 6:"+a);
        }
        else{
            System.out.println("Number is not divisible by 4 and 6:"+a);
        }
    }
}

