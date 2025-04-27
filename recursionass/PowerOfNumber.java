package recursionass;

public class PowerOfNumber {
	static int power(int base, int exp) {
        if (exp == 0)
            return 1;
        return base * power(base, exp - 1);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Power: " + power(2, 3));
	}

}
