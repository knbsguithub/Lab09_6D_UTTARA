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
		
		public static int add(int a,int b)
		{
			int res=a+b;
			return res;
		}
		
		public static int addInt()
		{
			System.out.println();
			System.out.println("N NUMBER OF INTERGER ADDITIONS");
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of digits:");
			n=sc.nextInt();
			int[] digit=new int[n];
			System.out.println("Enter the digits");
			for(int i=0;i<n;i++)
			{
				System.out.println("digit " +(i+1));
				digit[i]=sc.nextInt();
			}
			int sum=0;
			for(int i=0;i<n;i++)
			{
				sum=sum+digit[i];
			}
			return sum;
		}
		
		public static double addDouble()
		{
			System.out.println();
			System.out.println("N NUMBER OF DOUBLE ADDITIONS");
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of digits:");
			n=sc.nextInt();
			double[] digit=new double[n];
			System.out.println("Enter the digits");
			for(int i=0;i<n;i++)
			{
				System.out.println("digit " +(i+1));
				digit[i]=sc.nextDouble();
			}
			double sum=0;
			for(int i=0;i<n;i++)
			{
				sum=(double)sum+digit[i];
			}
			return sum;
		}
		
		public Complex addComplexNumber(Complex c1,Complex c2)
		{
			Complex temp = new Complex();
			int tempReal,tempImg;
			tempReal = c1.getReal() + c2.getReal();
			tempImg = c1.getImg() + c2.getImg();
			
			temp.setReal(tempReal);
			temp.setImg(tempImg);
			
			return temp;
		}
}