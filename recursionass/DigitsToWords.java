package recursionass;

public class DigitsToWords {
	
	static void conversion(int number) {
		String[]words= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		if(number==0) {
			return;
		}
		conversion(number/10);
		System.out.print(words[number%10]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conversion(01);
	}

}
