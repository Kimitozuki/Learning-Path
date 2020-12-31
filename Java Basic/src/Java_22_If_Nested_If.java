import java.util.*;
public class Java_22_If_Nested_If {

    public static void main(String[] args) {
        // If (Nested) If, If didalam If
        Scanner input = new Scanner (System.in);
        int pilihan;

        System.out.println("Sekarang kita akan maju atau mundur ?");
        System.out.printf("[1] Maju \n[2] Mundur \n");
        System.out.print("Pilihan anda ?");
        pilihan = input.nextInt();

        if (pilihan == 1){
            System.out.println("Siap kita akan maju");

            System.out.println("Sekarang kita akan kanan atau kiri ?");
            System.out.printf("[1] Kanan \n[2] Kiri \n");
            System.out.print("Pilihan anda ?");
            pilihan = input.nextInt();

            if (pilihan == 1){
                System.out.println("Siap kita akan ke kanan");

            }else{
                System.out.println("Siap kita akan ke kiri");

            }

        }else{
            System.out.println("Siap kita akan mundur");

        }

    }
}
