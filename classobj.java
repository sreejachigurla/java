package pack;

public class classobj {
 int n1=14;
  int n2=2;
  int n3=n1+n2;
  public void method1()
  {
	  System.out.println("method 1");
  }
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		classobj obj=new classobj();
		System.out.println(obj.n3);
     obj.method1();
	}

}
