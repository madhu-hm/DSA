package recursionass;

public class SumSeries {
	static int sumToN(int n) {
        if (n == 1)
            return 1;
        return n + sumToN(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sumToN(10));  
    }
}
