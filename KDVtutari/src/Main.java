import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, KdvOran = 0.18;
        Scanner abc=new Scanner(System.in);
        System.out.print("tutari giriniz : ");
        tutar=abc.nextDouble();
        double kdvlifiyat= tutar+tutar*KdvOran;
        double Kdvfiyati=tutar*KdvOran;
        System.out.println("kDV'siz fiyat : "+tutar);
        System.out.println("KDV'li fiyat  : "+kdvlifiyat);
        System.out.println("KDV fiyati : "+Kdvfiyati);
        System.out.println("kdv orani : "+ KdvOran);

    }
}