/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wildan Mufid R
 */
public class Java_12_Unary_Decrement_Increment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Unaray, adalah operasi yang dilakukan pada 1 variable saja
        
        //Unary + dan -
        int a = 5;
        System.out.printf("unary '-', %d menjadi %d \n",a,-a);
        System.out.printf("Unary '+', %d menjadi %d \n",a,+a);
        
        //Unary Decrement dan Increment
        System.out.printf("\nUnary '--' prefix, %d menjadi %d \n",a,--a); //Decrement
        System.out.printf("Unary '++' prefix, %d menjadi %d \n",a,++a); //Increment
        System.out.printf("Unary '++' postfix,%d menjadi %d \n",a,a++);
        System.out.printf("Unary hasil '++' postfix %d \n",a);
        //Postfix maksudnya decrement / increment dipanggil setelah nama variable
        
        int b = 10;
        System.out.println("\nNilai b awal " + b);
        b++;
        ++b;
        System.out.println("Nilai b dengan 2x'++' menjadi " + b);
        
        int c = 10;
        System.out.println("\nNilai c awal " + c);
        c--;
        System.out.println("Nilai c dengan '--' menjadi " + c);
        
        //Unary boolean dengan "!" untuk negasi
        boolean d = true;
        System.out.println ("\nNilai boolean = " + d);
        System.out.println ("Nilai boolean dengan '!' = " + !d);
        }
    
}
