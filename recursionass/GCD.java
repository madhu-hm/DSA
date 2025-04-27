package recursionass;

public class GCD {
	static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GCD: " + gcd(36, 60));
	}

}
