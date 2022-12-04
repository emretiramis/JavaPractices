public class PrimeNumber {
    public static void main(String[]args){

        int i,j=1,total=0;


        for ( i=2;i<=100;i++){

        while (j<=i){
            if (i%j==0){
                total++;

            }

            j++;
        }

        if (total==2){
            System.out.print(i+",");
        }

        total=0;
        j=1;
        }
    }
}
