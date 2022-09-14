/*6) Test swapping of 2 ints using a) temp variable b) addition &
subtraction approach c) swapping using xor (^) approach"*/

public class L9P6
{
	public static void main(String[]  args)
	{
		int a=5,b=7;
		System.out.println("Before swapping:\na:"+a+"\nb:"+b);
		int t=a;
		a=b;
		b=t;
		System.out.println();
		System.out.println("After swapping for 1st time:\na:"+a+"\nb:"+b);
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println();
		System.out.println("After swapping for 2nd time:\na:"+a+"\nb:"+b);
		System.out.println();
		a = a ^ b;  
		b = a ^ b;  
		a = a ^ b;  
		System.out.println("After swapping for 3rd time:\na:"+a+"\nb:"+b);
	}
}