import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        double age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year you were born : ");
        age=scanner.nextDouble();

        if (age%12==0){
            System.out.println("Your chinese zodiac is Monkey");
        } else if (age%12==1) {
            System.out.println("Your chinese zodiac is cockerel");
        } else if (age%12==2) {
            System.out.println("Your chinese zodiac is dog");
        }else if (age%12==3) {
            System.out.println("Your chinese zodiac is pig");
        }else if (age%12==4) {
            System.out.println("Your chinese zodiac is mouse");
        }else if (age%12==5) {
            System.out.println("Your chinese zodiac is ox");
        }else if (age%12==6) {
            System.out.println("Your chinese zodiac is tiger");
        }else if (age%12==7) {
            System.out.println("Your chinese zodiac is rabbit");
        }else if (age%12==8) {
            System.out.println("Your chinese zodiac is dragon");
        }else if (age%12==9) {
            System.out.println("Your chinese zodiac is snake");
        }else if (age%12==10) {
            System.out.println("Your chinese zodiac is horse");
        }else if (age%12==11) {
            System.out.println("Your chinese zodiac is sheep");
        }


    }
}