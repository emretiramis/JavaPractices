import java.util.Scanner;

public class Random {

    public static void main(String[]args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Exponent of two : ");
        int digit=scanner.nextInt();

        for (int i=1;i<=digit;i++){
            for (int k=1;k<=(digit-i); k++){
                System.out.print(" ");
            }

            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
