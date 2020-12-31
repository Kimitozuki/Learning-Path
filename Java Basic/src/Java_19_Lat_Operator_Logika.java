import java.util.Scanner;
public class Java_19_Lat_Operator_Logika {

    public static void main(String[] args) {

        //Membuat sebuah objek untuk menangkap input dari user
        Scanner input = new Scanner(System.in);

        //Sebuah program untuk menebak sebuah angka
        int tebakan;
        boolean hasil;

        System.out.print("Pada tahun berapa Indonesia merdeka ? ");
        tebakan = input.nextInt();
        hasil = (tebakan == 1945);
        System.out.println("Jawaban anda " + hasil);

        System.out.println("Pilihlah angka diantara 50 - 100!");
        tebakan = input.nextInt();
        hasil = (tebakan > 50) && (tebakan < 100);
        System.out.println("Hasilnya adalah " + hasil);

    }
}
