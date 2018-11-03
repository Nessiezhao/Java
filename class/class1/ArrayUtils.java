public class ArrayUtils{
    //1.数组的最大值
    public static int arrayMaxElement(int[] data){
        int max = data[0];
        for(int i = 1;i < data.length; i++){
            if(max < data[i]){
                max = data[i];
            }else{
                continue;
            }
        }
        return max;
    }
    //2.数组的最小值
    public static int arrayMinElement(int[] data){
        int min = data[0];
        for(int i = 1;i < data.length;i++){
            if(min > data[i]){
                min = data[i];
            }else{
                continue;
            }
        }
        return min;
    }
    //3.数组值之和
    public static int arrayElementSum(int[] data){
        int sum = 0;
        for(int i = 0;i < data.length;i++){
            sum += data[i];
        }
        return sum;
    }
    //4.数组拼接
    public static int[] arrayJoin(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        for(int i = 0; i < a.length;i++){
            c[i] = a[i];
        }
        for(int i = a.length;i < a.length + b.length;i++){
            c[i] = b[i - a.length];
        }
        return c;
    }
    //5.数组截取
    public static int[] arraySub(int[] a,int start,int end){
        int[] c = new int[end - start ];
        for(int i = start; i < end ; i++){
            c[i - start] = a[i];
        }
        return c;
    }
    public static void main(String[] args){
        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[]{6,7,8,9};
        int max1 = arrayMaxElement(array1);
        System.out.println(max1);
        int max2 = arrayMaxElement(array2);
        System.out.println(max2);
        int min1 = arrayMinElement(array1);
        System.out.println(min1);
        int min2 = arrayMinElement(array2);
        System.out.println(min2);
        int sum1 = arrayElementSum(array1);
        System.out.println(sum1);
        int sum2 = arrayElementSum(array2);
        System.out.println(sum2);
        int[] result1 = arrayJoin(array1,array2);
        for(int i = 0; i < result1.length;i++){
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        int[] result2 = arraySub(array1,2,4);
        for(int i = 0; i < result2.length;i++){
            System.out.print(result2[i] + " ");
        }
        System.out.println();
    }
}
