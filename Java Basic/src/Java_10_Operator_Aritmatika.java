/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wildan Mufid R
 */
public class Java_10_Operator_Aritmatika {
    public static void main(String[] args){
        //Operasi Aritmatika
        
        int variable1 = 9;
        int variable2 = 6;
        int hasil;
        
        // 1.Penjumlahan
        hasil = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " + hasil);
        
        // 2.Pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n",variable1,variable2,hasil );
        
        // 3.Perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d * %d = %d \n",variable1,variable2,hasil);
        
        // 4.Pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n",variable1,variable2,hasil);
        
        float variable3 = 9;
        float variable4 = 6;
        float hasil2 = variable3 / variable4;
          
        System.out.println(variable3 + " / " + variable4 + " = " + hasil2);
        
        // 5.Modulus (Sisa Pembagian)
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);
        
    }
}
