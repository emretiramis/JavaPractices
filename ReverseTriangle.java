import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scanner.nextInt();
        int temp=n;

        for (int i=1;i<=n;i++){

            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }

           for (int k=(2*temp-1);k>=1;k--){
               System.out.print("*");


           }
            System.out.println();
            temp--;
        }

    }
}