
import java.util.Scanner;

public class LcmAndGcd {
    public static void main(String[] args) {
        /*LCM stands for least common multiple.  LCM of two numbers is smaller value that is divisible by
        both the two numbers. Whereas GCD is the highest common factor of two numbers, that can divide
        the two numbers evenly.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = scanner.nextInt();
        int lcm, gcd = 1;

        if (num1 < num2) {
            for (int i = 1; i <= num1; i++) {

                if (num1%i==0 && num2%i==0){
                    gcd=i;
                }

            }

            System.out.println("GCD is = "+gcd);
        }else{
            for (int j=1;j<=num2;j++){
                if (num1%j==0&&num2%j==0){
                    gcd=j;
                }
            }
            System.out.println("GCD is = "+gcd);
        }


    lcm=(num1*num2)/gcd;
        System.out.println("LCM is = "+lcm);




    }

}







