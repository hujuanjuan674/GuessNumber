public class Example4_13 {
    public static void main(String args[]){
        Circle circle=new Circle();
        circle.setRadius(123);
        Tixing lader=new Tixing(90,67,78);
        Student zhang=new Student();
        System.out.println("zhang计算圆的面积:");
        double result=zhang.computerArea(circle);
        System.out.println(result);
        System.out.println("zhang计算梯形的面积:");
        result = zhang.computerArea(lader);
        System.out.println(result);
    }

    public static class Circle {
        double radius,area;
        void setRadius(double r){
            radius =r;
        }
        double getArea(){
            area =3.14*radius*radius;
            return area;
        }
    }

    public static class Tixing {
        double above,bottom,height;
        Tixing(double a,double b,double h){
            above=a;
            bottom=b;
            height=h;
        }
        double getArea(){
          return (above+bottom)*height/2;
        }
    }

    public static class Student {
        double computerArea(Circle c){
            double area=c.getArea();
            return area;
        }
        double computerArea(Tixing t){
            double area=t.getArea();
            return area;
        }
    }
}
