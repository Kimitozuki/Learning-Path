public class Java_45_Array_Multi_D_pt1 {
    public static void main(String[] args) {

        System.out.println("Array 2 Dimensi");
        //Membuat array 2D dengan assignment
        int[][] array_2D = {{1,2}, {3,4}};
        /*
        Penggambaran Array 2D
           {1,2},
           {3,4}
         */
        printArray2D(array_2D);

        //Membuat array 2D dengan deklarasi
        //int[baris][kolom]
        int[][] arrayAngka = new int[5][4];
        printArray2D(arrayAngka);


        // looping Array 2D manual
        /*
        for(int i = 0; i < arrayAngka.length; i++){
           System.out.print("[");
           for(int j = 0; j < arrayAngka[i].length; j++){
               System.out.print(arrayAngka[i][j] + ",");
           }
            System.out.print("]\n");
        }
        */

        // looping Array 2D foreach
        /*
        for (int[] baris: arrayAngka) {
            System.out.print("[");
            for(int angka: baris){
                System.out.print(angka + ",");
            }
            System.out.print("]\n");
        }
         */

        // Pengisian array 2D secara manual
        int[][] array_2D_2 = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15},};
        printArray2D(array_2D_2);

        int[][] array_ragged = {{1,2,3}, {4,5,6,7}, {8},};
        printArray2D(array_ragged);
    }
    private static void printArray2D(int[][] dataArray){
        System.out.print("\n");
        for (int[] col: dataArray) {
            System.out.print("[");
            for(int row: col){
                System.out.print(row + ",");
            }
            System.out.print("]\n");
        }
    }
}
