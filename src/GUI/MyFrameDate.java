package GUI;

import org.w3c.dom.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class MyFrameDate extends JFrame {
    JLabel dateLabel;
    JLabel randomPickLabel;
    JLabel resultLable;
    JTextField t1;
    JLabel calendarLable;


    public MyFrameDate() {
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
    }

    public MyFrameDate(String s) {
        super(s);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        int year, month, weekDay;
    }

    public void showTime() {
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        //设置对齐方式
        layout.setAlignment(FlowLayout.CENTER);
        JButton b1 = new JButton("显示时间");
        add(b1);
        dateLabel = new JLabel("点击显示时间");
        add(dateLabel);
        JButton b2 = new JButton("随机点名");
        add(b2);
        randomPickLabel = new JLabel("点击随机点名");
        add(randomPickLabel);
        t1 = new JTextField();
        add(t1);
        JButton b3 = new JButton("求平方根");
        add(b3);
        resultLable = new JLabel("求平方根结果");
        add(resultLable);
        JButton b4 = new JButton("显示日期");
        add(b4);
        calendarLable = new JLabel("点击显示日期");
        add(calendarLable);
        //添加监视器
        ActionListener Listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDate();
            }
        };
        b1.addActionListener(Listener1);
        ActionListener Listener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randomPickLabel();
            }
        };
        b2.addActionListener(Listener2);
        ActionListener Listener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caculation();
            }
        };
        b3.addActionListener(Listener3);
        ActionListener Listener4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ;
            }
        };
        b4.addActionListener(Listener4);
        calendarLable.setText("当前日期");
    }

    public void showDate() {
        Date nowTime = new Date();
        dateLabel.setText(nowTime.toString());

    }

    public void randomPickLabel() {

        Random random = new Random();
        int i = random.nextInt(36);

        if (i == 0 || i == 1) {
            randomPickLabel.setText("20203606130");

        } else if (i <= 10) {
            randomPickLabel.setText("20208117010" + i);
        } else {
            randomPickLabel.setText("2020811701" + i);

        }
    }

    public void caculation() {


        double d = Double.parseDouble(t1.getText());
        double result = Math.sqrt(d);
        resultLable.setText(String.valueOf(result));


    }

    int year, month, weekDay;

    public void setYear(int year) {
        this.year = year;
    }

    public void month(int month) {
        this.month = month;
    }

    public String[] getCalendar() {
        String[] a = new String[42];
        Calendar rill = Calendar.getInstance();
        rill.set(year, month - 1, 1);
        int weekend = rill.get(Calendar.DAY_OF_WEEK) - 1;
        int day = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            day = 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            day = 30;
        }
        if (month == 2) {
            if (((year % 4 == 0) && year % 100 != 0) && year % 400 == 0)
                day = 29;
            else
                day = 28;
        }
        for (int i = 0; i < weekDay; i++)
            a[i] = " ";

        for (int i = weekDay, n = 1; i < weekDay + day; i++) {
            a[i] = String.valueOf(n);
            n++;
        }
        for (int i = weekDay + day; i < a.length; i++)
            a[i] = " ";
        return a;
    }
}