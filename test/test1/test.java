import java.util.*;
class Person{
    private String name;
    private int age;
    //public Person(String name,int age){
    //    this.name = name;
    //    this.age = age;
    //}
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.print("姓名：" + this.name + "," + "年龄：" + this.age);
    }
}
//class Person{
//    String name;
//    int age;
//}
public class test{
    public static void main(String[] args){
        //扩展Person类的内容
        Person p = new Person();
        p.setName("张三");
        p.setAge(10);
        p.getInfo();

        //对象内存分析
        //Person p = new Person();
        //p.name = "张三";
        //p.age = 10;
        //System.out.print(p.name + p.age);
        
        //通过对象调用实例对象与实例方法
        //Person p = new Person("张三",10);
        //System.out.println(p.name);
        //System.out.println(p.getInfo());

        //数组静态初始化
        //Person[] per = new Person[]{
        //    new Person("张三",10),
        //    new Person("李斯",12),
        //    new Person("王无",13)
        //};
        //for(int i = 0; i < per.length;i++)
        //{
        //    per[i].getInfo();
        //}

        //数组的动态初始化
        //Person[] per = new Person[3];
        //per[0] = new Person("张三",10);
        //per[1] = new Person("李斯",12);
        //per[2] = new Person("王无",13);
        //for(int i = 0; i < per.length;i++)
        //{
        //    per[i].getInfo();
        //}

        //求一个数组的最大值/最小值/平均值/总和(写在一个函数里)
        //processData(new int[]{1,2,3,4,5});

        //求一个数组的最大值/最小值/平均值/总和
        //int[] arr = new int[]{1,2,3,4,5};
        //int max = arr[0];
        //int min = arr[0];
        //int sum = arr[0];
        //for(int i = 1;i < arr.length;i++)
        //{
        //    sum += arr[i];
        //    if(max < arr[i])
        //        max = arr[i];
        //    if(min > arr[i])
        //        min = arr[i];
        //}
        //System.out.println("最大值：" + max);
        //System.out.println("最小值：" + min);
        //System.out.println("平均值：" + (double)sum / arr.length);
        //System.out.println("总和：" + sum);

       //实现数组的拷贝
      // int[] a = new int[]{1,2,3,4,5,6,7};
      // int[] b = new int[]{10,11,12,13,14,15};
      // System.arraycopy(b,3,a,1,3);
      // printArr(a);

       //实现数组排序
       //int[] a = new int[]{2,5,3,6,1};
       //char[] c = new char[]{'d','s','w','a'};
       //java.util.Arrays.sort(a);
       //java.util.Arrays.sort(c);
       //printArr(a);
       //printArr(c);

       //方法修改数组
       // int[] arr = init();
       // bigger(arr);
       // printArr(arr);

        //方法返回数组
        //int[] arr = init();
        //printArr(arr);
        
        //方法接收数组
        //int[] array = new int[]{1,2,3,4,5};
        //printArr(array);
        
        //定一个二维数组
        //int[][] data = new int[][]{
        //    {1,2},{2,3},{3,4}
        //};
        //for(int i = 0;i < data.length;i++)
        //{
        //    System.out.print("{");
        //    for(int j = 0; j < data[i].length;j++)
        //    {
        //        if(j != data[i].length - 1)
        //            System.out.print(data[i][j] + ",");
        //        else
        //            System.out.print(data[i][j]);
        //    }
        //    System.out.println("}");
        //}

        //匿名数组
        //System.out.println(new int[]{1,2,3,4,5}.length);
        
        //System.out.println(add(2,3));
        //System.out.println(add(2,3,5));函数重载
        
        //System.out.println(sum(100));递归求前100个数的和
        
        //mul(9);//9*9乘法表
        
        //System.out.println(jiecheng(60));
        
        //递归实现快排
        //int[] array = new int[]{5,6,2,4,8,1,3};
        //for(int i = 0;i < array.length;i++)
        //{
        //    System.out.print(array[i] + " ");
        //}
        //System.out.println();
        //QuikSort(array,0,array.length-1);
        //for(int i = 0;i < array.length;i++)
        //{
        //    System.out.print(array[i] + " ");
        //}
        //System.out.println();
        
        //定义一个数组
        //int[] arr = new int[4];
        //int[] arr = null;
        //x = new int[4];
        //System.out.println(arr.length);
        //arr[0] = 1;
        //arr[1] = 2;
        //arr[2] = 3;
        //arr[3] = 4;
        //for(int i = 0;i < arr.length;i++)
        //{
        //    System.out.print(arr[i] + " ");
        //}
        //System.out.println();
        
        //多个栈内存指向相同的堆内存
        //int[] x = null;
        //int[] tmp = null;
        //x = new int[3];
        //x[0] = 0;
        //x[1] = 1;
        //x[2] = 2;
        //for(int i = 0;i < x.length;i++)
        //{
        //    System.out.print(x[i] + " ");
        //}
        //System.out.println();
        //tmp = x;
        //tmp[0] = 9;
        //for(int i = 0;i < x.length;i++)
        //{
        //    System.out.print(x[i] + " ");
        //}
        //System.out.println();
        
        //静态初始化定义数组
        //int[] arr = {1,2,3,4,5};
        //for(int i = 0;i < arr.length;i++)
        //{
        //    System.out.print(arr[i] + " ");
        //}
        //System.out.println();
    }
    public static void processData(int[] arr){
        double[] result = new double[4];
        result[0] = arr[0];//最大值
        result[1] = arr[0];//最小值
        result[2] = arr[0];//总和
        result[3] = arr[0];//平均值
        for(int i = 1;i < arr.length;i++)
        {
            result[2] += arr[i];
            if(result[0] < arr[i])
                result[0] = arr[i];
            if(result[1] > arr[i])
                result[1] = arr[i];
        }
        result[3] = (double)result[2] / arr.length;
        System.out.println("最大值：" + result[0]);
        System.out.println("最小值：" + result[1]);
        System.out.println("总和：" + result[2]);
        System.out.println("平均值：" + result[3]);
    }
    public static void bigger(int[] arr){
        for(int i = 0;i < arr.length;i++)
        {
            arr[i] *= 2;
        }
    }
    public static int[] init(){
        return new int[]{1,2,3,4,5};
    }
    public static void printArr(char[] c){
        for(int i = 0;i < c.length;i++)
        {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
    public static void printArr(int[] arr){
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int getmid(int[] arr,int left,int right){
        int key = arr[left];
        while(left < right)
        {
            while(left < right && arr[right] > key)
            {
                right--;
            }
            arr[left] = arr[right];
            while(left < right && arr[left] < key)
            {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = key;
        return left;
    }
    public static void QuikSort(int[] arr,int start,int end){
        if(start < end)
        {
            int mid = getmid(arr,start,end);
            QuikSort(arr,start,mid-1);
            QuikSort(arr,mid+1,end);
        }
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
