import java.util.Scanner;
public class Java_32_Control_Flow {

    public static void main(String[] args) {
        //break, continue, return
        int x = 0;
        while (true){
            if (x==10){
                System.out.println("break");
                break; //Keluar dari loop
            }else if (x==5){
                System.out.println("continue");
                continue; //Langsung kembali ke awal loop
            }else if (x==7){
                System.out.println("return");
                return; //Keluar dari method public static void
            }
        }
    }
}
