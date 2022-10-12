import java.util.Scanner;

public class PassStatus {

    public static void main(String[]args){
        double math1,math2,phy1,phy2,chem1,chem2,bio1,bio2,art1,art2,his1,his2;
        Scanner abc=new Scanner(System.in);
        System.out.println("enter your first math grade : ");
        math1=abc.nextDouble();
        System.out.println("enter your second math grade : ");
        math2=abc.nextDouble();
        System.out.println("enter your first physics grade : ");
        phy1=abc.nextDouble();
        System.out.println("enter your second physics grade : ");
        phy2=abc.nextDouble();
        System.out.println("enter your first chemistry grade : ");
        chem1=abc.nextDouble();
        System.out.println("enter your second chemistry grade : ");
        chem2=abc.nextDouble();
        System.out.println("enter your first biology grade : ");
        bio1=abc.nextDouble();
        System.out.println("enter your second biology grade : ");
        bio2=abc.nextDouble();
        System.out.println("enter your first art grade : ");
        art1=abc.nextDouble();
        System.out.println("enter your second art grade : ");
        art2=abc.nextDouble();
        System.out.println("enter your first history grade : ");
        his1=abc.nextDouble();
        System.out.println("enter your second history grade : ");
        his2=abc.nextDouble();
        double math,physics,chemistry,biology,art,history;
        math=(math1+math2)/2;
        physics=(phy1+phy2)/2;
        chemistry=(chem1+chem2)/2;
        biology=(bio1+bio2)/2;
        art=(art1+art2)/2;
        history=(his1+his2)/2;
        double total=(math+physics+chemistry+biology+art+history)/6;
        if (total>=55){
            System.out.println("Succesful!You passed the class.");
        }else{
            System.out.println("Unsuccessful!You could not pass the class.");
        }

    }

}
