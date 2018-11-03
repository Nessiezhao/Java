import java.io.IOException;
public class Alg{
    public static void main(String[] args) {
        //int x = 1;
        //int y = 2;
        ////int z = x++ * y;
        ////System.out.println(z);

        ////三目运算符
        //int z = 5;
        //int m = x > y ? x : (y > z) ? y : z;//取三个数的最大值
        //System.out.println(m);
        //比较运算符
        //逻辑运算符
        //System.out.println("请输入一个字符：");
        //char c = (char)System.in.read();
        //switch(c){
        //    case 'a':{
        //        System.out.println("hello a");
        //        break;
        //    }
        //    case 'b':{
        //        System.out.println("hello b");
        //        break;
        //    }
        //    default:{
        //        System.out.println("不认识");
        //    }
        //}
        //for(int i = 1; i <= 9; i++)
        //{
        //    for(int j = 1 ;j <= i;j++)
        //    {
        //        System.out.print(j + " * " + i + " = " + i * j );
        //        System.out.print("\t");
        //    }
        //    System.out.println();
        //}
        //BigDecimal
        long result = factorial(60);
        System.out.println(result);
    }
    public static long factorial(long num){
        if(num == 1L){
            return 1L;
        }else{
            return num * factorial(num - 1);
        }
    }
}
