
interface vehicle1{
	int a=20;//variable are public static final
	public void m1();
	void m2();
}
interface vehicle2{
	int b= 8;
	void m4();
}
abstract class F{
	abstract void m3();
	abstract void m9();
	 void mj(){System.out.println("ggggg");
}

 class L extends F implements vehicle1,vehicle2{

	void m3() {
		System.out.println("m3 method");
		
	}
	void m9() 
	{
		System.out.println("m9 method");
	}

	public void m4() 
	{
		System.out.println("m4");
	}

	public void m1()
	{
		System.out.println("m1");
	}

	public void m2() 
	{
	   System.out.println("m2");
	}}
public static void main (String[] args) {
	
  { 
	L  l1=new  L();
	l1.m1();//L' s execute
	l1.m2();//L's execute
	l1.m3();//L
	l1.m4();//L
	l1.m9();//L
	
}
}}
	

	
	
	
	
	

