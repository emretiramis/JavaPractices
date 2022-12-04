import java.util.Scanner;

public class MaxMin {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("How many numbers will you enter :");
        int num=scanner.nextInt();
        int questionnum=1;
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;


        while (questionnum<=num){
            System.out.print("Enter the "+questionnum+". number :");
            int num2=scanner.nextInt();

            if (num2>max)max=num2;
            if (num2<min)min=num2;

            questionnum++;
        }

        System.out.print("Highest number is :"+max);
        System.out.println();
        System.out.print("Smallest number is :"+min);

    }
}
