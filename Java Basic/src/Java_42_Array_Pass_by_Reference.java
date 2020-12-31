import java.util.Arrays;
public class Java_42_Array_Pass_by_Reference {
    public static void main(String[] args) {
        System.out.println("Before");
        int[] arrayInt1 = {5, 10, 15, 20, 25};
        int[] arrayInt2 = new int[3];
        System.out.println("Array 1 -> " + Arrays.toString(arrayInt1));
        System.out.println("Alamat Array1 -> " + arrayInt1);
        System.out.println("Array 2 -> " + Arrays.toString(arrayInt2));
        System.out.println("Alamat Array2 -> " + arrayInt2 + "\n");

        System.out.println("After (arryInt2 = arrayInt1)");
        arrayInt2 = arrayInt1; //Array 1 mengikuti memori pada Array 2 dengan kata lain, Array 2 men-copy alamat Array 1
        System.out.println("Array 1 -> " + Arrays.toString(arrayInt1));
        System.out.println("Alamat Array1 -> " + arrayInt1);
        System.out.println("Array 2 -> " + Arrays.toString(arrayInt2));
        System.out.println("Alamat Array2 -> " + arrayInt2 + "\n");

        System.out.println("After (arryInt2 = arrayInt1 -> Change)");
        arrayInt1[0] = 59;
        arrayInt2[4] = 100;
        changeArray(arrayInt1);
        System.out.println("Array 1 -> " + Arrays.toString(arrayInt1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayInt2) + "\n");
    }
    private static void changeArray(int[] dataArray){
        dataArray[2] = 69;
    }
}
