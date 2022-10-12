import java.util.Scanner;

public class NumberArrangement {
    public static void main(String[] args) {

       double n1,n2,n3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        n1=scanner.nextDouble();
        System.out.println("Please enter the second number : ");
        n2=scanner.nextDouble();
        System.out.println("Please enter the third number : ");
        n3=scanner.nextDouble();

        if (n1>n2&&n1>n3){
            if (n2>n3){
                System.out.println(n1+">"+n2+">"+n3);
            }else{
                System.out.println(n1+">"+n3+">"+n2);
            }
        } else if (n2>n1&&n2>n3) {
            if (n1>n3){
                System.out.println(n2+">"+n1+">"+n3);
            }else{
                System.out.println(n2+">"+n3+">"+n1);
            }
        }else{
            if (n2>n1){
                System.out.println(n3+">"+n2+">"+n1);
            }else{
                System.out.println(n3+">"+n1+">"+n2);
            }
        }


    }
}