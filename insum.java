import java.util.Scanner;
public class insum {
    public static void main(String args[])
    {
        int a,b,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.println("Sum = "+sum);
    }
}
