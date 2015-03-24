public class lima {
    public static void main(String[] args) {

        int batas=10;
        int ang=1;
        System.out.print("angka yang muncul dengan batas "+ang+" sampai "+batas+" : ");
        for (;ang<=batas;ang++){
            System.out.print(ang);
            if (ang<batas) {
            	System.out.print(",");
            }
        }
    }
}
