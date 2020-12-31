import java.util.Scanner;
public class Java_27_While_Loop {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        /*
        While loop, dimana sebelum mengeksekusi program, loop akan ditanyakan terlebih dahulu
        apakah kita melakukan loop atau tidak ?
        Jika tidak program tidak akan dieksekusi
        Jika iya program akan dieksekusi hingga batas loop yang ditentukan
         */

        System.out.println("Berhitung Mundur");
        System.out.print("Dimulai dari ->");
        int counter = input.nextInt();

        System.out.println("Counter Mulai");
        while(counter != 0){
            System.out.println(counter);
            --counter;
        }
        System.out.println("Counter Selesai");
    }
}
