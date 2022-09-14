/*3) String s1 = "happynew”;
 s1.concat("year”);
 System.out.println(s1); // what is printed? why?*/

public class L9P3
{
	public static void main(String[] args)
	{
		String s1="happynew";
		//s1.concat("year"); the given question
		s1=s1.concat("year");//correction for getting output
		System.out.println(s1);
		
		StringBuilder sb = new StringBuilder();
		sb=sb.append("abc");
		System.out.println("Appended String: "+sb);
		
		sb=sb.reverse();
		System.out.println("Reversed String: "+sb);
		
		String s2=sb.toString();
		System.out.println("Converting StringBuffer to  String: "+s2);
		
		String sb1=s2.replace("cba","abd");
		System.out.println("Replaced String: "+sb1);
	}
}