import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int x;
        System.out.println("Please enter the number : ");
        x=scanner.nextInt();
        for (int i=1;i<x;i*=2){
            System.out.println(i);
        }
    }
}
