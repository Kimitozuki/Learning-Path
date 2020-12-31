import java.util.Scanner;
public class Java_29_For_Loop {

    public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
        
        System.out.println("Hitung Mundur");
        System.out.print("Mulai dari -> ");
	    int counter = input.nextInt();
        // Untuk pendeklarasian var counter dapat dideklarasi diluar for loop atau di dalam for loop
        System.out.println("Counter Mulai");
	    for (;counter != 0; counter--){
            System.out.println(counter);
        }
        System.out.println("Counter Selesai");
    }
}
