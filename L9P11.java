/*11) Given a long sequence of limited symbols, Compress the string as
shown in the example
i/p : xxxxxxxgggggggggmmckkkllxx"
o/p : x7g9m2c1k3l2x2 (symbol followed by number of occurrences)*/

public class L9P11
{
	public static void main(String[] args)
	{
		String str="xxxxxxxgggggggggmmckkkllxx";
		int[] num=new int[str.length()];
		
		char[] string=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			num[i]=1;
			for(j = i+1; j < strlen(string); j++) 
			{
				if(string[i]==string[j])
				{
						num[i]++;
						string[j]='0';
				}
			}
		}
		for(int i = 0; i <num.length; i++) 
		{  
            if(string[i] != ' ' && string[i] != '0')  
                System.out.print(string[i] +""+ num[i]);  
		}
	}
}