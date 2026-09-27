public class library1 {
    String title;
    String author;
    float price; 
public static void main(String args[]){
    library1 obj = new library1();
    System.out.println(obj.title+" "+obj.author+" "+obj.price);
}
library1(){
    title = "Innerpeace";
    author = "James";
    price = 500.0f;
    }
}