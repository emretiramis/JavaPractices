import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);

            double a,b,c;
            System.out.println("Write the measure of side a : ");
            a=abc.nextDouble();
            System.out.println("Write the measure of side b : ");
            b=abc.nextDouble();

            c=Math.sqrt((a*a)+(b*b));

        System.out.println(c);


    }
}