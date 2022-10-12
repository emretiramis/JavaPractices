import java.util.Scanner;

public class LeapYearCalculation {
    public static void main(String[] args) {
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a year : ");
        year=scanner.nextInt();


        if (year%4==0){
            System.out.println(year+" is a leap year.");
        }else{
            System.out.println(year+" is not a leap year.");
        }
    }
}