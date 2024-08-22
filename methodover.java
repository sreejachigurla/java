package pack;

public class methodover {
	public int add(int c)
	{
		return c;
	}
	public int add(int a, int b)
	{
		return (a+b);
	}
	public int add(int x,int y,int z)
	{
		return x+y;
	}
	public double add(double d,double e) {
		return d+e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodover m1=new methodover();
		System.out.println(m1.add(30));
		System.out.println(m1.add(10,20));
		System.out.println(m1.add(10,10,10));
		System.out.println(m1.add(1.2,1));

	}

}
