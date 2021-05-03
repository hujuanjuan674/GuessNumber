public class Example4_5 {
    public static void main(String args[]){
        Rect ractangle=new Rect();
        ractangle.width=109.87;
        ractangle.height=25.18;
        double area=ractangle.getArae();
        System.out.println("矩形的面积:"+area);
        Lader lader=new Lader();
        lader.above=10.798;
        lader.bottom=156.65;
        lader.height=18.12;
        area=lader.getArea();
        System.out.println("梯形的面积:"+area);


    }

    public static class Lader {
        double above;
        double bottom;
        double height;
        double getArea(){
            return (above+bottom)*height/2;

        }
    }

    public static class Rect {
        double width;
        double height;
        double getArae(){
            double area=width*height;
            return area;
        }
    }
}
