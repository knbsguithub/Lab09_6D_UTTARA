/*8) Create a Math class with following methods:
i) Ability to add 2 ints"
ii) Ability to add n ints (take an array of ints as parameter)"
iii) Ability to add n doubles"
iv) Ability to add 2 complex numbers. Create a Complex class with 2 int
instance variables a and b. a represents the real part and b the
imaginary.*/
import java.util.*;
public class MathFun
{
		Scanner sc=new Scanner(System.in);
		public int add(int a,int b)
		{
			int res=a+b;
			return res;
		}
		
		public double addn()
		{
			int n;
			int[] digit;
			System.out.println("Enter the number of digits:");
			n=sc.nextInt();
			System.out.println("Enter the digits");
			for(int i=0;i<n;i++)
			{
				System.out.println("digit  " +i);
				digit[i]=sc.nextInt();
			}
			int sum=0;
			for(int i=0;i<n;i++)
			{
				sum=sum+digit[i];
			}
			return sum;
		}
		public static void main(String[] args)
		{
			int a=5,b=55;
			System.out.println(MathFun.add);
		}
}