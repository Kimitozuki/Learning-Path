import java.util.Scanner;
public class Java_17_Scanner_dan_Lat_Aritmatika {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alas,tinggi,luas;
        System.out.println("===[Luas Segitiga]===");
        System.out.print("Alas= ");
        alas = input.nextInt();
        System.out.print("Tinggi= ");
        tinggi = input.nextInt();
        luas = alas*tinggi/2;

        System.out.println("Luas= " + luas);

    }
}
