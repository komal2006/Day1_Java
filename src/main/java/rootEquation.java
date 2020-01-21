import java.util.*;
public class rootEquation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
      int a, b, c;
      double x1 = 0, x2 = 0;
        System.out.println("Enter the a");
        a=sc.nextInt();
        System.out.println("Enter the b");
        b=sc.nextInt();
        System.out.println("Enter the c");
        c=sc.nextInt();

        int d = (b*b)-(4*a*c);
        if(d>=0){
         //  x1=x2=-1*b;
       // else if(d>0)
       // {
            x1=(-b-Math.sqrt(d))/(2*a);
            x2=(-b+Math.sqrt(d))/(2*a);
        }
       else
            System.out.println("Imaginary roots");
       System.out.println("x1: " + x1 + "\nx2: " + x2);

    }
}
