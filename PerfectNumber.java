// Java program to check if a given number is perfect or not
import java.util.Scanner;

public class PerfectNumber
{

    // Returns true if n is perfect
    static boolean isPerfect(int n)
    {
        // To store sum of divisors
        int sum = 1;

        // Find all divisors and add them
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i==0)
            {
                if(i * i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;
            }
        }
        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == n && n != 1)
            return true;

        return false;
    }

    // Driver program
    public static void main (String[] args)
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        if (isPerfect(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
