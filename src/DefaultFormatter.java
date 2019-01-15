public class DefaultFormatter implements NumberFormatter
{
	public String format (int numberInput)
	{
		String number = ""+numberInput;
		String newString = "";
		for (int i = number.length()-1; i>0; i--)
		{
			int place = 0;
			if (place % 3 == 0 && i>0)
				newString += ",";
			else
				newString += numberInput.get(i);
		}
		String finalString = "";
		for (int i = newString.length()-1; i>0; i--)
		{
			finalString += newString.charAt(i);
		}
		return finalString;
	}
}
