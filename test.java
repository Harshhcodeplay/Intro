public class test{
    String Empname;
    int EmpId;
    float EmpSalary;
    public static void main(String[] args)
    {
        test obj = new test("Ram", 98722, 80000.00f);
        System.out.println(obj.Empname+" "+obj.EmpId+" "+obj.EmpSalary);
    }
    test(String name, int Id, float salary)
    {
        Empname = name;
        EmpId = Id;
        EmpSalary = salary;
    }
}
