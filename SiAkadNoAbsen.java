import java.util.Scanner;

public class SiAkadNoAbsen{

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String  Nama,NIM,Kelas;
        byte  Absen ;
        double NilaiKuis,NilaiTugas,NilaiUjian,NilaiAkhir,NilaiUAS;
        System.out.print("Masukkan Nama: ");
        Nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        NIM = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        Kelas = sc.nextLine();
        System.out.print("Masukkan No Absen: ");
        Absen = sc.nextByte();
        System.out.print("Masukkan  Nilai Kuis: ");
        NilaiKuis = sc.nextDouble();
        System.out.print("Masukkan  Nilai Tugas: ");
        NilaiTugas = sc.nextDouble();
        System.out.print("Masukkan  Nilai Ujian: ");
        NilaiUjian = sc.nextDouble();
        System.out.print("Masukkan  Nilai UAS: ");
        NilaiUAS = sc.nextDouble();
        System.out.println("Masukkan  Nilai Akhir: ");
        NilaiAkhir = (NilaiKuis * 0.20)+(NilaiTugas * 0.15)+(NilaiUjian * 0.30)+(NilaiUAS * 0.35);
        
        System.out.println("nama: " + Nama + "NIM: " + NIM);
        System.out.println("Kelas: " + Kelas +  "Absen: " + Absen);
        System.out.println("Nilai Akhir: " + NilaiAkhir);
    }
}