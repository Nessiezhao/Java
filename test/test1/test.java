public class test{
    public static void main(String[] args){
        //System.out.println(add(2,3));
        //System.out.println(add(2,3,5));函数重载
        //System.out.println(sum(100));递归求前100个数的和
        //mul(9);//9*9乘法表
        System.out.println(jiecheng(60));
    }
    public static double jiecheng(int num){
        if(num == 1)
            return 1;
        else{
            return num * jiecheng(num-1);
        }
    }
    public static void mul(int num){
        for(int i = 1; i <= num;i++){
            for(int j = 1; j <= i;j++){
                System.out.print(i + "*" + j + "=" + i*j);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
    public static int sum(int num){
        if(num == 1)
            return 1;
        else{
            return num + sum(num - 1);
        }
    }

    public static int add(int x,int y){
        return x + y;
    }
    public static int add(int a,int b,int c){
        return a + b + c;
    }
}

