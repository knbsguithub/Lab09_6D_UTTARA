/*9) Take any number of strings as input from command line. Concat all
of them and print them out.*/
import java.util.*;
public class L9P9
{
	public static void main(String[] args)
	{
		String[] srr=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your strings:");
		for(int i=0;i<srr.length;i++)
		{
			srr[i]=sc.nextLine();
		}
		String res=new String("");
		for(int i=0;i<srr.length;i++)
		{
			res=res+srr[i];
		}
		System.out.println(res);
	}
}