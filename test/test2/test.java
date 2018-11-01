//class Outer{
//    private String msg = "中国";
//    public String getMsg(){
//        return this.msg;
//    }
//    public void fun(){
//        Inner in = new Inner(this);
//        in.print();
//    }
//}
//class Inner{
//    private Outer out;
//    public Inner(Outer out){
//        this.out = out;
//    }
//    public void print(){
//        System.out.println(out.getMsg());
//    }
//}

//在方法中定义内部类
class Outer{
    private static String msg = "Hello";
    public void fun(int num){
        class Inner{
            public void print(){
                System.out.println("num:" + num);
                System.out.println("msg:" + msg);
            }
        }
        new Inner().print();
    }
}
public class test{
    public static void main(String[] args){
        //在方法中定义内部类
        Outer out = new Outer();
        out.fun(55);

        //实现内部类
        //Outer out = new Outer();
        //out.fun();
    }
}
