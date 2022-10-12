import java.util.Scanner;

public class FlightTicketPrice {
    public static void main(String[] args) {
        double km,age,type;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the kilometer : ");
        km=scanner.nextDouble();
        km=km*0.1;

        System.out.println("Please enter your age : ");
        age=scanner.nextDouble();
        System.out.println("Choose your type number : 1-One way 2-Round trip ");
        type=scanner.nextDouble();

        if (type==1){
            if (age<=12){
                km-=km*50/100;
                System.out.println("Your ticket price is "+km);
            } else if (12<age && age<=24) {
                km-=km*10/100;
                System.out.println("Your ticket price is "+km);
            } else if (age>=65) {
                km-=km*30/100;
                System.out.println("Your ticket price is "+km);
            }else{
                System.out.println("Your ticket price is "+km);
            }
        } else if (type==2) {
            if (age<=12){
                km-=(km*50/100)+(km*20/100);
                System.out.println("Your ticket price is "+km);
            } else if (12<age && age<=24) {
                km-=(km*10/100)+(km*20/100);
                System.out.println("Your ticket price is "+km);
            } else if (age>=65) {
                km-=(km*30/100)+(km*20/100);
                System.out.println("Your ticket price is "+km);
            }else{
                km-=km*20/100;
                System.out.println("Your ticket price is "+km);
            }
            } else if (type!=1&&type!=2) {

            System.out.println("You entered the wrong number!");
        }


    }


    }
