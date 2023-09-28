import java.util.Scanner;
public class PemilihanPercobaan306 {
public static void main (String[]args){
    double angka1, angka2, hasil;
    char operator;

    Scanner input06 = new Scanner (System.in);

    System.out.print("Masukkan Angka pertama : ");
    angka1 = input06.nextDouble();
    System.out.print("Masukkan Kedua : ");
    angka2 = input06.nextDouble();
    System.out.print("Masukkan Operator ( + - * / ) : ");
    operator = input06.next().charAt(0);

    switch (operator) {
        case '+' :
        hasil =angka1 + angka2;
        System.out.println (angka1 + "+" + angka2 + "=" + hasil);
        case '-' :
        hasil =angka1 - angka2;
        System.out.println (angka1 + "-" + angka2 + "=" + hasil);
        break;
        case '*' :
        hasil =angka1 * angka2;
        System.out.println (angka1 + "*" + angka2 + "=" + hasil);
        break;
        case '/' :
        hasil =angka1 / angka2;
        System.out.println (angka1 + "/" + angka2 + "=" + hasil);
        break;
    }
}
}
