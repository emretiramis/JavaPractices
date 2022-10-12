import java.util.Scanner;

public class UserLogin {
    public static void main(String[]args){
        String username,password;
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter your username : ");
        username=abc.nextLine();
        System.out.println("Please enter your password : ");
        password=abc.nextLine();
        if (username.equals("user") && password.equals("java123")){
            System.out.println("Successful!");
        }else {
            System.out.println("Wrong username or password!");
        }

    }
}
