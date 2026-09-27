import java.util.Scanner;
public class area
{
    public static void main(String args[])
    {
        double r,area;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the radius:");
        r = sc.nextDouble();
        area = Math.PI*r*r;
        System.out.println("Area= " +area);
    }
}
