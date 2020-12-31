import java.util.Scanner;
public class Java_18_Pengelompokan_Operasi_Aritmatika {

    public static void main(String[] args) {

        /*
        Pengelompokan operasi aritmatika menggunakan matematika pada umumnya
        1. * atau / dikerjakan awal apabila terdapat + atau -
        2. Jika terdapat * dan /, maka dikerjakan paling kiri, begitu juga dengan + dan -
        3. Pengurungan dikerjakan terlebih dahulu
         */

        //Luas Trapesium
        Scanner input = new Scanner(System.in);
        int a,b,t;
        float luas;

        System.out.println("===Luas Trapesium===");
        System.out.print("Sisi atas = ");
        a = input.nextInt();
        System.out.print("Sisi bawah = ");
        b = input.nextInt();
        System.out.print("Tinggi = ");
        t = input.nextInt();
        luas = (float)(a+b)/2*t;
        System.out.println("Luas Trapesium = " + luas);
    }
}
