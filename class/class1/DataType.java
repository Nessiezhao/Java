public class DataType{
    //类型的默认值作为成员变量或者静态成员变量
    //private static int a;
    //private int a;
    public static void main(String[] args){
        //int a = 10;
        //byte b = a;//类型丢失
        //byte b = 10;//直接给没问题
        //byte b = 128;//放不下，回报错
        ////小类型到大类型->直接转
        //大类型到小类型->强制转换
        //byte b = (byte)300;
        //System.out.println(b);//44
       // double d = 12.1;
        //System.out.println(d * 2);//double类型
        //凡是跟字母要写大写10L
       // float f = 10.2;//此时的10.2默认的是double类型，回报错，大类型向小类型转换，需要进行强转
       // float f = 10.2F;//F打印的时候不会打印出来,只是告诉编译器是类型
       //System.out.println(1.1 * 1.1);//不是1.21，不精确 BigDecimal精确，用来算钱
       //char 和 int可以相互转化
       //char ch = 'A';
       //int num = ch;
       //num = num + 32;
       //ch = (char)num;
       //System.out.println(ch);
       //java.lang.String
    //  String strName = "Java is Best!" ;
    //  String strMark = " Coding";
    //    //String + 表示字符串拼接
    //    System.out.println(strName + strMark);
    //    System.out.println("This is num " + 21);
        //Person per = new Person();
        //System.out.println("This " + person);
        //引用类型，调用toString();方法
        //int num1 = 10;
        //double num2 = 12.1;
        //String result = "This is num " + num1 + num2;
        //System.out.println(result);//结果是This is num 1012.1
        //int num1 = 10;
        //double num2 = 12.1;
        //String result = "This is num " +( num1 + num2);
        //System.out.println(result);//结果是This is num 22.1
        //\t制表符空格 \n换行 \转义
        //System.out.print("a\t");
        //System.out.print("b\t");
        //System.out.print("c\t");
    }
}
