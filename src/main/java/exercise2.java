import  java.util.*;
public class exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double price;
        int quantity;
        double discount;
        double tax = 13.00;
        System.out.println("Enter the price");
        price=sc.nextDouble();
        System.out.println("Enter the quantity");
        quantity=sc.nextInt();
        double totalAmount=price*quantity;
        System.out.println("Total Price " + totalAmount);
        if(quantity>15)
        {
            discount = 7;
            double d = (totalAmount*discount)/100;
            System.out.println("discount=" + d);
            System.out.println(" Price after discount = " + (totalAmount-d));

        }
        System.out.println("Amount including tax = " + (totalAmount+(totalAmount*tax)/100));
    }
}

