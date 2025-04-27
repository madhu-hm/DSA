package recursionass;

public class SumOfDigits {
	
	static int sumDigits(int number) {
        if (number == 0)
            return 0;
        return number % 10 + sumDigits(number / 10);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum of digits: " + sumDigits(1234));
	}

}
