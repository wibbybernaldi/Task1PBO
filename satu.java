
public class satu {
    public static void main(String[] args) {

        System.out.println("Cek Tinngi Badan");
        float tinggi = 130;

        if (tinggi<100){
            System.out.println("Maaf tidak memenuhi syarat");
            System.out.println("Karena tinggi < 100, hanya : "+tinggi);
        }else{
            System.out.println("Memenuhi syarat");
            System.out.println("Karena tinggi >= 100, yaitu : "+tinggi);
        }
    }
}