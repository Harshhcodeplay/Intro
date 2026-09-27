public class program1 {
    static int totalBills=0;
    public static void main(String[]args)
    {
        int itemCount=4;
        double pricePerItem=250.50;
        float taxRate=0.05f;
        long billId=10098234456L;
        char currencySymbol='$';
        boolean isMember=true;
        System.out.println("---primitive types & literals---");
        System.out.println("Bill ID:"+billId+ "Currency:"+currencySymbol);
    {
        int discountFlag=1;
        System.out.println("Inside block -> discount Flag="+discountFlag);
    }
        double subTotal = itemCount*pricePerItem;
        double remainder = itemCount%3;
        System.out.println("\n---Arithmetic operators---");
        System.out.println("Sub Total="+subTotal+",itemCount%3="+remainder);
        System.out.println("\n---Relational operators---");
        System.out.println("Sub Total>500:"+(subTotal>500));
        System.out.println("Item Count==4"+(itemCount==4));
        boolean eligibleForDiscount = isMember && (subTotal>500);
        boolean needsapproval = ! isMember || (subTotal>5000);
        System.out.println("\n---Logical operators---");
        System.out.println("eligible for discount="+eligibleForDiscount);
        System.out.println("needs Approval="+needsapproval);
        int a=6,b=3;
        System.out.println("\n---Bitwise operators---");
        System.out.println("a & b = " + (a & b) + ", a | b = " + (a | b) +
                           ", a ^ b = " + (a ^ b) + ", a << 1 = " + (a << 1));
        double total = subTotal;
        total+=subTotal*taxRate;
        if(eligibleForDiscount){
            total-=50;
        }
        System.out.println("\n---Assignment operator---");
        System.out.println("Final total after tax discount="+total);
        int wholeUnits=10;
        double widenedUnits = wholeUnits;
        System.out.println("\n---Implicit type conversion---");
        System.out.println("whole units="+wholeUnits+"widened to double="+widenedUnits);
        int roundedTotal=(int)total;
        System.out.println("\n---Explicit casting---");
        System.out.println("total="+total+"cast to int=+roundedTotal");
        int precedenceResult = 5+3*2-(4/2);
        System.out.println("\n---operator precedence---");
        System.out.println("5+3*2-(4/2)="+precedenceResult);
        totalBills++;
        System.out.println("\nTotal bills generated so far="+totalBills);
    }
}
