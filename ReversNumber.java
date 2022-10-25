import java.util.Scanner;

public class ReversNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num=scanner.nextInt();
        int num1;
        while (num>0){
          num1=num%10;
            System.out.print(num1);
            num/=10;
        }
    }
}
