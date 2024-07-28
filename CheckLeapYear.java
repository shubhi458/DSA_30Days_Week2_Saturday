//Java program to check whether the given year
// is a leap year or not

import java.time.Year;
import java.util.Scanner;

class CheckLeapYear {

    //returns true if the given year is a leap year.
    public static boolean checkYear(int year){
        Year y = Year.of(year); //create a Year object of given year
        return y.isLeap();
    }

    //Driver Code
    public static void main (String[] args) {
        int year;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year:");
        year=sc.nextInt();
        if(checkYear(year)){  //function call
            System.out.println("Leap Year");
        }else{
            System.out.println("Non Leap Year");
        }
    }
}
