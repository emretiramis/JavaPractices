import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        double degree;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the temperature : ");
        degree=scanner.nextDouble();
        if(degree<=5){
            System.out.println("You can ski!");
        } else if (degree>5&&degree<=10) {
            System.out.println("You can go to the cinema!");
        } else if (degree>10&&degree<=15) {
            System.out.println("You can go to the cinema!");
            System.out.println("You can go to the picnic!");
        } else if (degree>15&&degree<=25) {
            System.out.println("You can go to the picnic!");
        } else{
            System.out.println("You can swim!");
        }


    }
}