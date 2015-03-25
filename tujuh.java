
public class tujuh {
    public static void main(String[] args) {

        int batas=10;
        float jumlah=0;
        int awal=1;
        System.out.print("angka yang akan muncul dari "+awal+" sampai "+batas+" : ");
        for (;awal<=batas;awal++){
            jumlah = jumlah + awal;
        }
        

        jumlah = jumlah/(awal-1);
        System.out.println(jumlah);
    }
}
