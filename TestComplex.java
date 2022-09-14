public class TestComplex
{
	public static void main(String[] args)
	{
		Complex c1=new Complex();
		Complex c2=new Complex();
		c1.setComplex(20,30);
		c2.setComplex(2,35);
		ComplexNumber s = sum(c1, c2);
		System.out.printf("Sum is: "+ s.real+" + "+ s.img +"i");
	}
	public static Complex sum(Complex c1,Complex c2)
	{
		Complex s = new Complex(0,0);
		int tempreal=c1.getReal()+c2.getReal();
		int tempimg=c1.getImg()+c2.getImg();
		s.setReal(tempreal);
		s.setImg(tempimg);
		return s;
	}
}