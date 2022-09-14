/*5) WAM to test whether a given string is a palindrome.*/
public class L9P5
{
	public static void main(String[] args)
	{
		String str="aba";
		String rev="";
		int len=str.length();
		for(int i=(len-1);i>=0;--i)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Original String: "+str);
		System.out.println("Reversed String: "+rev);
		if(str.equals(rev))
			System.out.println("IT IS A PALINDROME");
		else
			System.out.println("IT IS NOT A PALINDROME");
	}
}