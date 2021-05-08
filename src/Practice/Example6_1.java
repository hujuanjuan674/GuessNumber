package Practice;

public class Example6_1 {
    public static void main(String args[]){
        China zhang;
        Japan henlu;
        zhang=new China();
        henlu=new Japan();
        zhang.number=32+Computable.MAX;
        henlu.number=14+Computable.MAX;
        System.out.println("zhang的学号"+zhang.number+" zhang 求和的结果"+zhang.f(100));
        System.out.println("henlu的学号"+henlu.number+" henlu 求和的结果"+henlu.f(100));
    }

    public static class China implements Computable{
        int number;
        public int f(int x){
            int sum=0;
            for(int i=1;i<x;i++){
                sum=sum+i;
            }
            return sum;
        }

    }

    public static class Japan implements Computable{   //Japan类实现Computable接口
        int number;

        @Override
        public int f(int x) {
            return MAX+x;  //直接使用接口中的常量
        }
    }

    public static interface Computable {
        int MAX=46;
        int f(int x);
    }
}
