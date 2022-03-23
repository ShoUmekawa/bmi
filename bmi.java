import java.util.Scanner;
public class Main{
    public static void Main(String []args){
        Scanner ensyu =new Scanner(System.in);
        double sin,tai,bmi;
        for(int i=0; i<=1; i++){
        sin=ensyu.nextDouble();
        tai=ensyu.nextDouble();
        bmi=tai/sin/sin;
        bmi=((double)Math.round(bmi * 10))/10;
        System.out.println(bmi);
        }
    }

}




