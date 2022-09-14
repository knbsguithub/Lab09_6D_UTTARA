/*1) Write a main() program to test methods of string to perform the 
following (directly create a string in main() like String str = “abcdef”):*/

public class L9P1
{
	public static void main(String[] args)
	{
		String str="abcdef";
		int len1=str.length();
		
		System.out.println("LENGTH OF THE STRING:"+len1);//a
		System.out.println();
		
		System.out.println("PRINTING EACH CHARACTER OF STRING AT ONCE:");//b
		for(int i=0;i<len1;i++)
		{
			char c = str.charAt(i);
			System.out.print(c +" ");
		}
		System.out.println();
		
		System.out.println("\nCONVERTING STRING TO CHARACTER ARRAY....");//c
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println();
		
		str=str.toUpperCase();//d
		System.out.println("STRING CONVERTING TO UPPER CASE:"+str);
		str=str.toLowerCase();
		System.out.println();
		System.out.println("STRING CONVERTING TO LOWER CASE:"+str);
		System.out.println();
		
		String s1="abdef";//e
		int len2=s1.length();
		boolean res=s1.equals(str);
		System.out.println("ARE TWO STRING EQUAL:"+res);
		System.out.println();
		
		int sum1=0;//f
		for(int i=0;i<arr.length;i++)
			sum1=sum1+arr[i];
		System.out.println("str :"+sum1);
		
		char[] arr2 = s1.toCharArray();
		int sum2=0;
		for(int i=0;i<arr2.length;i++)
			sum2=sum2+arr2[i];
		System.out.println("s1 :"+sum2);
		
		System.out.println();
		if(len1>len2)
			System.out.println("STRING STR IS BIGGER");
		else
			System.out.println("STRING S1 IS BIGGER");
		
		/*System.out.println();
		if(sum1>sum2)
			System.out.println("STRING STR IS BIGGER");
		else
			System.out.println("STRING S1 IS BIGGER");*/
		
		System.out.println();
		int pos = str.indexOf(s1);
		System.out.println(pos);
		
		System.out.println();
		boolean res1=str.contains(s1);
		System.out.println("DOES IT CONTAINS THE STRING 01? "+res);//g
	}
}