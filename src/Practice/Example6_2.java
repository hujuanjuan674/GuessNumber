package Practice;

interface ShowMessage{
    void 显示商标(String s);
}
class TV implements ShowMessage{
    @Override
    public void 显示商标(String s) {
        System.out.println(s);
    }
}
class PC implements ShowMessage{
    @Override
    public void 显示商标(String s) {
        System.out.println(s);
    }
}
public class Example6_2 {
    public static void main(String args[]){
        ShowMessage sm;
        sm=new TV();
        sm.显示商标("长城牌电视机");
        sm=new PC();
        sm.显示商标("联想奔月5008PC机");
    }
}