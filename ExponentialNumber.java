import java.util.Scanner;

public class ExponentialNumber {

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int x,y;
        System.out.print("Enter the number : ");
        x=scanner.nextInt();
        System.out.print("enter the power of the number : ");
        y=scanner.nextInt();
        int total=1;
        for (int z=1;z<=y;z++){
            total*=x;
        }
        System.out.print("conclusion : "+total);
    }


}
