/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wildan Mufid R
 */
public class Java_14_Operator_Komparasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a,b;
        boolean tf;
        String txt;
        
        //Operator komparasi akan menghasilkan nilai dalam bentuk boolean
        System.out.println("===Persamaan===");
        
        a = 50;
        b = 50;
        tf = (a==b);
        System.out.printf("Apakah %d sama dengan %d ? %s \n",a,b,tf);
        
        a = 50;
        b = 45;
        tf = (a==b);
        System.out.printf("%d == %d --> %s \n",a,b,tf);
        
        //Operator pertidaksamaan ((!) tanda ini hanya berlaku pada boolean)
        System.out.println("\n===Pertidaksamaan===");
        
        a = 50;
        b = 50;
        tf = (a!=b);
        System.out.printf("Apakah %d tidaksama dengan %d ? %s \n",a,b,tf);
        
        a = 50;
        b = 45;
        tf = (a!=b);
        System.out.printf("%d != %d --> %s \n",a,b,tf);
        
        //Operator less than atau kurang dari
        System.out.println("\n===Kurang dari===");
        
        a = 30;
        b = 50;
        tf = (a<b);
        System.out.printf("Apakah %d kurang dari %d ? %s \n",a,b,tf);
        
        a = 50;
        b = 45;
        tf = (a<b);
        System.out.printf("%d < %d --> %s \n",a,b,tf);
        
        //Operator greater than atau lebih besar dari
        System.out.println("\n===Lebih dari===");
        
        a = 50;
        b = 30;
        tf = (a>b);
        System.out.printf("Apakah %d lebih dari %d ? %s \n",a,b,tf);
        
        a = 50;
        b = 45;
        tf = (a>b);
        System.out.printf("%d > %d --> %s \n",a,b,tf);
        
        //Operator less than equal atau kurang dari sama dengan
        System.out.println("\n===Kurang dari sama dengan===");
        
        a = 50;
        b = 50;
        tf = (a<=b);
        System.out.printf("Apakah %d kurang dari sama dengan %d ? %s \n",a,b,tf);
        
        a = 30;
        b = 45;
        tf = (a<=b);
        System.out.printf("%d <= %d --> %s \n",a,b,tf);
        
        //Operator greater than equal atau lebih besar dari sama dengan
        System.out.println("\n===Lebih dari sama dengan===");
        
        a = 50;
        b = 30;
        tf = (a>=b);
        System.out.printf("Apakah %d lebih dari sama dengan %d ? %s \n",a,b,tf);
        
        a = 60;
        b = 60;
        tf = (a>=b);
        System.out.printf("%d >= %d --> %s \n",a,b,tf);

        //Operator Ternary
        System.out.println("\n===Operator Ternary===");
        a = 50;
        b = 100;
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
        txt = (a>b) ? "a lebih besar b" : "a lebih kecil b";
        System.out.println(txt);

    }
    
}
