import java.util.Arrays;
public class Java_41_Looping_Array_ForEach {
    public static void main(String[] args) {
        System.out.println("Isi Array");
        int[] arrayInt = {10, 20, 30, 40, 50, 60, 70, 80 ,90, 10};
        System.out.println(Arrays.toString(arrayInt));
        System.out.printf("\n");

        //Loop Std
        System.out.println("Loop Standart");
        for (int loopStd = 0; loopStd < 10; loopStd++){
            System.out.println("Index ke-" + loopStd + " -> " + arrayInt[loopStd]);
        }System.out.printf("\n");

        //Loop dgn properti array
        System.out.println("Loop Properti Array");
        for (int loop = 0; loop < arrayInt.length; loop++){
            System.out.println("Index ke-" + loop + " -> " + arrayInt[loop]);
        }System.out.printf("\n");

        //Loop khusus collection <- Array atau Loop for Each
        System.out.println("Loop for Each");
        for (int cont: arrayInt){
            System.out.println("Isi Array -> " + cont);
        }
    }
}
