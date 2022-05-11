package homework;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153, number, rem, z = 0;

        number = num;
       while (number != 0)
        {
            rem = number % 10;
            z = z + rem*rem*rem;
            number /= 10;
        }

        if(z == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
	}

}
