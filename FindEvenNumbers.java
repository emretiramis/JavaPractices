import java.util.Scanner;
public class FindEvenNumbers {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        int x;
        System.out.print("Please enter the number : ");
        x=scanner.nextInt();
        for (int y=0;y<x;y++){
            if (y%2==0){
                System.out.println(y);
            }
        }
    }
}
