/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wildan Mufid R
 */
public class Java_07_String {
    public static void main (String[] args){
        //String berisi
        String name = "Agus";
        System.out.println(name);

        //String kosong
        String name2 = "";
        System.out.println(name2);

        //Mengisi string name2
        name2 += "Dodol";
        System.out.println(name2);

        //Penggabungan string
        name2 += name;
        System.out.println(name2);

        //Penggabungan string menggunakan sintaks .concat
        String name3 = name.concat(name);
        System.out.println(name3);
    }
}
