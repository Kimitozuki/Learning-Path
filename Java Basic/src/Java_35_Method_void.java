public class Java_35_Method_void {
    public static void main(String[] args) {
        System.out.println("Jika x = 10.5, maka ->" + function(10.5f));
        System.out.println("Jika x = 20.5, maka ->" + function(20.5f));
        System.out.println("Jika x = 50.5, maka ->" + function(50.5f));
        functionV1(10);
        functionV2(30);
    }
    /*
    Method void
    void artinya hampa, yang artinya fungsi kosong
    Methood void tanpa mengembalikan nilai
     */
    private static void functionV1(int y){
        int formula = (y + 2) * y;
    }
    private static void functionV2(int z){
        int formula = (z + 2) * z;
        System.out.println("Jika z = 30, maka -> " + formula);
    }
    /*
    Fungsi atau Method dengan kembalian
    sehinga menggunakan return untuk
    mengembalikan nilainya menjadi (10.0f)
     */
    private static float function(float x) {
        float formula = (x + 2) * x;
        return 10.0f;
    }
}
