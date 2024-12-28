package object;

public class Program5 {

	int l,w,h;
	
	public Program5(int l,int w)
	{
		this.l=l;
		this.w=w;
	}
	public Program5(int l,int w,int h)
	{
		this(l,w);
		this.h=h;
	}
	public void Dimension()
	{
		System.out.println(" lenght"+l);
		System.out.println(" lenght"+w);
		System.out.println(" lenght"+h);
		
	}
	
	
}
