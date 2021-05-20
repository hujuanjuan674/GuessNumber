package GUI;

public class FrameDemo {
    public static void main(String[] args){
        MyFrameDate frame2=new MyFrameDate("第二个窗口");
        frame2.showTime();
        MyFrameDate frame3=new MyFrameDate("第一个窗口");
        frame3.randomPick();
    }
}