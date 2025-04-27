package recursionass;

public class DecimalToBinary {
	static void toBinary(int number) {
        if (number == 0)
            return;
        toBinary(number / 2);
        System.out.print(number % 2);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toBinary(13);
	}

}
