import java.util.Scanner;
public class Main{
    public static void Main(String []args){
        Scanner ensyu =new Scanner(System.in);
        double sin,tai,bmi;
        sin=ensyu.nextDouble();
        tai=ensyu.nextDouble();
        bmi=tai/sin/sin;
        bmi=((double)Math.round(bmi * 10))/10;
        System.out.println(bmi);

    }

}




