//代理设计模式
interface ISubject{
    public void buyComputer();
}
class RealSubject implements ISubject{
    public void buyComputer(){
        System.out.println("买电脑");
    }
}
class ProxySubject implements ISubject{
    private ISubject subject;
    public ProxySubject(ISubject subject){
        this.subject = subject;
    }
    public void produceComputer(){
        System.out.println("生产电脑");
    }
    public void afterSale(){
        System.out.println("售后服务");
    }
    public void buyComputer(){
        this.produceComputer();
        this.subject.buyComputer();
        this.afterSale();
    }
}
class Factory{
    public static ISubject getInstance(){
        return new ProxySubject(new RealSubject());
    }
}
//通过Factory设计来描述
//import java.lang.Object;
//interface IFruit{
//    public void eat();
//}
//class Factory{
//    public static IFruit getInstance(String className){
//        if("apple".equal(className)){
//            return new Apple();
//        }
//        if("watermelon".equal(className)){
//            return new Watermelon();
//        }
//        return null;
//    }
//}
//class Apple implements IFruit{
//    public void eat(){
//        System.out.println("吃苹果前要洗干净");
//    }
//}
//class Watermelon implements IFruit{
//    public void eat(){
//        System.out.println("吃西瓜前要切开");
//    }
//}
//子类为接口进行实例化处理
//interface IFruit{
//    public void eat();
//}
//class Apple implements IFruit{
//    public void eat(){
//        System.out.println("吃苹果前要洗干净");
//    }
//}
//class Watermelon implements IFruit{
//    public void eat(){
//        System.out.println("吃西瓜前要切开");
//    }
//}
//电脑上可以使用任何的usb设备
//interface USB{
//    public void setUp();
//    public void work();
//}
//class Computer{
//    public void plugIn(USB usb){
//        usb.setUp();
//        usb.work();
//    }
//}
//class UDisk implements USB{
//    public void setUp(){
//        System.out.println("U盘建立连接");
//    }
//    public void work(){
//        System.out.println("U盘开始工作");
//    }
//}
//class PrintDisk implements USB{
//    public void setUp(){
//        System.out.println("打印机建立连接");
//    }
//    public void work(){
//        System.out.println("打印机开始工作");
//    }
//}
////用static定义的内部接口相当于外部接口
//interface A{
//    public void printA();
//    static interface B{
//        public void printB();
//    }
//}
//
//class C implements A.B{
//    public void printB(){
//        System.out.println("Hello I am B");
//    }
//}
//一个接口可以使用extends继承多个父接口
//interface A{
//    public abstract void printA();
//}
//interface B{
//    public abstract void printB();
//}
//interface C extends A,B{
//    public abstract void printC();
//}
//class Impl implements C{
//    public void printA(){
//        System.out.println("Hello I am A");
//    }
//    public void printB(){
//        System.out.println("Hello I am B");
//    }
//    public void printC(){
//        System.out.println("Hello I am C");
//    }
//}
//抽象类实现接口
//interface IMessage{
//    public abstract void print();
//}
//abstract class News implements IMessage{
//    public abstract void getNews();
//}
//class IMessageImpl extends News{
//    public void print(){
//        System.out.println("I am a bitter");
//    }
//    public void getNews(){
//        System.out.println("I am News");
//    }
//}
//子类继承抽象类，实现接口
//interface IMessage{
//    public abstract void print();
//}
//
//abstract class News{
//    public abstract void getNews();
//}
//
//class IMessageImpl extends News implements IMessage{
//    public void print(){
//        System.out.println("I am biter");
//    }
//    public void getNews(){
//        System.out.println("I am News");
//    }
//}
//子类实现接口
//interface IMessage{
//    public static final String str = "I am biter";
//    public abstract void print();
//}
//interface INews{
//    public abstract String getNews();
//}
//
//class IMessageImpl implements IMessage,INews{
//    public void print(){
//        System.out.println("hahaha");
//    }
//    public String getNews(){
//        return IMessage.str;
//    }
//}
public class Test{
    public static void main(String[] args){
        //代理设计模式
        ISubject subject = Factory.getInstance();
        subject.buyComputer();

        //通过Factory设计来描述
        //if(args.length == 0){
        //    System.out.println("没有参数");
        //    System.exit(1);
        //}else{
        //    IFruit fruit = Factory.getInstance(args[0]);
        //    fruit.eat();
        //}

        //子类为接口进行实例化处理
        //IFruit fruit1 = new Apple();
        //fruit1.eat();
        //IFruit fruit2 = new Watermelon();
        //fruit2.eat();
        

        //电脑上可以使用任何的usb设备
       // Computer com = new Computer();
       // com.plugIn(new UDisk());
       // com.plugIn(new PrintDisk());

        //用static修饰的内部类相当于外部类
        //C c = new C();
        //c.printB();

        //一个接口可以使用extends继承多个父接口
        //A a = new Impl();
        //a.printA();
        //B b = (B) a;
        //b.printB();
        //C c = (C) a;
        //c.printC();

        //抽象类实现接口
        //IMessage m = new IMessageImpl();
        //m.print();
        //News news = (News) m;
        //news.getNews();

        //子类继承抽象类实现接口
        //IMessage m = new IMessageImpl();
        //m.print();
        //News news = (News) m;
        //news.getNews();

        //IMessage m = new IMessageImpl();
        //m.print();
        //INews n = (INews) m;
        //System.out.println(n.getNews());
    }
}
