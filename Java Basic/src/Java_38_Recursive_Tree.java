import java.util.Scanner;
public class Java_38_Recursive_Tree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci ke -> ");
        int Fn = input.nextInt();
        System.out.printf("Fibonacci ke-%d adalah %d",Fn,fibonacciCal(Fn));
    }
    //Recursive tree, pemanggilan ulang method secara bercabang atau pemanggilan method lebih dari 1
    private static int fibonacciCal(int Fn){
        if(Fn <= 1){
            return Fn;
        }else{
            return fibonacciCal(Fn - 2) + fibonacciCal(Fn - 1);
        }
    }
}
