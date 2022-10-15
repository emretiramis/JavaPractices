import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        int x,total=0;
        System.out.print("Please enter the number : ");
        x=scanner.nextInt();
        for (int y=0;y<=x;y++){
            if (y%2!=0){
                total+=y;
                System.out.println(total);
            }
        }
    }



}
