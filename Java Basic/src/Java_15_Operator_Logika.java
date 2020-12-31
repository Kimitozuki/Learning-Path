/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wildan Mufid R
 */
public class Java_15_Operator_Logika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Opertaor logika --> operasi yang bisa kita lakukan dengan tipe data boolean
        //AND,OR,XOR,negasi
        boolean a,b,c;
        
        //OR (||)
        System.out.println("===OR(||)===");
        
        a = true;
        b = true;
        c = (a||b);
        System.out.printf("%s || %s = %s \n",a,b,c);
        
        a = true;
        b = false;
        c = (a||b);
        System.out.printf("%s || %s = %s \n",a,b,c);
        
        a = false;
        b = true;
        c = (a||b);
        System.out.printf("%s || %s = %s \n",a,b,c);
        
        a = false;
        b = false;
        c = (a||b);
        System.out.printf("%s || %s = %s \n",a,b,c);
        
         //AND (&&)
        System.out.println("\n===AND(&&)===");
        
        a = true;
        b = true;
        c = (a&&b);
        System.out.printf("%s && %s = %s \n",a,b,c);
        
        a = true;
        b = false;
        c = (a&&b);
        System.out.printf("%s && %s = %s \n",a,b,c);
        
        a = false;
        b = true;
        c = (a&&b);
        System.out.printf("%s && %s = %s \n",a,b,c);
        
        a = false;
        b = false;
        c = (a&&b);
        System.out.printf("%s && %s = %s \n",a,b,c);
        
         //XOR (^)
        System.out.println("\n===XOR(^)===");
        
        a = true;
        b = true;
        c = (a^b);
        System.out.printf("%s ^ %s = %s \n",a,b,c);
        
        a = true;
        b = false;
        c = (a^b);
        System.out.printf("%s ^ %s = %s \n",a,b,c);
        
        a = false;
        b = true;
        c = (a^b);
        System.out.printf("%s ^ %s = %s \n",a,b,c);
        
        a = false;
        b = false;
        c = (a^b);
        System.out.printf("%s ^ %s = %s \n",a,b,c);
        
        //Negasi (!) tanda ini hanya berlaku untuk jenis data boolean
        System.out.println("\n===Negasi(!)===");
        
        a = true;
        c = !a;
        System.out.printf("%s -->(!) = %s \n",a,c);
        
        a = false;
        c = !a;
        System.out.printf("%s -->(!) = %s \n",a,c);
    }
    
}
