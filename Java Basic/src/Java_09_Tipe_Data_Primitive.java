/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wildan Mufid R
 */
public class Java_09_Tipe_Data_Primitive {
    public static void main(String[] args){
        //Tipe data di Java
        //integer, byte, short, long, double, float, char, boolean 
        
        //integer (satuan)
        int i = 20;
        System.out.println("===integer===");
        System.out.println("Nilai integer i = " + i);
        System.out.printf("Nilai Max integer = %d \n",Integer.MAX_VALUE);
        System.out.println("Nilai Min integer = " + Integer.MIN_VALUE);
        System.out.println("Besar integer = " + Integer.BYTES + " byte");
        System.out.println("Besar integer = " + Integer.SIZE + " bit");
        // 1 byte = 8 bit, maka dari itu 4 byte = 32 bit
        
        //byte (satuan)
        byte b = 20;
        System.out.println("\n===byte===");
        System.out.println("Nilai byte b = " + b);
        System.out.println("Nilai Max byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai Min byte = " + Byte.MIN_VALUE);
        System.out.println("Besar byte = " + Byte.BYTES + " byte");
        System.out.println("Besar byte = " + Byte.SIZE + " bit");
        
        //short (satuan)
        short s = 20;
        System.out.println("\n===short===");
        System.out.println("Nilai short s = " + s);
        System.out.println("Nilai Max short = " + Short.MAX_VALUE);
        System.out.println("Nilai Min short = " + Short.MIN_VALUE);
        System.out.println("Besar short = " + Short.BYTES + " byte");
        System.out.println("Besar short = " + Short.SIZE + " bit");
        
        //long (satuan)
        long l = 20l;
        System.out.println("\n===long===");
        System.out.println("Nilai long l = " + l);
        System.out.println("Nilai Max long = " + Long.MAX_VALUE);
        System.out.println("Nilai Min long = " + Long.MIN_VALUE);
        System.out.println("Besar long = " + Long.BYTES + " byte");
        System.out.println("Besar long = " + Long.SIZE + " bit");
        
        //double (bilangan riil)
        double d = 20.02d;
        System.out.println("\n===double===");
        System.out.println("Nilai double d = " + d);
        System.out.println("Nilai Max double = " + Double.MAX_VALUE);
        System.out.println("Nilai Min double = " + Double.MIN_VALUE);
        System.out.println("Besar double = " + Double.BYTES + " byte");
        System.out.println("Besar double = " + Double.SIZE + " bit");
        
        //float (bilangan riil)
        float f = 19.95f;
        System.out.println("\n===float===");
        System.out.println("Nilai float f = " + f);
        System.out.println("Nilai Max float = " + Float.MAX_VALUE);
        System.out.println("Nilai Min float = " + Float.MIN_VALUE);
        System.out.println("Besar float = " + Float.BYTES + " byte");
        System.out.println("Besar float = " + Float.SIZE + " bit");
        
        //char (Character berdasarkan ASCII)
        char c = 'C';
        System.out.println("\n===char===");
        System.out.println("Nilai char c = " + c);
        System.out.println("Nilai Max float = " + Character.MAX_VALUE);
        System.out.println("Nilai Min float = " + Character.MIN_VALUE);
        System.out.println("Besar float = " + Character.BYTES + " byte");
        System.out.println("Besar float = " + Character.SIZE + " bit");
        
        //boolean (true / flase)
        boolean tf = true;
        System.out.println("\n===boolean===");
        System.out.println("Nilai boolean tf = " + tf);
        System.out.println("Nilai Max boolean = " + Boolean.TRUE);
        System.out.println("Nilai Min boolean = " + Boolean.FALSE);
    }
}
