package Practice;

public class Circle extends Shape{
    double r;
    Circle(double r){
        this.r=r;
    }
    public double getArea() {
        return (3.14 * r * r);
    }

}

