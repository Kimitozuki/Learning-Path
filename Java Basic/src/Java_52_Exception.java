import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java_52_Exception {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        /*
         * <Exception> Memberitahu error saat Run-Time Saat error terjadi program
         * langsung berakhir
         */
        int[] arrInt = { 8, 3, 4, 5 };
        System.out.print("Nila array ke: ");
        int index = input.nextInt();
        /*
         * <Exception Handling> Try, Catch, Finally >Try Program yang dijalankan >Catch
         * Mengambil error
         */
        /*
         * try{ System.out.printf("Nilai array ke-%d adalah %d \n", index,
         * arrInt[index]); }catch(Exception eMsg){ System.err.println(eMsg); }
         */
        // Jenis-jenis exception =>
        // https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/

        // Menggabungkan 2 exception
        /*
         * try{ System.out.printf("Nilai array ke-%d adalah %d \n", index,
         * arrInt[index]); FileInputStream fileIn = new FileInputStream("File.txt");
         * }catch(ArrayIndexOutOfBoundsException eMsg){
         * System.err.println("Array Index is Out Of Bounds");
         * }catch(FileNotFoundException eMsg){
         * System.err.println("File does not exist"); }
         */
        // Finally
        try {
            System.out.printf("Nilai array ke-%d adalah %d \n", index, arrInt[index]);
            FileInputStream fileIn = new FileInputStream("File.txt");
        }catch(ArrayIndexOutOfBoundsException eMsg){
            System.err.println("Array Index is Out Of Bounds");
        }catch(FileNotFoundException eMsg){
            System.err.println("File does not exist");
        }finally{
            System.out.println("Try Err Done");
        }
        System.out.println("Program Ended");
    }
}
