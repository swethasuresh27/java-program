package homework;

public class SumOfDigits {
public void Sum(int n) {
	int rem,sum=0;
	while (n>0)
	{
		rem=n%10;
		sum=sum+rem;
		n=n/10;
		
	}
	System.out.println(sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SumOfDigits dig=new SumOfDigits();
dig.Sum(123);
	}
}
        