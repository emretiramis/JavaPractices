import java.util.Scanner;

public class Assignment3 {

    public static boolean check(String str1,String str2){

        int firstcounter=0,secondcounter=0;

        for (int i=0;i<str1.length();i++){
            firstcounter++;
        }

        for (int i=0;i<str2.length();i++){
            secondcounter++;
        }



        if (firstcounter==secondcounter){
            for (int i=0;i<firstcounter;i++){

            }
            return true;
        }



        return false;
    }


    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the first String :");
        String firststr=scanner.nextLine();

        System.out.print("Enter the second String :");
        String secondstr=scanner.nextLine();

        System.out.println(check(firststr,secondstr));
    }
}
