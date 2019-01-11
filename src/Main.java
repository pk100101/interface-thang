
public class Main 
{
	
	public static void main (String [] args)
	{
		Measurable [] myArr = new Measurable [15];
		for (int i = 0; i < 15; i++)
			myArr [i] = new BankAccount (Math.random()*4000+3000);
		System.out.println("Average balance: " + findAverage(myArr));
	}
	
	private static double findAverage (Measurable[] arr)
	{
		double total = 0;
		for (Measurable obj : arr)
		{
			total+=obj.getMeasure();
		}
		return total/arr.length;
	}
}
