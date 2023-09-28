/**
 * PemilihanPercobaan206
 */
import java.util.Scanner;
public class PemilihanPercobaan206 {
    public static void main (String[]args){
        Scanner input06 = new Scanner (System.in);

        System.out.println ("Nilai UAS : ");
        float uas = input06.nextFloat();

        System.out.println ("Nilai UTS : ");
        float uts = input06.nextFloat();

        System.out.println ("Nilai KUIS : ");
        float kuis = input06.nextFloat();

        System.out.println ("Nilai TUGAS : ");
        float tugas = input06.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (uas * 0.2F);
        if (total > 80  )
        System.out.println ("Nilai Akhir " +total+ " nilai huruf A Sangat Baik ");
        else if (total > 73)
        System.out.println ("Nilai Akhir " +total+ " nilai huruf B+ Lebih dari Baik");
        else if (total > 65)
        System.out.println ("Nilai Akhir " +total+ " nilai huruf B Baik");
        else if (total > 60)
        System.out.println ("Nilai Akhir " +total+ " nilai huruf C+ Lebih dari Cukup");
        else if (total > 50)
        System.out.println ("Nilai Akhir " +total+ " nilai huruf C Cukup");
        else if (total > 39)
        System.out.println ("Nilai Akhir " +total+ " nilai huruf D Kurang");
        else
        System.out.println ("Nilai Akhir " +total+ " nilai huruf E Gagal");
    }
}