package GUI;

import javax.swing.*;

public class FrameDemo {
    public static void main(String[] args){
        MyFrameDate frame1=new MyFrameDate("第一个窗口");
        frame1.showTime();
        MyFrameDate frame2=new MyFrameDate("第二个窗口");
        frame2.caculation();

    }
}