public class TestMath
{
	public static void main(String[] args)
	{
		int a=5,b=55;
		MathFun m1 = new MathFun();
		System.out.println(m1.add(a,b));
		System.out.println("Result for int:"+m1.addInt());
		System.out.println();
		System.out.println("Result for Double:"+m1.addDouble());
		System.out.println();
		
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		Complex c3 = new Complex();
		
		c1.setReal(25);
		c2.setReal(47);
		c1.setImg(6);
		c2.setImg(7);
		
		c3 = m1.addComplexNumber(c1,c2);
		System.out.println(c3.getReal());
		System.out.println(c3.getImg());
		System.out.println(""+c3.getReal()+"+i"+c3.getImg());
	}
}