import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int fibo=scanner.nextInt();

        int total,num1=0,num2=1;

        for (int i=1;i<=fibo;i++){

            System.out.print(num1+" , ");

            total=num1+num2;
            num1=num2;
            num2=total;

        }
    }
}