import java.util.Scanner;

public class TaximeterFee {
    public static void main(String[]args){
        double a,b=10,total;
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter the kilometers : ");
        a=abc.nextDouble();
        total=a*2.2+b;
        if (total<=20){
            System.out.println("The fee you have to pay : 20");
        }else if(total>20){
            System.out.println("The fee you have to pay : "+total);
        }
    }
}
