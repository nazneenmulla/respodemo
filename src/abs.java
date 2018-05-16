
abstract public class abs
{
abstract void m1();
abstract void m2();
          void m3()
          {
        	  System.out.println("default method");
          }
          
          
}
  class Q extends abs{

	void m1() {
		System.out.println("implementd method m1");
		
	}

	void m2() {
		System.out.println("implemented method m2");	 
		
	}
	public static void main(String[] args) {
		Q q =new Q();
		//q.m1();
		q .m2();
		q.m3();
	}
}