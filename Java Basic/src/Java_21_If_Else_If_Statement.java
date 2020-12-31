import java.util.*;
public class Java_21_If_Else_If_Statement {

    public static void main(String[] args) {

        //If Else If adalah, If Else dalam Else
        Scanner input = new Scanner(System.in);
        int pilihan,hasil;

        System.out.println("Pak ini kita kemana ya ?");
        System.out.printf("[1] Kiri \n[2] Kanan \n[3] Lurus \n");
        System.out.print("Pilihan anda ?");
        pilihan = input.nextInt();

        if (pilihan == 1){

            System.out.println("Siap kita akan ke kiri");

        }else if (pilihan == 2){

            System.out.println("Siap kita akan ke kanan");

        }else{

            System.out.println("Siap kita akan lurus terus");

        }
    }
}
