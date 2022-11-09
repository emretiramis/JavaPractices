import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num=scanner.nextInt();
        int total=0;

        for (int i=1;i<num;i++){

            if (num%i==0)
                total+=i;

        }
        if (total==num){
            System.out.println(num+" is a perfect number.");
        }else{
            System.out.println(num+" is not a perfect number.");
        }

    }
}
