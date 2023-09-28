/**
 *
 * PemilihanPercobaan106
 */
import java.util.Scanner;
public class PemilihanPercobaan106 {
    public static void main (String[]args){
        Scanner input06 = new Scanner (System.in);

        System.out.print("Masukkan Angka :  ");
        int angka = input06.nextInt();

        if (angka > 0)
        System.out.println ("Angka " +angka+ " bilangan Positif ");
        else
        System.out.println ("Angka " +angka+ " bilangan Negatif ");
    }
}