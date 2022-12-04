import java.util.Scanner;

public class PalindromeNumber {


    public static boolean isPalindrome(int number){

       int temp=number,lastdigit,reversenumber=0;

       while (temp!=0){

           lastdigit=temp%10;
           reversenumber=(10*reversenumber)+lastdigit;
           temp/=10;

       }
        if (reversenumber==number)
            System.out.print(number+" is palindrome");
        else
            System.out.print(number+" is not palindrome");



        return true;
    }



    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=scanner.nextInt();

        isPalindrome(num);
    }

}
