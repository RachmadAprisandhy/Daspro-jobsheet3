import java.util.Scanner;
public class Kafe19{

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        boolean Keanggotaan;
        int jmlKopi,jmlTeh,jmlRoti;
        double HargaKopi = 120000.0,HargaTeh = 7000.0, HargaRoti = 20000.0 ;
        double totalharga; 
        float diskon = 10 / 100;
        
        System.out.print("masukkan keanggotaan (true/false)");
        Keanggotaan = input.nextBoolean();
        System.out.print("masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
        totalharga = (jmlKopi  *  HargaKopi) + (jmlTeh  *  HargaTeh) + (jmlRoti  +  HargaRoti);
        double nominalbayar = totalharga + (diskon * totalharga);
        byte totalbyte = (byte) nominalbayar;
        int nominalint = (int) nominalbayar;
        

        System.out.println("Keanggotaan pelanggan: " + Keanggotaan);
        System.out.println("item pembelian: " + jmlKopi + "kopi" + jmlTeh + "teh" + jmlRoti + "roti");
        System.out.println("total harga Rp: " +totalharga);
        System.out.println("total harga byte: " + totalbyte);
        System.out.println("Nominal Bayar Rp: " + nominalbayar );
        System.out.println("Nominal Bayar (byte): " + nominalint);
        
        System.out.println("terimakasih sudah belanja ");
    }
}