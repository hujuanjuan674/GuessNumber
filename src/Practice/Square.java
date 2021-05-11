package Practice;

public class Square extends Shape{
    double a,b;
    Square(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double getArea(){
        return a*b;
    }

}
