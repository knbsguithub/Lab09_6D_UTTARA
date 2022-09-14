public class addComplex
{
	private int real1=0;
	private int img1=0;
	private int real2=0;
	private int img2=0;
	
	public void Complex1(int a,int b)
	{
		real1=a;
		img1=b
	}
	
	public void Complex2(int c,int d)
	{
		real2=c;
		img2=d;
	}
	public void showC()
    {
        System.out.print(real1 + " +i" +img2);
    }
 
	public void add()
	{
		System.out.println();
		int realS = real1+real2;
		int imgS = img1+img2;
		
		System.out.println("SUM:"+realS+"+"+complexS+"i");
	}
	
}