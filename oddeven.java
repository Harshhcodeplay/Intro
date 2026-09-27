import java.util.Scanner;
public class oddeven {
    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        a=sc.nextInt();
        if(a%2==0){
            System.out.println("Number is even:"+a);
        }
        else{
            System.out.println("Number is odd:"+a);
        }
    }
}
