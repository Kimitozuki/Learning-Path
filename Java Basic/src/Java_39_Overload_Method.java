public class Java_39_Overload_Method {
    public static void main(String[] args) {
        printNum(4.5f);
        printNum(4);
        System.out.println(sum(5, 7.5f));
        System.out.println(sum(4.5f,4.5f));
    }
    //Overload method, pemanggilan method yang namanya sama tetapi akan menyesuaikan dengan tipe data input
    private static void printNum(int numInt){
        System.out.println(numInt);
    }
    private static void printNum(float numFloat){
        System.out.println(numFloat);
    }
    private static float sum(int numX_int, float numY_float){
        return numX_int + numY_float;
    }
    private static int sum(float numX_float, float numY_float){
        return (int) (numX_float + numY_float);
    }
}
