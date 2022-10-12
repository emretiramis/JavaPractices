import java.util.Scanner;

public class Circle {
    public static void main(String[]args){

        double r,area,perimeter;
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter the radius : ");
        r= abc.nextDouble();
        area=r*r*3.14;
        perimeter=2*3.14*r;
        System.out.println("The area of cirle : "+area);
        System.out.println("The perimeter of circle : "+perimeter);

    }
}
