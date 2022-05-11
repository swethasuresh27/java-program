package homework;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 23;
		    boolean flag = false;
		    for (int i = 2; i <= n / 2; ++i) {
		      if (n % i == 0) {
		        flag = true;
		        break; 
	}
		 }
if (flag)
 System.out.println(n + " is a prime number.");
 else
System.out.println(n + " is not a prime number.");
		    }
		       }

	  