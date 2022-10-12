import java.util.Scanner;

public class GroceryCashierProgram{

    public static void main(String[]args){

        double apple,pear,banana,tomato,aubergine,total;
        Scanner abc=new Scanner(System.in);
        System.out.print("Please enter the kilogram of the apple : ");
        apple=abc.nextDouble();
        System.out.print("Please enter the kilogram of the pear : ");
        pear=abc.nextDouble();
        System.out.print("Please enter the kilogram of the banana : ");
        banana=abc.nextDouble();
        System.out.print("Please enter the kilogram of the tomato : ");
        tomato=abc.nextDouble();
        System.out.print("Please enter the kilogram of the aubergine : ");
        aubergine=abc.nextDouble();
        total=apple*3.67+pear*2.14+banana*0.95+tomato*1.11+aubergine*5;
        System.out.println("total fee : "+total);


    }

}
