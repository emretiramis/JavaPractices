import java.util.Scanner;

public class AtmProject {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);


        int chance=3;
        int select;
        int price;
        int pocket=10000;
        while (chance>0){

            System.out.print("Enter your username : ");
            String userName=scanner.nextLine();
            System.out.print("Enter your Password : ");
            String Password=scanner.nextLine();

            if (userName.equals("user") && Password.equals("user")) {

                System.out.println("Welcome to Bank Bank!");

                do {
                    System.out.println("Choose what you want : \n 1-withdraw money \n 2-getting money \n 3-Balance Inquiry \n 4-log out");
                    select = scanner.nextInt();
                    if (select==1){
                        System.out.println("Enter how much that you want to withdraw : ");
                        price=scanner.nextInt();
                        if (price>pocket){
                            System.out.println("You don't have as much money in your account as you want to withdraw");
                        }else {
                            pocket -= price;}
                        System.out.println("balance on your card : "+pocket);
                    } else if (select==2) {
                        System.out.println("Enter how much that you want to getting : ");
                        price=scanner.nextInt();
                        pocket+=price;
                        System.out.println("balance on your card : "+pocket);
                    } else if (select==3) {
                        System.out.println("your pocket is : "+pocket);
                    }
                }while (select!=4);
                break;
            }else{
                chance--;
                if (chance==0){
                    System.out.println("The Information that you give is not correct.Your card was blocked!");
                    break;
                }else {
                    System.out.println("The Information that you give is not correct.Please enter again. ");
                    System.out.println("your remaining right = "+chance);
                }
            }


        }


    }
}
