import java.util.Scanner;
public class numberPrinter {
    public static void main(String args[]){
        for(int i=1;i<=50;i++){
            if(i==35){
                break;
            }
            if(i%5==0){
                continue;
            }
            System.out.println(i+" ");
        }
    }
}
