public class library2 {
    String author;
    String title;
    float price;
    public static void main(String args[]){
        library2 obj = new library2("James","Innerpeace",500.0f);
    }
    library2(String a,String t,float p){
        author = a;
        title = t;
        price = p;
        System.out.println("the author name is "+a);
        System.out.println("the title is "+t);
        System.out.println("the price is "+p);
    }
}
