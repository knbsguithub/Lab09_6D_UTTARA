/*10) WAM to accept a string as input and return only unique characters in
it (non-repeating) in an array. (commonly asked programming question)”*/

public class L9P10
{
	public static void main(String[] args)
	{
		String str = "PLAYBOLD RCB";
		System.out.println(str);
		for (int i = 0; i < str.length(); i++)
		{
			int flag = 0;
			for (int j = 0; j < str.length(); j++)
			{
				if (str.charAt(i) == str.charAt(j) && i != j)
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				System.out.println(str.charAt(i));
		}
	}
}
 