import java.util.*;
public class salaryCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double annualSalary, tax, monthlySalary, biweeklySalary;
       System.out.println("enter Annual Salary:");
       annualSalary = sc.nextDouble();    //the reading statement
//       if(annualSalary<60000)     //annual salary without tax
//       {
//           System.out.println("No Tax");
//           System.out.println("Annual Salary after Tax:" + annualSalary);
//       }else if(annualSalary>60000 && annualSalary<85000)     //annual salary with 18% tax
//       {
//           tax = (annualSalary * 18)/100;
//           System.out.println("You will have to pay 18% tax");
//           annualSalary = annualSalary - tax;
//           System.out.println("Annual Salary after Tax:" + annualSalary);
//       }else {
//           //annual salary with 26% tax
//           tax = (annualSalary * 26)/100;
//           System.out.println("You will have to pay 26% tax");
//           annualSalary = annualSalary - tax;
//           System.out.println("Annual Salary after Tax:" + annualSalary);
//       }
        if(annualSalary>85000)
            tax=0.26;
        else if(annualSalary>60000)
            tax=0.18;
        else
            tax=0;
        annualSalary=annualSalary-tax*annualSalary;
       monthlySalary = annualSalary / 12;  //calculate monthly salary
        System.out.println("Monthly Salary after Tax:" + monthlySalary);
        biweeklySalary = annualSalary /26;   // calculate bi-weekly salary
        System.out.println("Biweekly Salary after Tax:" + biweeklySalary);
    }
}

