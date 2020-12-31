public class Java_16_Operator_Bitwise {

    public static void main(String[] args) {

        //Operator Bitwise --> Operator untuk melakukan operasi pada nilai bit
        byte a,b,c;
        String a_bits,b_bits,c_bits;

        //Operator Shift Left
        System.out.println("===Shift Left===");
        a = 5;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ","0");
        System.out.printf("%s = %d (Before)\n",a_bits,a);
        b = (byte)(a<<1);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(" ","0");
        System.out.printf("%s = %d (After)\n",b_bits,b);

        //Operator Shift Right
        System.out.println("\n===Shift Right===");
        a = 7;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ","0");
        System.out.printf("%s = %d (Before)\n",a_bits,a);
        b = (byte)(a>>1);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(" ","0");
        System.out.printf("%s = %d (After)\n",b_bits,b);

        //Operator Bitwise OR
        System.out.println("\n=== Bitwise OR(|)===");
        a = 20;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ","0");
        System.out.printf("%s = %d \n",a_bits,a);
        b = 25;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(" ","0");
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("---------------OR");
        c =(byte)(a | b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(" ","0");
        System.out.printf("%s = %d \n",c_bits,c);

        //Operator Bitwise AND
        System.out.println("\n=== Bitwise AND(&)===");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ","0");
        System.out.printf("%s = %d \n",a_bits,a);
        b = 35;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(" ","0");
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("---------------AND");
        c =(byte)(a & b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(" ","0");
        System.out.printf("%s = %d \n",c_bits,c);

        //Operator Bitwise XOR
        System.out.println("\n=== Bitwise XOR(^)===");
        a = 45;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ","0");
        System.out.printf("%s = %d \n",a_bits,a);
        b = 75;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(" ","0");
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("---------------XOR");
        c =(byte)(a ^ b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(" ","0");
        System.out.printf("%s = %d \n",c_bits,c);

        //Operator Negasi
        System.out.println("\n===Negasi(~)===");
        a = 13;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(" ","0");
        System.out.printf("%s = %d \n",a_bits,a);
        System.out.println("---------------NOT");
        b = (byte)~a; // tanda (~) hanya berlaku pada tipe data selain boolean
        b_bits = String.format("%8s",Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d \n",b_bits,b);

    }
}
