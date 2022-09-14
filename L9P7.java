/*7) WAM to reverse a given string and use this method to a) find
whether a string is a palindrome b) reverse each word in a sentence
(commonly asked programming question)

Do the reversing of the string in 3 ways - a) using concat by reading
each char from end b) using StringBuilder class c) swapping chars in the
char array using xor.
*/

public class L9P7
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
		System.out.println();
		System.out.println("Original String: "+str);
		System.out.println("Reversed String: "+rev);
		if(str.equals(rev))
			System.out.println("IT IS A PALINDROME");
		else
			System.out.println("IT IS NOT A PALINDROME"); //without reverse
		
		System.out.println();
		String str1 = new String("kitik");
		StringBuffer sb=new StringBuffer(str1);
		sb.reverse();
		String sb1 = sb.toString();
		if(str1.equals(sb1))
			System.out.println("IT IS A PALINDROME");
		else
			System.out.println("IT IS NOT A PALINDROME");//with reverse
			
		System.out.println();
		String s1="GARA GARA GARA GAGARA JARBA PIRA NAL KURI NETHARA PARBHA";
		String[] arr=s1.split(" ");
		for(int i=(arr.length-1);i>=0;i--)
			System.out.print(arr[i]+" ");
		System.out.println();//words in the sentence reverse
	}
}