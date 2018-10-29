
public class ArrayPracticeMain {

	public static void main(String[] args) 
	{
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		
		int[] array = new int[13];
		
		for ( int i = 2; i < 13; i++ ) 
		{
			array[i] = 0;
			
		}
		
		for (int k = 0; k < 1000; k++) 
		{
			int roll1 = die1.roll();
			int roll2 = die2.roll();
			
			int sum = roll1 + roll2;
			
			array[sum]++;
		}
		
		for ( int i = 2; i < 13; i++ ) 
		{
			System.out.println("" +i + ": "+ array[i]);
		}
		

	}

}
