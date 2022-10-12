import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[]args){

        double weight,height,total;

        Scanner abc=new Scanner(System.in);

        System.out.print("please enter the  weight(kg) : ");
        weight=abc.nextDouble();
        System.out.print("please enter the height(m) : ");
        height=abc.nextDouble();
        total=weight/(height*height);
        System.out.println(total);

    }

}
