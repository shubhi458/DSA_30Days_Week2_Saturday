//Java program to check whether the given salary is a Dream Package or not

import java.util.Scanner;

class DreamPackage {
    public static void main (String[] args) {
        int salary;
        int minimumSalary=500000;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the salary:");
        salary=sc.nextInt();
        if(salary<=minimumSalary)
            System.out.println("NOTDREAM");
        else
            System.out.println("DREAM");
    }
}
