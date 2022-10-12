import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {


        int day,month;
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the day you were born : ");
        day=scanner.nextInt();
        System.out.print("Enter what month you were born : ");
        month=scanner.nextInt();

        switch (month){
            case 1:
                if (day>=22){
                    System.out.println("Your zodiac sign is Aquarius");
                }else{
                    System.out.println("Your zodiac sign is Capricorn");
                }
                break;
            case 2:
                if (day>=20){
                    System.out.println("Your zodiac sign is Pisces");
                }else{
                    System.out.println("Your zodiac sign is Aquarius");
                }
                break;
            case 3:
                if (day>=21){
                    System.out.println("Your zodiac sign is Aries");
                }else{
                    System.out.println("Your zodiac sign is Pisces");
                }
                break;
            case  4:
                if (day>=21){
                    System.out.println("Your zodiac sign is Taurus");
                }else{
                    System.out.println("Your zodiac sign is Aries");
                }
                break;
            case 5:
                if (day>=22){
                    System.out.println("Your zodiac sign is Gemini");
                }else{
                    System.out.println("Your zodiac sign is Taurus");
                }
                break;
            case 6:
                if (day>=23){
                    System.out.println("Your zodiac sign is Cancer");
                }else{
                    System.out.println("Your zodiac sign is Gemini");
                }
                break;
            case 7:
                if (day>=23){
                    System.out.println("Your zodiac sign is Leo");
                }else{
                    System.out.println("Your zodiac sign is Cancer");
                }
                break;
            case 8:
                if (day>=23){
                    System.out.println("Your zodiac sign is Virgo");
                }else{
                    System.out.println("Your zodiac sign is Leo");
                }
                break;
            case 9:
                if (day>=23){
                    System.out.println("Your zodiac sign is Libra");
                }else{
                    System.out.println("Your zodiac sign is Virgo");
                }
                break;
            case 10:
                if (day>=23){
                    System.out.println("Your zodiac sign is Scorpio");
                }else{
                    System.out.println("Your zodiac sign is Libra");
                }
                break;
            case 11:
                if (day>=22){
                    System.out.println("Your zodiac sign is Sagittarius");
                }else{
                    System.out.println("Your zodiac sign is Scorpio");
                }
                break;
            case 12:
                if (day>=22){
                    System.out.println("Your zodiac sign is Capricorn");
                }else{
                    System.out.println("Your zodiac sign is Sagittarius");
                }
                break;
            default:
                System.out.println("You enter the wrong day or month!");
                break;
        }
    }
}