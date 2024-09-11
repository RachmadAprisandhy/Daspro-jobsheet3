import java.util.Scanner;
public class TagihanListrik{

    public static void main( String [] args) {
        Scanner input = new Scanner(System.in);
        int tarif_perkWh = 1500;
        int bataskWh = 500 ;
        System.out.println("masukkan jumlah penggunaan listrik: ");
        
        int penggunaankwh= input.nextInt();
        boolean melebihibatas = penggunaankwh > tarif_perkWh;

        int totaltagihan = penggunaankwh * tarif_perkWh;

        System.out.println("total tagihan listrik: rp" + totaltagihan);
        System.out.println("pengumuman listrik melebihi batas : " + melebihibatas);


        
    }
}