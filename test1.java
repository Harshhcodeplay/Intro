public class test1 {
    String name;
    int Id;
    float salary;
    public static void main(String[] args){
        test1 obj = new test1();
        System.out.println(obj.name+" "+obj.Id+" "+obj.salary);
    }
    test1(){
        name = "Ram";
        Id = 8765;
        salary = 75000.00f;
    }
}
