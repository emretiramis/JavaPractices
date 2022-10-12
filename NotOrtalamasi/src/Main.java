import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,tarih,turkce;
        Scanner abc= new Scanner(System.in);
        System.out.println("Lütfen matematik notunuzu giriniz : ");
        mat= abc.nextInt();
        System.out.println("Lütfen fizik notunuzu giriniz : ");
        fizik=abc.nextInt();
        System.out.println("Lütfen kimya notunuzu giriniz : ");
        kimya=abc.nextInt();
        System.out.println("Lütfen tarih notunuzu giriniz : ");
        tarih=abc.nextInt();
        System.out.println("Lütfen turkce notunuzu giriniz : ");
        turkce=abc.nextInt();
        int toplam=mat+fizik+kimya+tarih+turkce;
        double sonuc=toplam/5;
        System.out.println("Ortalamanız : "+sonuc);
    }
}