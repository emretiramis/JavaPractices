import java.util.Scanner;

public class CalculatorV2 {

    public static int collection(int num1,int num2){
        return num1+num2;
    }

    public static int minus(int num1, int num2){
        return num1-num2;
    }

    public static int multiple(int num1, int num2){
        return num1*num2;
    }

    public static int divided(int num1, int num2){
        if (num1==0&&num2==0){
            System.out.println("uncertain");
            return 0;
        } else if (num1!=0&&num2==0) {
            System.out.println("undefined");
            return 0;
        }
            return num1/num2;
    }

    public static int exponent(int num1, int num2){
        int result=1;
        for (int i=1;i<=num2;i++){
            result*=num1;
        }
        return result;
    }

    public static int factorial(int num1){
        int result=1;

        for (int i=1;i<=num1;i++){
            result*=i;
        }

        System.out.println(result);
        return result;
    }

    public static int mode(int num1, int num2){
        return num1%num2;
    }

    public static void rectangle(int num1,int num2){
        System.out.print("area of rectangle :"+num1*num2);
        System.out.println();
        System.out.print("perimeter of rectangle :"+2*(num1+num2));
        System.out.println();
    }



    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int select;
        String menu="1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);

        while(true){
            System.out.print("Select the action you want to do :");
            select=scanner.nextInt();

            if (select==0){
                break;
            }


            System.out.print("Enter the first number :");
            int num1=scanner.nextInt();
            System.out.println();
            System.out.print("Enter the second number :");
            int num2 = scanner.nextInt();


            switch (select){
                case 1:
                    System.out.println(collection(num1,num2));
                    break;
                case 2:
                    System.out.println(minus(num1,num2));
                    break;
                case 3:
                    System.out.println(multiple(num1,num2));
                    break;
                case 4:
                    System.out.println(divided(num1,num2));
                    break;
                case 5:
                    System.out.println(exponent(num1,num2));
                    break;
                case 6:
                    System.out.println(factorial(num1));
                    break;
                case 7:
                    System.out.println(mode(num1,num2));
                    break;
                case 8:
                    rectangle(num1,num2);
                    break;
                default:
                    System.out.println("non-valid keystroke");

            }

        }

    }
}
