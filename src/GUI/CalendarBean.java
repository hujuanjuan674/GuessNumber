package GUI;

public class CalendarBean extends MyFrameDate{
    public static void main(String args[]){
        CalendarBean cb=new CalendarBean();
        cb.setYear(2021);
        cb.setMonth(6);
        String[]a= cb.getCalendar();
        char[]str="日一二三四五六".toCharArray();
        for(char c:str){
            System.out.printf("%3c",c);
        }
        for(int i=0;i<a.length;i++){
            if(i%7==0)
                System.out.println("");
        }
    }

    private void setMonth(int i) {
    }
}
