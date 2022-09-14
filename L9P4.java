/*4) WAM to swap first and last chars of a passed string and return it.
 char at length-1 + substring from 1, length-1 + char at 0
str.charAt(str.length()-1) + str.substr(1,str.length()-1) +str.charAt(0)*/

public class L9P4
{
	public static void main(String[] args)
	{	
		String str = new String("BRAMHARAKSHASA");
		//String a = str.substring(1,str.length()-1);
		//String res=str.charAt(str.length()-1) + a +str.charAt(0);
		
		String res = str.charAt(str.length()-1) + str.substring(1,(str.length()-1)) +str.charAt(0);
		System.out.println(res);
	}
}