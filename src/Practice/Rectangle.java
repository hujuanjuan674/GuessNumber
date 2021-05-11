package Practice;

public class Rectangle  extends Shape{
    double a,b;
    Rectangle(double a,double b){
        this.a=a;
        this.b=b;

    }
    public double getArea(){
        return a*b;
    }
}
