//定义行为类
abstract class Action{
    public static final int EAT = 1;
    public static final int SLEEP = 5;
    public static final int WORK = 10;
    public void command(int cmd){
        switch(cmd){
            case EAT:
                this.eat();
                break;
            case SLEEP:
                this.sleep();
                break;   
            case WORK:
                this.work();
                break;
            case EAT + SLEEP + WORK:
                this.eat();
                this.sleep();
                this.work();
        }
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void work();
}
class Person extends Action{
    public void eat(){
        System.out.println("人会吃饭");
    }
    public void sleep(){
        System.out.println("人会睡觉");
    }
    public void work(){
        System.out.println("人会工作");
    }
}

class Pig extends Action{
    public void eat(){
        System.out.println("猪会吃饭");
    }
    public void sleep(){
        System.out.println("猪会睡觉");
    }
    public void work(){
        //
    }
}

class Robot extends Action{
    public void eat(){
        System.out.println("机器人会吃饭");
    }
    public void sleep(){
    }
    public void work(){
        System.out.println("机器人会工作");
    }
}
public class test{
    public static void main(String[] args){
        fun(new Person());
        fun(new Pig());
        fun(new Robot());
    }
    public static void fun(Action action){
        action.command(Action.EAT + Action.SLEEP + Action.WORK);
    }
}
//abstract class Person{
//    private String name;
//    public Person(){
//        System.out.println("这是Person的构造方法");
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return this.name;
//    }
//    public abstract void getPersonInfo();
//}
//
//class Student extends Person{
//    public Student(){
//        System.out.println("这是Student的构造方法");
//    }
//    public void getPersonInfo(){
//        //空实现
//    }
//}
////abstract class Person{
//    private String name;
//    public Person(){
//        System.out.println("这是Person的构造方法");
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return this.name;
//    }
//    public abstract void getPersonInfo();
//    public static Person getInstance(){//取得A类对象
//        class Student extends Person{
//            public void getPersonInfo(){
//                System.out.println("I am a student");
//            }
//        }
//        return new Student();
//    }
//}
//abstract class A{
//    public A(){
//        this.print();
//    }
//    public abstract void print();
//}
//class B extends A{
//    private int num = 100;
//    public B(int num){
//        super();
//        this.num = num;
//    }
//    public void print(){
//        System.out.println(this.num);
//    }
//}
//内部抽象类可以用static定义来描述外部抽象类
//abstract class A{
//    public abstract void printA();
//    abstract class B{
//        public abstract void printB();
//    }
//}
//class X extends A{
//    public void printA(){};
//    class Y extends B{
//        public void printB(){};
//    }
//}
//public class test{
//    public static void main(String[] args){
//        new B(30);
//        //new Student();
//        //Person per = Person.getInstance();
//        //per.getPersonInfo();
//    }
//}
