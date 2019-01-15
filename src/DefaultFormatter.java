public class DefaultFormatter 
{
	public String format (int numberInput)
	{
		String number = ""+numberInput;
		String newString = "";
		for (int i = number.length()-1; i>0; i--)
		{
			int place = 0;
			if (place % 3 == 0)
				newString += ",";
			else
				newString += ;
		}
		return newString;
	}
}
