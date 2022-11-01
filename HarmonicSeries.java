import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        double total=0,num=scanner.nextInt();


        for (double i=1;i<=num;i++){

            total+=1/i;

        }
        System.out.print(total);
    }
}
