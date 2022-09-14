/*2) Create 2 strings as literals with same state and check this:
String s1 = "abc";
String s2 = "abc";
System.out.println(s1==s2);
Then create a string object using String s3 = new String("abc") and 
check s1 == s3. Why are you getting true and false as result? Do you 
understand?
Now check s1.equals(s3) and print the result. What are you getting and 
why?.*/

public class L9P2
{
	public static void main(String[] args)
	{
		String s1="abc";
		String s2="abc";
		
		System.out.println(s1==s2);
		
		String s3 = new String("abc");
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}
}