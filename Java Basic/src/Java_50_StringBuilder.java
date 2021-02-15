import java.lang.StringBuilder;
public class Java_50_StringBuilder {
    public static void main(String[] args) {
        System.out.println("String Builder");
        System.out.println("--------------------");
        StringBuilder strBuild = new StringBuilder("Alatus");
        printStringBuilder(strBuild);
        /*
        <Append>
        .append sama seperti .concat (Mengubungkan 2 string), yang membuat beda antara .append dan .concat 
        adalah .concat membuat memori baru sedangkan .append masih menggunakan memori yang sama
        */
        strBuild.append(" Nemeseos");
        /*
        Saat di-append kapasitas StringBuilder tidak bertambah, akan tetapi apabila karakter melebihi dari kapasitas
        otomatis kapasitas akan bertambah
        */
        printStringBuilder(strBuild); //Dapat dibuktikan address StringBuilder masih sama
        strBuild.append(" Unicornis");
        printStringBuilder(strBuild);
        //<Insert> Menambahkan string atau character diantara string dalam String builder
        strBuild.insert(15, " Sinae");
        printStringBuilder(strBuild);
        //<Delete> Menghapus string atau char
        //String
        strBuild.delete(6, 14);
        printStringBuilder(strBuild);
        //Char
        strBuild.deleteCharAt(6);
        printStringBuilder(strBuild);
        //<Replace> Mengganti string atau char
        //String
        strBuild.replace(0, 6, "Trifolius");
        printStringBuilder(strBuild);
        //Char
        strBuild.setCharAt(8, 'm');;
        printStringBuilder(strBuild);
        //<Casting toString> merubah StringBuilder ke String
        String finalStr = strBuild.toString();
        System.out.printf("%-24s: %s\n","Data String", finalStr);
        System.out.printf("%-24s: %s\n", "Address String", Integer.toHexString(System.identityHashCode(finalStr)));
    }
    private static void printStringBuilder (StringBuilder dataStr){
        System.out.printf("%-24s: %s\n","Data String Builder", dataStr);
        //Hitungangan kapasitas StringBuilder => 16 + jumlah karater string
        System.out.printf("%-24s: %d\n", "Panjang Data", dataStr.length());
        System.out.printf("%-24s: %d\n", "Kapasitas String Builder", dataStr.capacity());
        System.out.printf("%-24s: %s\n", "Address String Builder", Integer.toHexString(System.identityHashCode(dataStr)));
        System.out.println("--------------------");
    }
}
