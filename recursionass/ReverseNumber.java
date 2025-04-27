package recursionass;

public class ReverseNumber {
	
	 static int reverse(int number, int result) {
	        if (number == 0)
	            return result;
	        return reverse(number / 10, result * 10 + number % 10);
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
        int reversed = reverse(num, 0);
        System.out.println("Reversed: " + reversed); 
	}

}
