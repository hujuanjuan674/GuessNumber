package Practice;

public  abstract class Shape {
    public abstract double getArea();

    public static class Pillar {
        Shape bottom;
        double height;
        Pillar(Shape bottom,double height){
            this.bottom=bottom;
            this.height=height;
        }
        public double getArea(){
            if(bottom==null){
                System.out.println("没有底，无法计算");
                return -1;
            }
            return bottom.getArea()*height;
        }

    }

    public static class Rectangle  extends Shape{
        double a,b;
        Rectangle(double a,double b){
            this.a=a;
            this.b=b;

        }
        public double getArea(){
            return a*b;
        }
    }

    public static class Circle extends Shape{
        double r;
        Circle(double r){
            this.r=r;
        }
        public double getArea() {
            return (3.14 * r * r);
        }

    }

    public static class Square extends Shape{
        double a,b;
        Square(double a,double b){
            this.a=a;
            this.b=b;
        }
        public double getArea(){
            return a*b;
        }

    }
}
