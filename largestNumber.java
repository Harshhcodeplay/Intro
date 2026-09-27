import java.util.Scanner;
public class largestNumber {
    public static void main(String args[])
    {
        int a,b,c,largest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c){
            largest=a;
        }
        else if(b>a && b>c){
            largest=b;
        }
        else{
            largest=c;
        }
        System.out.println("Largest number:" +largest);
    }
}
