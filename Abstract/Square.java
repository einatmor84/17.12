public class Square extends Shape {
    double s_a, s_b, s_c, s_d;
    //double s_b;
    //double s_c;
    //double s_d;


    public Square(String name, double s_a, double s_b, double s_c, double s_d) {
        super(name);
        this.s_a = s_a;
        this.s_b = s_b;
        this.s_c = s_c;
        this.s_d = s_d;
    }

    @Override
    public double getArea() {
        return s_a * s_c;
    }
}
