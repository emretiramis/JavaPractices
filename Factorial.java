import java.util.Scanner;

public class Factorial {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        int x;
        int z=1;
        System.out.print("Enter the number whose factorial you want to find : ");
        x=scanner.nextInt();

        for (int y=1;y<=x;y++){
            z*=y;
        }
        System.out.println("factorial result : "+z);
    }
}
