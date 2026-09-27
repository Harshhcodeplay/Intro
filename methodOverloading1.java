class methodOverloading1 {
    void area(int r) {
        System.out.println("Area of circle = " + (3.14 * r * r));
    }
    void area(int b, int h) {
        System.out.println("Area of triangle = " + (0.5 * b * h));
    }
    void area(double l, double b) {          
        System.out.println("Area of rectangle = " + (l * b));
    }

    public static void main(String[] args) {
        methodOverloading1 a = new methodOverloading1();

        a.area(10);           
        a.area(10, 20);       
        a.area(20.0, 30.0);   
    }
}