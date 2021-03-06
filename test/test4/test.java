//class Person{
//    private String name;
//    private int age;
//    public Person(String name,int age){
//        this.name = name;
//        this.age = age;
//    }
//    public String toString(){
//        return "姓名" + this.name + ",年龄" + age;
//    }
//    public boolean equals(Object obj){
//        if(obj == null){
//            return false;
//        }
//        if(this == obj){
//            return true;
//        }
//        if(!(obj instanceof Person)){
//            return false;
//        }
//        Person per = Person (obj);
//        return this.name.equals(per.name) && this.age == per.age;
//    }
//}
//class Student{}
//自己定义一个包装类
class IntDemo{
    private int num;
    public IntDemo(int num){
        this.num = num;
    }
    public int intValue(){
        return this.num;
    }
}
interface IMessage{
    public void getMessage();
}
class IMessageImpl implements IMessage{
    public String toString(){
        return "I am small biter";
    }
    public void getMessage(){
        System.out.println("欢迎你");
    }
}
public class test{
    public static boolean isNumber(String str){
        char data[] = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(data[i] < '0' || data[i] > '9'){
                return false;
            }
        }
        return true;
    }
    public static String firstUpper(String str){
        if("".equals(str) || str == null){
            return str;
        }
        if(str.length() > 1){
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
        return str.toUpperCase();
    }
    public static void fun(StringBuffer sb){
        sb.append("\n").append("nihao");
    }
    public static void printInfo(Object obj){
        System.out.println(obj.toString());
    }
    public static void main(String[] args){
        String str = String.valueOf(100);
        System.out.println(str);
        //如果转换时遇见非数字字符就会出现错误,与boolean转换就不会发生此错误
        //String str = "123eqwe";
        //boolean tmp = Boolean.parseBoolean(str);
        //System.out.println(tmp);//false
        //String str = "123aaa";
        //double num = Double.parseDouble(str);
        //System.out.println(num);
        //将字符串变成double型
        //String str = "123";
        //double num = Double.parseDouble(str);
        //System.out.println(num);
        //将字符串变为int型
        //String str = "123";
        //int num = Integer.parseInt(str);
        //System.out.println(num);

        //观察“==”和“equals”的问题
        //Integer num1 = new Integer(10);
        //Integer num2 = new Integer(10);
        //System.out.println(num1 == num2);//false
        //System.out.println(num1 == new Integer(10));//fasle
        //System.out.println(num1.equals(new Integer(10)));//true

        //自动装箱与拆箱
        //Integer x = 55;
        //System.out.println(++x * 5);
        //装箱和拆箱
        //Integer num = new Integer(55);//装箱
        //int data = num.intValue();//拆箱
        //System.out.println(data);
        //使用IntDemo
        //Object obj = new IntDemo(55);
        //IntDemo tmp = (IntDemo)obj;
        //System.out.println(tmp.intValue());

        //使用Object接收接口对象
        //IMessage msg = new IMessageImpl();
        //Object obj  = msg;
        //System.out.println(obj);
        //IMessage temp = (IMessage) obj;
        //temp.getMessage();

        //用Object接收数组对象
        //Object obj = new int[]{1,2,3,4,5};
        //int data[] = (int[]) obj;
        //for(int i: data){
        //    System.out.println(i + ",");
        //}
        
        //实现对象比较
        //Person per1 = new Person("nihao",10);
        //Person per2 = new Person("nihao",10);
        //System.out.println(per1.equals(per2));
        //String str = "Hello " + new Person("nihao",10);
        //System.out.println(str);
        //使用Object类接收所有类的对象
        //printInfo(new Person("nihao",5));
        //printInfo("hello");
        //删除指定范围的数据
        //StringBuffer sb = new StringBuffer("helloworld");
        //System.out.println(sb.delete(5,10));
        //System.out.println(sb.insert(0,"你好"));

        //字符串反转
        //StringBuffer sb = new StringBuffer("helloworld");
        //System.out.println(sb.reverse());
        //StringBuffer
        //StringBuffer sb = new StringBuffer();
        //sb.append("Hello ").append("World");
        //fun(sb);
        //System.out.println(sb);
        //首字母转换成大写
        //System.out.println(firstUpper("hello"));
        //System.out.println(firstUpper(""));
        //System.out.println(firstUpper("a"));
        //判空
        //System.out.println("hello".isEmpty());//false
        //System.out.println("".isEmpty());//true
        //System.out.println(new String().isEmpty());//true
        //字符串长度
        //String str = "  **((helloworld哈哈哈))";
        //System.out.println(str.length());
        //大小写转换(这个函数只转换字母)
        //String str = "  **((helloworld哈哈哈))";
        //System.out.println(str.toUpperCase());
        //System.out.println(str.toLowerCase());

        //去掉字符串的左右空格，但保留中间空格
        //String str = "  hello   world   ";
        //System.out.println("[" + str + "]");
        //System.out.println("[" + str.trim() + "]");
        //字符串截取
        //String str = "helloworld";
        //System.out.println(str.substring(5));
        //System.out.println(str.substring(0,5));
        //多次拆分
        //String str = "nihao:23 | haha:24";
        //String[] result = str.split("\\|");
        //for(int i = 0; i < result.length;i++){
        //    String[] temp = result[i].split(":");
        //    System.out.println(temp[0] + " = "+ temp[1]);
        //}
        //拆分IP地址
        //String str = "192.168.1.1";
        //String[] result = str.split("\\.");
        //for(String s : result){
        //    System.out.println(s);
        //}
        //实现字符串的拆分处理
        //String str = "hello apple orange banana pear";
        //String[] result = str.split(" ",3);
        //for(String s : result){
        //    System.out.println(s);
        //}

        //字符串的替换处理
        //String str = "helloworld";
        //System.out.println(str.replaceAll("l","_"));
        //System.out.println(str.replaceFirst("l","_"));
        //判断开头和结尾
        //String str = "**@@helloworld!!";
        //System.out.println(str.startsWith("**"));
        //System.out.println(str.startsWith("@@",2));
        //System.out.println(str.endsWith("!!"));
        //使用indexOf要注意，只会返回查找时第一个遇到的位置
        //String str = "helloworld";
        //System.out.println(str.indexOf("l"));//2
        //System.out.println(str.indexOf("l",5));//8
        //System.out.println(str.lastIndexOf("l"));//8
        //判断字符串是否存在
        //String str = "helloworld";
        //System.out.println(str.contains("world"));//true
        //在JDK1.5以前使用的是
        //String str = "helloworld";
        //System.out.println(str.indexOf("world"));
        //System.out.println(str.indexOf("bit"));
        //if(str.indexOf("hello") != -1){
        //    System.out.println("可以找到");
        //}

        //字符串比较
        //1.区分大小写
        //String str1 = "hello";
        //String str2 = "Hello";
        //System.out.println(str1.equals(str2));//false
        ////2.不区分大小写
        //String str3 = "hello";
        //String str4 = "Hello";
        //System.out.println(str3.equalsIgnoreCase(str4));//true
        //System.out.println("A".compareTo("a"));//-32
        //System.out.println("a".compareTo("A"));//32
        //System.out.println("A".compareTo("A"));//0
        //System.out.println("AB".compareTo("AC"));//-1
        //System.out.println("刘".compareTo("赵"));//-15197
        //3.比较大小
        //字符串与字节数组的转换，字节只适合处理二进制数据
        //String str = "helloworld";
        //byte data[] = str.getBytes();
        //for(int i = 0;i < str.length();i++){
        //    data[i] -= 32;
        //    System.out.print(data[i] + " ");
        //}
        //System.out.println();
        //System.out.println(new String(data));
        //判断一个字符串是否由数字组成
        //String str = "12343443";
        //System.out.println(isNumber(str) ? "字符串是由数字组成" : "字符串包含非数字字符");
        //字符串与字符数组的转换
        //String str = "helloworld";
        //char data[] = str.toCharArray();
        //for(int i = 0; i < str.length(); i++){
        //    data[i] -= 32;
        //    System.out.print(data[i] + " ");
        //}
        //System.out.println();
        //System.out.println(new String(data));
        //System.out.println(new String(data,5,5));
        //字符与字符串
        //观察charAt方法
        //String str = "hello";
        //System.out.println(str.charAt((0)));//h
        //System.out.println(str.charAt(10));//超出字符串长度，会抛出StringIndexOutOfBoundsException异常
        //字符串常量不可变更，字符串一旦定义不可改变
        //String str = "hello";
        //str = str + " world";
        //str += "!!!";
        //System.out.println(str);//hello world!!!以上字符串的变更是字符串对象的变更而非字符串常量
        //String类两种实例化的区别
        //1.采用直接赋值
        //String s1 = "hello";
        //String s2 = "hello";
        //String s3 = "hello";
        //System.out.println(s1 == s2);//true
        //System.out.println(s2 == s3);//true
        //System.out.println(s1 == s3);//true
        //String类的设计采用了共享设计模式
        //在JVM底层会自动维护一个对象池，如果现在采用了直接赋值的方式进行String类的对象实例化的操作
        //那么该实例化对象将自动保存到对象池中。如果下次继续使用直接赋值的方式声明String类对象
        //此时对象池中若有指定内容，将直接进行引用，如果没有则开辟新的字符串对象而后将其保存在对象池中，以供下次使用
        //2.采用构造方法
        //String str = new String("hello");
        ////会开辟两个堆内存空间，并且其中一块堆内存空间将成为垃圾空间，而且也会对内存共享产生问题
        //String str1 = "hello";
        //System.out.println(str == str1);//false
        //String类还提供入池方法intern()
        //String str = new String("hello").intern();
        //String str1 = "hello";
        //System.out.println(str == str1);//true
        
        //在判断用户输入字符串是否与特定字符串相等时，一定要把特定字符串写在前面
        //避免用户没有输入字符，出现“NullPointerException”的情况
        //String str1 = null;//用户输入空字符串
        //String str2 = new String("Hello");
        //System.out.println(str1.equals(str2));//NullPointerException
        //String str1 = null;//用户输入空字符串
        //String str2 = new String("Hello");
        //System.out.println(str2.equals(str1));//false
        //字符串常量是String的匿名对象
        //String str1 = "Hello";
        //String str2 = new String("Hello");
        //System.out.println(str1.equals(str2));
        //System.out.println("Hello".equals(str2));
        //字符串相等比较
        //首先观察基本数据类型的比较
        //int x = 20;
        //int y = 20;
        //System.out.println(x == y);//true
        ////观察在String类上使用“==”比较
        //String str1 = "Hello";
        //String str2 = new String("Hello");
        //System.out.println(str1 == str2);//false,"=="本身用于的是数值比较，现在用于对象比较
        ////所比较的是两个对象所保存的内存地址数值的大小，而不是比较内容
        ////如果想要比较字符串的内容，需要使用String类提供的equals方法
        //System.out.println(str1.equals(str2));//true
        //String 类的两种实例化方式
        //1.直接方式
        //String str1 = "Hello Java";//str是一个对象，Hello Java保存在堆中
        //System.out.println(str1);
        ////2.传统方式
        //String str2 = new String("Hello World");
        //System.out.println(str2);
    }
}
