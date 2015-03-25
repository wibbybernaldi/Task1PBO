public class sembilan {
    public static void main(String[] args) {
        int akhir=110;

        for (int i=1;i<=akhir;i++){
            System.out.print(" ");
            if(i%5==0){
                System.out.print("Jonny");
            }else {
                System.out.print(i);
            }if (i%11==0) {
                System.out.print("\n");
            }
            
        }
    }
}