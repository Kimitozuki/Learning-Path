import java.util.Scanner;
public class Java_37_Recursive_Call {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Factorial Calculator");
        System.out.print("Input factorial -> ");
        int factorialIn = input.nextInt();
        System.out.println("Calculation result -> " + factorial(factorialIn));
    }
    //Recursive call adalah pemanggilan ulang method
    private static int factorial(int factorialIn){
        if(factorialIn == 1){
            return factorialIn;
        }else{
            return factorialIn * factorial(factorialIn - 1);
        }
    }
}
