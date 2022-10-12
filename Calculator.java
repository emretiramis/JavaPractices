import java.util.Scanner;

public class Calculator {

    public static void main(String[]args){

        int n1,n2,select;
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        n1=abc.nextInt();
        System.out.println("Please enter the second number : ");
        n2=abc.nextInt();
        System.out.println("1-addition\n2-subtraction\n3-multiplication\n4-division");
        select=abc.nextInt();

        switch (select){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                if (n2==0){
                    System.out.println("no number is divisible by 0.");
                }else{
                    System.out.println(n1/n2);
                }
                break;
            default:
                System.out.println("transaction type code is incorrect");
        }






    }

}
