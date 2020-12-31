import java.util.Scanner;
public class Java_28_Do_While_Loop {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        /*
        Do While loop, akan mengeksekusi program terlebih dahulu, lalu ditanya
        Apakah kita melakukan loop lagi atau tidak ?
        Jika tidak, maka keluar dari loop
        Jika iya, kembali lagi dari sintak "do"
         */

        System.out.println("Berhitung mundur");
        System.out.printf("Dimulai dari -> ");
        int counter = input.nextInt();

        System.out.println("Counter Mulai");
        do{
            System.out.println(counter);
            --counter;
        }while (counter != 0);

        System.out.println("Counter Berakhir");

    }
}
