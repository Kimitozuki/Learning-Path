public class Java_34_Method {

    public static void main(String[] args) {
        System.out.println("Jika x = 10, maka y = " + function(10));
        System.out.println("Jika x = 20, maka y = " + function(20));
        System.out.println("Jika x = 50, maka y = " + function(50));
    }
    /*
    Jenis - jenis deklarasi method:
    1. private berarti bahwa metode ini hanya dapat diakses (dipanggil) dari dalam class-nya sendiri
    2. public berarti kelas lain juga dapat mengakses metode tersebut
    3. protected berarti selain kelasnya sendiri, juga dapat diakses oleh kelas lain dalam satu paket (direktori)
    4. kosong (default) sama dengan default package (bisa diakses di paket yang sama) atau public
     */

    //          tipe data return
    //              |      tipe data input method
    //              |            |
    private static int function(int x) {
        int formula = (x + 2) * x;
        return formula;
    }
}
