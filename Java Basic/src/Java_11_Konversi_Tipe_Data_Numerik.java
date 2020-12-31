/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wildan Mufid R
 */
public class Java_11_Konversi_Tipe_Data_Numerik {
    public static void main(String[] args){
        //Program untuk konversi data
        int i =300;
        System.out.println("Nilai integer = " + i);
        
        //memperluas ke rentang yang lebih besar
        long l = i;
        System.out.println("Nilai long = " + l);
        
        //Memperkecil ke rentang yang lebih kecil
        byte b = (byte) i;
        System.out.println("Nilai byte = " + b);
        System.out.println("Nilai Max Bye = " + Byte.MAX_VALUE);
        
        //Casting pembagian
        float x = 5; //Salah satu diganti float
        int y = 2;
        
        float z = x/y;
        System.out.printf("%f / %d = %f \n",x,y,z);
        
        int j = 5;
        int k = 2;
        
        float f = (float)j/k;
        System.out.printf("%d / %d = %f \n",j,k,f);
    }
}
