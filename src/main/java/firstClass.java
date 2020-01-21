import java.util.*;//this is important for reading from keyboard
public class firstClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //this is important for reading from keyboard
        int firstNumber, secondNumber, thirdNumber;
        System.out.println("Enter the first number");
        firstNumber=sc.nextInt();         //the reading statement
        System.out.println("Enter the second number");
        secondNumber=sc.nextInt();
        System.out.println("Enter the third number");
        thirdNumber=sc.nextInt();
        int total=firstNumber+secondNumber+thirdNumber;
        int avg = total/3;
        System.out.println("The average is " + avg);

    }
}
