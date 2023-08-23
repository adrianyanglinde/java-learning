public class FunctionDemo {
    public static void main(String[] args){

        // System.out.println(sum(10,10,10));

        // tranferParamsBase();
        tranferParamsRefer();
    }

    /**
     * 方法重载
     * 只和参数列表和方法名有关，和返回值无关
     * 在调用的时 java虚拟机会根据参数的不同来区分同名的方法
     */
    public static int sum(int a,int b){
        return a + b;
    }

    public static double sum(double a,double b){
        return a + b;
    }

    public static int sum(int a,int b,int c){
        return a + b + c;
    }


    /**
     * 方法参数传递（基本类型）
     * 型参的改变不影响实参的值
     */
    public  static void tranferParamsBase(){
        int a = 10;
        System.out.println("before:" + a);
        changeBase(a);
        System.out.println("after:" + a);
    }
    public  static void changeBase(int a){
        a = 20;
    }


    /**
     * 方法参数传递（引用类型）
     * 型参的改变影响实参的值
     */
    public  static void tranferParamsRefer(){
        int[] arr = {1,2,3,4,5};
        System.out.println("before:" + arr[1]);
        changeRefer(arr);
        System.out.println("after:" + arr[1]);
    }
    public  static void changeRefer(int[] arr){
        arr[1] = 20;
    }
}
