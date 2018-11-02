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
//class Outer{
//    private static String msg = "Hello";
//    public void fun(int num){
//        class Inner{
//            public void print(){
//                System.out.println("num:" + num);
//                System.out.println("msg:" + msg);
//            }
//        }
//        new Inner().print();
//    }
//}
//继承
//class Person{
//    private String name;
//    private int age;
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }
//    public int getAge(){
//        return age;
//    }
//}
//class Student extends Person{
//    private String school;
//    public void setSchool(String school){
//        this.school = school;
//    }
//    public String getSchool(){
//        return school;
//    }
//}
//观察子类对象创建
//class Person{
//    public Person(){
//        System.out.println("Person类对象的产生");
//    }
//}
//class Student extends Person{
//    public Student(){
//        super();
//        System.out.println("Student类对象的产生");
//    }
//}
//隐式继承
//class Person{
//    private String name;
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
//}
//class Student extends Person{
//    public void fun(){
//        System.out.println(getName());
//    }
//}
//观察简单的覆写
//class Person{
//    public String info = "Person";
//    public void print(){
//        System.out.println("这是Person的print方法");
//    }
//    public void PrintInfo(){
//        System.out.println("I'm father");
//    }
//}
//class Student extends Person{
//    public String info = "Student";
//    public void print(){
//        System.out.println("这是Student的print方法");
//    }
//    //使用super调用父类的同名方法
//    public void PrintInfo(){
//        super.PrintInfo();
//        System.out.println("I'm child");
//    }
//}
//class Person{
//    public String info = "爸爸";
//}
//class Student extends Person{
//    public String info = "儿子";
//    public void print(){
//        System.out.println(super.info);
//        System.out.println(this.info);
//    }
//}
//final关键字定义的类不能有子类
//final关键字定义的方法不能被子类覆写
//final关键字定义的变量就成为了常量，常量必须在声明的时候进行赋值，并且不能够被修改A

//向上转型
//class Person{
//    public void print(){
//        System.out.println("我是爸爸");
//    }
//}
//class Student extends Person{
//    public void print(){
//        System.out.println("我是儿子");
//    }
//}
//向下转型（当需要子类扩充操作的时候）
//class Person{
//    public void print(){
//        System.out.println("我是爸爸");
//    }
//}
//class Student extends Person{
//    public void print(){
//        System.out.println("我是儿子");
//    }
//    public void fun(){
//        System.out.println("只有儿子有");
//    }
//}
//
//向上转型的一个核心用途：操作参数统一
class Person{
    public void print(){
        System.out.println("我是人类");
    }
}
class Student extends Person{
    public void print(){
        System.out.println("我是学生");
    }
}
class Worker extends Person{
    public void print(){
        System.out.println("我是工人");
    }
}
public class test{
    public static void main(String[] args){
        //向上转型的核心用途：操作参数统一
        whoAreYou(new Student());
        whoAreYou(new Worker());

        //instaceof操作
        //Person per = new Student();
        //System.out.println(per instanceof Person);
        //System.out.println(per instanceof Student);
        //if(per instanceof Student){
        //    Student stu = (Student)per;
        //    stu.fun();
        //}

        //向下转型
        //想进行向下转型前一定要先发生向上转型
        //Person per = new Student();
        //per.print();
        //Student stu = (Student)per;
        //stu.fun();

        //向上转型
        //Person per = new Student();
        //per.print();

        //使用super调用父类的属性
        //new Student().print();

        //使用super调用父类的同名方法
        //new Student().PrintInfo();

        //观察简单的覆写
        //new Student().print();
        //System.out.println(new Student().info);


        //隐式继承
        //Student st = new Student();
        ////子类能够使用的是所有非private的操作，而所有private的操作无法被直接使用，所以称为隐式继承
        //System.out.println(st.getName());
        //st.setName("张三");
        //st.fun();

        //观察子类对象的产生
        //如果父类没有提供无参构造，那么必须用super()明确指明，你要调用的父类构造方法
        //new Student();


        //继承
        //Student st = new Student();
        //st.setName("张三");
        //st.setAge(10); 
        //st.setSchool("高新一中");
        //System.out.println("姓名：" + st.getName() + "年龄：" + st.getAge() + "学校：" + st.getSchool());
        

        //在方法中定义内部类
        //Outer out = new Outer();
        //out.fun(55);

        //实现内部类
        //Outer out = new Outer();
        //out.fun();
    }
    public static void whoAreYou(Person per){
        per.print();
    }
}
