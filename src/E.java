
 abstract class A{ 
	 abstract void m1();
	 abstract void m2();
	void m3()
	{
	System.out.println("m3 method");	
	}
 }
  interface Interface{
	  void m4();
	  void m5();
	  int a=8;
 }
public class E extends A implements Interface{

	void m1()
	{
		System.out.println("hii"); 	
	}
	void m2() 
	{
		System.out.println("hello");
	}
	
	public void m4()
	{
	  System.out.println("m4");
	}

	public void m5()
	{
		System.out.println("m5");
	}
	public static void main(String[] args) {
		E e= new E();
          e.m1();//E
          e.m2();//E
          e.m3();//if its not present in child refrance or child object then parents m3
                    //.. m3 call
           e.m4();//E
          
          e.m5();//E
	}}
