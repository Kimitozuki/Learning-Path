import java.util.Arrays;
public class Java_40_Array {
    public static void main(String[] args) {
        //Array adalah kumpulan data tipe primitive

        System.out.println("Assignment Array");
        /*Assignment Array
          sintax => tipedata [] namaArray = { komponen-komponen }
                   Index = 0   1   2   3   4
                           |   |   |   |   | */
        int[] arrayInt = {5, 10, 15, 20, 25};
        System.out.println(arrayInt); // Alamat Array
        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Array Index 1 sebelum -> " + arrayInt[1]);
        arrayInt[1] = 13;
        System.out.println("Array Index 1 sesudah -> " + arrayInt[1]);
        System.out.println(Arrays.toString(arrayInt));

        /*Deklarasi Array
          sintax => tipedata [] namaArray = new tipedata [jmlh Array]*/
        System.out.println("Deklarasi Array");
        float[] arrayFloat = new float[5];
        System.out.println(Arrays.toString(arrayFloat));
        arrayFloat[4] = 12.5f;
        System.out.println(Arrays.toString(arrayFloat));
    }
}
