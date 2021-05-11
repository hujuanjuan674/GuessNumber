package Practice;

public class Pillar {
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
