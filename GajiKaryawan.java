import java.util.Scanner;

public class GajiKaryawan{

    public static void main (String [] args){

        Scanner gaji = new Scanner(System.in);
        int jmljam,upah,gajiakhir,gajiawal,bonus,pajak;

        System.out.println("masukkan jumlah jam kerja anda: ");
        jmljam = gaji.nextInt();
        System.out.println("masukkan upah per jam: ");
        upah =gaji.nextInt();
        System.out.println("bonus 10%");
        System.out.println("pajak 5%");




        gajiawal = upah*jmljam;
        bonus = gajiawal * 10/100;
        pajak = gajiawal * 5/100;
        gajiakhir = (gajiawal + bonus - pajak ) *30;
        //(gajiawal * 10/100)) - (gajiawal*5/100)
        System.out.println("gaji akhir anda adalah rp:" + gajiakhir);
    }
}