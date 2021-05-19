package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

public class MyFrameDate extends JFrame {

    private Label datelabel;

    public MyFrameDate(){
        this.setBounds(200,200,300,300);
        this.setVisible(true);

    }
    public MyFrameDate(String s){
        super(s);
        this.setBounds(200,200,300,300);
        this.setVisible(true);

    }

    public void showTime() {
        JFrame frame2 = new JFrame("第二个窗口");
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        layout.setAlignment(FlowLayout.LEADING);
        JButton b1 = new JButton("显示时间");
        this.add(b1);
        JLabel dateLabel = new JLabel("点击显示时间");
        add(dateLabel);


    }

    ActionListener listener1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            showDate();
        }
    };
    b1.addActionlistener(listener1);

    public void showDate() {
        Date nowTime = new Date();
        datelabel.setText(nowTime.toString());
    }
    public void randomPick(){
        JButton b2=new JButton("随机点名");
        this.add(b2);
        JLabel randomPicklabel=new JLabel("点击随机点名");
        add(randomPicklabel);
        Random random=new Random();
        int i=random.nextInt(36);
        String a=String.valueOf(i);
        if(i==0||i==1){
            randomPicklabel.setText("20203606130");
        }
        else if(i<=10){
            randomPicklabel.setText("20208117010"+i);
        }
        else{
            randomPicklabel.setText("20208117011"+i);
        }
    }
    

}