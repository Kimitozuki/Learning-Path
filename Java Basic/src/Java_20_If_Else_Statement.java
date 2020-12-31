import java.util.Scanner;
public class Java_20_If_Else_Statement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;
        //Tutorial untuk If Else statement atau percabangan
        System.out.println("Silahkan pilih maju atau mundur");
        System.out.println("[1] Mundur");
        System.out.println("[2] Maju");
        System.out.print("Pilihan anda (menggunakan angka): ");
        pilihan = input.nextInt();

        if (pilihan == 1){
            System.out.println("Siap kita akan mundur");
        }else{
            System.out.println("SASAGEYO !!!");
        }

    }
}
